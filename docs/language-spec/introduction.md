# Introduction

Dedukt is a programming language designed to facilitate symbolic manipulation and logical reasoning. It combines elements of functional programming, type theory, and object-oriented programming to provide a powerful and flexible environment for developers and researchers.

In this document, we will cover language specification and syntax of Dedukt, including its core features, data types, control structures, and more.

## Overview
Dedukt is built around the following key concepts:
1. Clean and expressive syntax.
2. Strong static typing with type inference.
3. First-class functions and higher-order functions.
4. Structured declarations for mathematical objects.

We believe that having these features is necessary for computational mathematics in both, numerical and algebraic domains. Exploring mathematical objects and their properties is a key aspect of Dedukt. 

## Language Syntax
Dedukt takes a huge inspiration from Kotlin programming language. If you are familiar with Kotlin, you will find Dedukt's syntax quite similar and easy to learn. Here are some of the basic syntax elements of Dedukt:
- **Comments**: Single-line comments start with `//`, and multi-line comments are enclosed within `/*` and `*/`.
- **Variables**: Variables are declared using the `val` (immutable) or `var` (mutable) keywords.
- **Functions**: Functions are defined using the `fun` keyword, followed by the function name, parameters, and return type.
- **Control Structures**: Dedukt supports standard control structures such as `if`, `else`, `when` (similar to switch), `for`, and `while`.
- **Packages and Imports**: Code can be organized into packages, and external packages can be imported using the `import` keyword.

Some extensions to the Kotlin syntax have been made to accommodate the needs of symbolic computation and logical reasoning. These extensions will be covered in detail in the subsequent sections of this document.