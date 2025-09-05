package com.iskportal.dedukt.lang.typesystem

import com.iskportal.dedukt.lang.objects.type.DeType

class TypeSystem {
    val subTypeRelation : Map<DeType,Set<DeType>>

    constructor(initialTypes: Set<DeType>) {
        val relation = mutableMapOf<DeType, MutableSet<DeType>>()
        for (type in initialTypes) {
            if (type.upperBound != type) {
                relation.computeIfAbsent(type.upperBound) { mutableSetOf() }.add(type)
            }
            if (type.lowerBound != type) {
                relation.computeIfAbsent(type) { mutableSetOf() }.add(type.lowerBound)
            }
        }
        subTypeRelation = relation
    }

    fun isSubType(sub: DeType, superType: DeType): Boolean {
        if (sub == superType) return true
        val directSubTypes = subTypeRelation[sub] ?: return false
        return directSubTypes.any { isSubType(it, superType) }
    }

    fun isSuperType(superType: DeType, sub: DeType): Boolean {
        return isSubType(sub, superType)
    }

    fun commonSuperType(type1: DeType, type2: DeType): DeType? {
        if (isSubType(type1, type2)) return type2
        if (isSubType(type2, type1)) return type1

        val superTypes1 = getAllSuperTypes(type1).toSet()
        val superTypes2 = getAllSuperTypes(type2).toSet()

        val commonSuperTypes = superTypes1.intersect(superTypes2)

        return commonSuperTypes.minByOrNull { getAllSuperTypes(it).size }
    }

    fun commonSubType(type1: DeType, type2: DeType): DeType? {
        if (isSubType(type1, type2)) return type1
        if (isSubType(type2, type1)) return type2

        val subTypes1 = getAllSubTypes(type1).toSet()
        val subTypes2 = getAllSubTypes(type2).toSet()

        val commonSubTypes = subTypes1.intersect(subTypes2)

        return commonSubTypes.maxByOrNull { getAllSubTypes(it).size }
    }

    fun getAllSuperTypes(type1: DeType): Set<DeType> {
        val result = mutableSetOf<DeType>()
        val directSuperTypes = subTypeRelation.filterValues { it.contains(type1) }.keys
        result.addAll(directSuperTypes)
        for (superType in directSuperTypes) {
            result.addAll(getAllSuperTypes(superType))
        }
        return result
    }

    fun getAllSubTypes(type1: DeType): Set<DeType> {
        val result = mutableSetOf<DeType>()
        val directSubTypes = subTypeRelation[type1] ?: return result
        result.addAll(directSubTypes)
        for (subType in directSubTypes) {
            result.addAll(getAllSubTypes(subType))
        }
        return result
    }
}