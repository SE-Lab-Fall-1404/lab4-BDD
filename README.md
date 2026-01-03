# Lab 4 - BDD (Behavior Driven Development)

## Project Description
This project implements a calculator that calculates the square root of division: `result = sqrt(a/b)`

## Examples
- a=4, b=1, result=2
- a=36, b=4, result=3

## Project Structure
```
lab4-BDD/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── calculator/
│   │           └── Calculator.java
│   └── test/
│       ├── java/
│       │   └── calculator/
│       │       ├── MyStepdefs.java
│       │       └── RunnerTest.java
│       └── resources/
│           └── features/
│               └── calculator.feature
└── README.md
```

## How to Run

### Prerequisites
- Java JDK 8 or higher
- Maven 3.x
- IntelliJ IDEA (recommended)

### Running Tests

1. **Using IntelliJ IDEA:**
   - Right-click on `calculator.feature` file → Run
   - Or right-click on `RunnerTest.java` → Run

2. **Using Maven:**
   ```bash
   mvn test
   ```

3. **Using Command Line:**
   ```bash
   mvn clean test
   ```

## Features
- Normal scenarios for individual test cases
- Scenario Outline for multiple test cases with data tables
- Step definitions using Cucumber
- JUnit test runner

## Dependencies
- JUnit 4.12
- Cucumber Java 1.2.5
- Cucumber JUnit 1.2.5

## Test Cases Covered
- Normal scenario: a=4, b=1, result=2
- Normal scenario: a=36, b=4, result=3
- Scenario Outline with 6 examples:
  - a=4, b=1, result=2
  - a=36, b=4, result=3
  - a=16, b=4, result=2
  - a=9, b=1, result=3
  - a=25, b=1, result=5
  - a=1, b=1, result=1
