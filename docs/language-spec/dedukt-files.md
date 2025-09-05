# Dedukt File Formats
Dedukt source codes are generally categorized into two types: Dedukt package files and Dedukt script files. Developers and researchers can utilize these files to create and manage Dedukt projects effectively.

The main difference between these categories lies in their intended use and structure:
1. **Package** files are designed to encapsulate reusable code, definitions, and functionalities that can be shared across multiple projects. They typically contain modules, classes, and functions that can be imported and utilized in other Dedukt scripts or packages.
2. **Script** files, on the other hand, are intended for executing specific tasks or computations. They often contain a sequence of instructions or commands that perform a particular operation or analysis.

## Packages
Packages in dedukt are collections of files, reusable codes, definitions, and functionalities that can be shared across multiple projects. They typically contain modules, classes, and functions that can be imported and utilized in other Dedukt scripts or packages. To get started with packages, you can create a new package using the Dedukt command-line interface (CLI) or an integrated development environment (IDE) that supports Dedukt.

```shell
dedukt init-package MyPackage
```

This command will create a new directory named `MyPackage` with the necessary structure for a Dedukt package. Inside this directory, you can create Dedukt source files with the `.dkt` extension to define your modules, classes, and functions. If you've created a package with Gradle as the build system you would have the following tree for a Dedukt package:

```
MyPackage/
├── build.gradle.kts
├── settings.gradle.kts
├── src/main/
│   ├── dedukt/
│   │   ├── MyModule.dkt
│   │   └── AnotherModule.dkt
│   └── resources/
└── README.md
```

It is recommended to use Gradle as the build system for managing dependencies, building, and testing your Dedukt packages. You can define your package's dependencies in the `build.gradle.kts` file and use Gradle tasks to compile and run your code.

Package files `dkt` contain package declaration at the top of the file:

```dedukt
package MyPackage
```

or if you have a group defined in your `build.gradle.kts` file:

```dedukt
package com.example.MyPackage
```

The starting point for a Dedukt package is the `main` function, which serves as the entry point for execution. You can define the `main` function in one or multiple of your source files as follows:

```dedukt
fun main () {
    // Your code here
}
```

## Scripts
Scripts in Dedukt are files that contain a sequence of instructions or commands to perform specific tasks or computations. They are typically used for executing analyses, simulations, or other operations that require a series of steps. To create a Dedukt script, you can simply create a new file with the `.dkt` extension and write your code in it. For example, you can create a file named `MyScript.dkt` with the following content:

```dedukt
// MyScript.dkt
import dedukt.standard.*

