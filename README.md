# Software Engineering (ISE) Winter Semester 2026/27

This repository contains the examples for the lecture on Java and Kotlin. The Java examples hold the code of the Java
slides, from packages and static members to reflection and synchronized methods, and use the compact source files and
instance `main` methods of JDK 25. The Kotlin examples follow the
[Kotlin tour](https://kotlinlang.org/docs/kotlin-tour-welcome.html) that the slides use, and two examples show how Java
and Kotlin code call each other.

## Setup

The project needs the Temurin JDK 25 and Gradle 9.8. Gradle downloads the Kotlin compiler during the build, so you do
not need to install Kotlin. The easiest way to install both tools in the right versions is [mise](https://mise.jdx.dev),
which reads them from [`mise.toml`](mise.toml). In the repository directory, allow mise to use this file:

```shell
mise trust
```

Then install the tools:

```shell
mise install
```

Without shell activation, prefix each command with `mise exec --`, as in `mise exec -- gradle build`.

The project does not use the Gradle wrapper, so IntelliJ IDEA has to use the Gradle installation from mise. Otherwise,
IntelliJ generates a wrapper with its bundled Gradle version and warns that this version is outdated. Open the
repository directory in IntelliJ, go to Settings | Build, Execution, Deployment | Build Tools | Gradle, select "Local
installation", and set the path to the Gradle home in the mise installation directory. `mise where gradle` prints the
installation directory, and the Gradle home is its subdirectory `gradle-9.8.2`, as in
`/Users/<name>/.local/share/mise/installs/gradle/9.8.2/gradle-9.8.2` on macOS. Then reload the Gradle project and run an
example with the run icon next to its `main` function.

## Running the examples

`gradle run` runs `de.seuhd.teaching.intro.Main`. To run another example, pass its main class:

```shell
gradle run -PmainClass=de.seuhd.teaching.intro.kotlin.BasicsKt
```

Kotlin compiles the top-level functions of a file such as `Basics.kt` into a class named `BasicsKt`. Java can also run
a single source file without a build, such as the "Hello, World!" program `src/main/java/Main.java`, a compact source
file (JEP 512) in the unnamed package:

```shell
java src/main/java/Main.java
```

## Examples

The other examples are in the package `de.seuhd.teaching.intro` and its subpackages. The Java files are in
`src/main/java/de/seuhd/teaching/intro/` and the Kotlin files in `src/main/kotlin/de/seuhd/teaching/intro/`. The table
gives the files relative to these directories and the main classes relative to the package.

| File | Main class | Content |
|---|---|---|
| `Main.java` | `Main` | Packages, imports, and static members of `util.Helper` |
| `passing/PassByValue.java` | `passing.PassByValue` | Pass-by-value: a method that assigns a new object to its parameter |
| `boxing/BoxingExample.java` | `boxing.BoxingExample` | Autoboxing and unboxing |
| `boxing/ListExample.java` | `boxing.ListExample` | Autoboxing in a generic list, and an array of primitives |
| `control/SwitchExample.java` | `control.SwitchExample` | A `switch` expression with multiple case labels |
| `inheritance/InheritanceExample.java` | `inheritance.InheritanceExample` | Inheritance, virtual methods, and interfaces with a default method |
| `functional/LambdaExample.java` | `functional.LambdaExample` | An anonymous class and a lambda expression for the same interface |
| `functional/StreamExample.java` | `functional.StreamExample` | A stream pipeline with `filter` and `map` |
| `records/RecordExample.java` | `records.RecordExample` | A record and the class that it replaces |
| `annotations/AnnotationExample.java` | `annotations.AnnotationExample` | A custom annotation, read at runtime through reflection |
| `reflection/ReflectionExample1.java` | `reflection.ReflectionExample1` | The public methods that a class declares |
| `reflection/ReflectionExample2.java` | `reflection.ReflectionExample2` | A call of a private method |
| `inference/VarExample.java` | `inference.VarExample` | Local variable type inference with `var` |
| `optional/OptionalExample.java` | `optional.OptionalExample` | `Optional` instead of a null reference |
| `concurrency/SynchronizedExample.java` | `concurrency.SynchronizedExample` | Synchronized methods and a synchronized block |
| `kotlin/Basics.kt` | `kotlin.BasicsKt` | Variables, string templates, types at runtime, `Any`, and `Unit` |
| `kotlin/Collections.kt` | `kotlin.CollectionsKt` | Lists, sets, and maps |
| `kotlin/ControlFlow.kt` | `kotlin.ControlFlowKt` | `if` and `when` as statements and expressions, `when` without a subject, ranges, and loops |
| `kotlin/Functions.kt` | `kotlin.FunctionsKt` | Default and named arguments, single-expression functions, lambdas, function types, and trailing lambdas |
| `kotlin/Classes.kt` | `kotlin.ClassesKt` | Classes, data classes, and operator overloading |
| `kotlin/NullSafety.kt` | `kotlin.NullSafetyKt` | Nullable types, safe calls, the Elvis operator, and the not-null assertion operator `!!` |
| `kotlin/DataClasses.kt` | `kotlin.DataClassesKt` | Data classes: generated `toString`, `equals`, `copy`, and destructuring |
| `kotlin/Inheritance.kt` | `kotlin.InheritanceKt` | Final and `open` classes, overriding, and a `sealed` class with an exhaustive `when` |
| `kotlin/Interfaces.kt` | `kotlin.InterfacesKt` | Interfaces with an abstract property and default implementations |
| `kotlin/Generics.kt` | `kotlin.GenericsKt` | A generic class, a generic function with an upper bound, and variance |
| `kotlin/ClassDelegation.kt` | `kotlin.ClassDelegationKt` | Class delegation with `by` |
| `kotlin/PropertyDelegation.kt` | `kotlin.PropertyDelegationKt` | The `lazy` property delegate and the same behavior with a getter written by hand |
| `kotlin/CompanionObjects.kt` | `kotlin.CompanionObjectsKt` | A companion object with a constant and a factory function |
| `kotlin/Extensions.kt` | `kotlin.ExtensionsKt` | An extension function on `String` |
| `kotlin/ScopeFunctions.kt` | `kotlin.ScopeFunctionsKt` | One example for each scope function: `let`, `with`, `run` (with and without an object), `apply`, and `also` |
| `interop/KotlinCallsJava.kt` | `interop.KotlinCallsJavaKt` | Kotlin code that uses Java static members, fields, getters and setters, and platform types |
| `interop/JavaCallsKotlin.java` | `interop.JavaCallsKotlin` | Java code that uses Kotlin properties, a data class, an extension function, a companion object, and null checks |

The slide "Access Modifiers" shows a package-private `Helper`. To see the compiler error from that slide, remove
`public` from `class Helper` in `util/Helper.java` and compile the two Java files:

```shell
javac -d build/javac src/main/java/de/seuhd/teaching/intro/Main.java src/main/java/de/seuhd/teaching/intro/util/Helper.java
```

`javac` reports that `Helper` is not public in `de.seuhd.teaching.intro.util` and cannot be accessed from outside the
package. Add `public` again afterward.
