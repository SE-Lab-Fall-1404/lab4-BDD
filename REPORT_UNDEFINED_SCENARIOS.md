# Report: Fixing Undefined Scenarios in Scenario Outline

## Problem Description
When running Scenario Outline in Cucumber, some test scenarios may show as "undefined". This typically happens when step definitions cannot be matched to the scenario steps.

## Root Cause
The issue occurs when:
1. Step definition patterns don't match the scenario steps after placeholder substitution
2. The regex patterns in step definitions are too strict or don't account for the parameterized values
3. Package/classpath issues prevent Cucumber from finding step definitions

## Solution
In this project, the step definitions are correctly configured with regex patterns that match both normal scenarios and Scenario Outline:

- `@Given("^Two input values, (\\d+) and (\\d+)$")` - Matches both "Two input values, 4 and 1" and "Two input values, <a> and <b>" (after substitution)
- `@When("^I calculate the square root of division$")` - Matches the When step
- `@Then("^I expect the result (\\d+)$")` - Matches both "I expect the result 2" and "I expect the result <result>" (after substitution)

## Key Points
1. The `^` and `$` anchors ensure exact matching
2. The `(\\d+)` pattern captures integer values from both normal scenarios and Scenario Outline examples
3. All step definitions are in the same package (`calculator`) as the test runner
4. The feature file is correctly placed in `src/test/resources/features/`

## Verification
All scenarios (both normal and outline) should pass when running:
- Individual feature file
- RunnerTest.java
- Maven test command

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
