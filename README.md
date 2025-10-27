# NAU Kotlin Lab 1

## Project Description

This is a Kotlin programming lab project from NAU (National Aviation University). It contains a basic Kotlin application demonstrating fundamental programming concepts.

## Program Functionality

The main program (`src/Main.kt`) demonstrates:

1. **Variable Declaration**: Creates a string variable named `name` with the value "Kotlin"
2. **String Concatenation**: Prints a greeting message by concatenating strings
3. **Loop Structure**: Uses a `for` loop to iterate through a range (1 to 5)
4. **String Interpolation**: Demonstrates Kotlin's string template feature using `$i` to insert variable values

### Output

When executed, the program produces the following output:

```
Hello, Kotlin!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## How to Run

To run this Kotlin program:

1. Ensure you have Kotlin installed on your system
2. Navigate to the project directory
3. Compile and run the program using:
   ```bash
   kotlinc src/Main.kt -include-runtime -d Main.jar
   java -jar Main.jar
   ```

Alternatively, if using IntelliJ IDEA:
- Open the project in IntelliJ IDEA
- Click the Run button or press the Run shortcut
- The output will appear in the console

## Project Structure

```
NAU-kotlin-lab1/
├── src/
│   └── Main.kt       # Main Kotlin source file
├── .gitignore        # Git ignore configuration
└── README.md         # This file
```

## Learning Objectives

This lab introduces:
- Basic Kotlin syntax
- Variable declarations
- String operations
- Control flow (loops)
- Console output using `println()`
