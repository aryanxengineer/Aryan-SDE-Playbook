# Java Fundamentals

### 1. JDK vs JRE vs JVM

> Java Development Kit is a software development kit used to develop Java applications. It provides compiler **javac**, JRE and debugging tools. Used by developer to write, compile and debug the Java applications.

> Java Runtime Environment is a software package that provides JVM **Java Virtual Machine**, class libraries and other components to run Java applications. Used by end users to run Java applications without needing development tools.

> Java Virtual Machine is a virtual abstract machine that provides an environment to execute Java bytecode.

#### Why Java is platform independent ?
> Java code compiles into bytecode not in machine code. Java bytecode can run on any machine that has JVM. JVM implementations exist for Linux, Windows, and macOS, the same java program can run on different platforms without modification. This is why java is called "Write Once Run Anywhere". 

### 2. Compilation and Execution Flow

- Java source code is compiled into bytecode by the Java compiler (javac).
- When we run the Java program, the OS starts a JVM process.
- Inside that process, the JVM loads bytecode using the ClassLoader and executes it using the Interpreter and JIT compiler.
- The JVM creates and manages Java runtime threads as needed.
- The OS schedules the native threads for CPU execution and manages system resources.
- The CPU executes the native machine instructions.


### 3. Variables
> Variable is name of memory location used like a container to store value during Java program execution.

- **Local Variable:** Local variable is declared inside the method including parameters that receive values when the method is called.

- **Instance Variable:** An Instance variable is declared inside the class but outside methods, and it stores data specific to each object.

- **Static Variable:** A static variable is declared inside a class using the static keyword and is shared among all objects of that class.


### 4. Data Types
> Datatype specify different sizes and values that can be stored in the variable and constant.

- **Primitive:** Non-numeric type (boolean and char) and Numeric type [ Integer (byte, short, int, long) and Floating point (float and double) ]
- **Non-primitive:** Classes, String, Arrays, Objects, Enums, Record and Interfaces.



### 5. Operators
> An operator in Java is a symbol that perform operations on variables and values.

```
Unary Operator → ( ++,  - - )
Arithmetic Operators → ( +,  -,  *,  /,  % )
Shift Operators → ( <<,  >>,  >>>)
    `<<` → All of the bits shift to left by a given number using this operator.
    `>>` → All of the bits shift to right by a given number using this operator.
    `>>>` → It is similar to the right shift operator (signed). However, the vacant leftmost position is occupied with 0 in place of the signed bit
Relational Operators → ( <,  >,  ≤,  ≥,  ==, ≠ )
Bitwise Operators → ( |,  &,  ^,  ~ )
Logical Operators → ( &&,  ||,  ! )
Ternary Operator → (  ? :  )
Assignment Operators → ( =,  +=,  *=,  /=,  %= )                                                                                                         
```

### 6. Type Casting
> Typecasting is a fundamental concept that allows developers to convert data from one type to another type.

- **Widening:** Also known as implicit, done by automatically by the compiler. 
- **Narrowing:** Also known as explicit, done by programmers manually.


### 7. Arrays
> An array is an object used to store multiple values of same type in contiguous memory. Arrays are fixed size in Java. MultiDimensional arrays in java are used to store data in rows and column.


### 8. Methods
> A method is a block of code that performs a specific task when called. Methods can be static or non-static. 

### 9. Constructor
> A constructor is a special member of a class that has the same name as the class and is used to initialize objects.In Java, constructors are commonly classified as default, parameterized, and copy constructors.


### 10. this keyword
>  In java, this is a special keyword refers to the current object inside class. Using this we can also call another constructor without creating new object.


### 11. static keyword
> In Java, static keyword is mainly used for memory management. We can apply with methods, variables, blocks and nested classes. Static keyword belong to the class than an instance of class. Static methods cannot use non-static data members or call any non-static method.


### 12. final keyword
