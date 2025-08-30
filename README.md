# DeduKt Language of Reasoning

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Version](https://img.shields.io/badge/version-0.0.1--SNAPSHOT-orange)](https://github.com/iskdevelop/dedukt-language)
[![Kotlin](https://img.shields.io/badge/kotlin-2.0.20-blue.svg)](https://kotlinlang.org)
[![JVM](https://img.shields.io/badge/JVM-21-red.svg)](https://openjdk.org)

> A modern, open-source symbolic reasoning and computer algebra system built on Kotlin

## Overview

DeduKt is a revolutionary approach to symbolic computation and mathematical reasoning, designed to address the fundamental limitations of existing computer algebra systems. This repository contains the core language implementation: the kernel, interpreter, compiler, parser, and lexer that power DeduKt's symbolic reasoning capabilities.

Built from the ground up with modern software engineering principles, DeduKt combines mathematical rigor with performance excellence, providing a statically-typed, compiled foundation for advanced symbolic computation. The system bridges the gap between mathematical expressiveness and computational efficiency through its innovative multi-paradigm design.

## Key Features

### 🔬 **Mathematical Correctness by Design**
- Advanced type system that encodes mathematical structures
- Compile-time prevention of mathematical errors
- Support for abstract algebraic structures (groups, rings, fields)
- Formal verification capabilities

### ⚡ **High-Performance Architecture**
- Compiled JVM execution for superior performance
- Integration with [Kompute](https://github.com/iskdevelop/kompute) for numerical computation
- Optimized memory management for symbolic expressions
- Parallel computation support

### 🛠 **Modern Development Experience**
- Full Language Server Protocol (LSP) support
- Static type safety with intelligent error detection
- Seamless IDE integration (IntelliJ IDEA, VS Code)
- Clean, mathematically-motivated syntax

### 🔧 **Extensible Architecture**
- Object-oriented design for mathematical structures
- Plugin system for domain-specific extensions
- Modular architecture with clear dependencies
- ANTLR-based grammar for flexible parsing

## Architecture

DeduKt implements a sophisticated three-tier interface system:

- **DeduKt Kotlin Form**: Native Kotlin integration for developers
- **DeduKt Pure Form**: Mathematical DSL for domain experts
- **DeduKt Free Form**: Interactive notebook environment for education

This repository focuses on the core language implementation that powers all three forms, providing the foundational symbolic reasoning engine.

## Project Status

**Current Version**: 0.0.1-SNAPSHOT (Development)  
**Target Release**: 0.1.0 (Late 2024)

The project is currently in active development, with the language kernel being tested and expanded. The first stable release (0.1.0) will mark the initial public availability of the core symbolic reasoning capabilities.

## Technical Requirements

- **JVM**: OpenJDK 21 or higher
- **Kotlin**: 2.0.20
- **Build System**: Gradle with Kotlin DSL
- **Grammar**: ANTLR4 for parsing

## Related Projects

DeduKt is part of a comprehensive mathematical computation ecosystem:

- **[Kompute](https://github.com/iskdevelop/kompute)**: High-performance numerical computation library
- **[DeduKt Ecosystem](https://github.com/iskportal)**: Complete system including LSP, notebook interface, and documentation

## Philosophy

DeduKt addresses critical limitations in current symbolic computation systems:

- **Proprietary Barriers**: Eliminates cost and transparency issues through open-source design
- **Performance Bottlenecks**: Provides compiled execution instead of interpreted overhead
- **Type Safety Gaps**: Prevents runtime errors through mathematical type verification
- **Development Experience**: Offers modern tooling with full LSP support
- **Educational Access**: Removes economic barriers to mathematical computation tools

## Community & Contribution

DeduKt is developed by the **Independent Society of Knowledge** as a community-driven project.

### Current Contribution Policy
For the 0.0.1-SNAPSHOT development phase:
- ✅ **Issues**: We welcome bug reports, feature requests, and discussions
- ❌ **Pull Requests**: Not accepting PRs until version 0.1.0 release
- 📧 **Contact**: Direct inquiries to [thisismeamir@outlook.com](mailto:thisismeamir@outlook.com)

### Future Contributions
Starting with version 0.1.0, we will welcome community contributions including:
- Mathematical structure implementations
- Algorithm optimizations
- Language feature enhancements
- Documentation improvements

## Development Team

**Lead Developer**: [Amir H. Ebrahimnezhad](mailto:thisismeamir@outlook.com)  
**Organization**: [Independent Society of Knowledge](https://github.com/iskportal)  
**Development Team**: [ISK Develop](https://github.com/iskdevelop)

## Vision

DeduKt aims to become the foundation for next-generation mathematical computation by:

- Unifying symbolic and numerical computation in a coherent framework
- Providing accessible, high-quality mathematical tools to global communities
- Enabling reproducible mathematical research through open-source transparency
- Supporting advanced mathematical education through intuitive interfaces
- Fostering collaborative development of mathematical algorithms and structures

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

---

> *"Advancing computational mathematics through open collaboration and modern software design"*  
> — Independent Society of Knowledge