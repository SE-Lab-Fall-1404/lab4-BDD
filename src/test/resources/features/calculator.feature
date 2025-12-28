@calculator
Feature: Calculator - Square Root Division

  Scenario: Calculate square root of division of two numbers
    Given Two input values, 4 and 1
    When I calculate the square root of division
    Then I expect the result 2

  Scenario: Calculate square root of division with different values
    Given Two input values, 36 and 4
    When I calculate the square root of division
    Then I expect the result 3

  Scenario Outline: Calculate square root of division for multiple test cases
    Given Two input values, <a> and <b>
    When I calculate the square root of division
    Then I expect the result <result>

    Examples:
      | a  | b | result |
      | 4  | 1 | 2      |
      | 36 | 4 | 3      |
      | 16 | 4 | 2      |
      | 9  | 1 | 3      |
      | 25 | 1 | 5      |
      | 1  | 1 | 1      |
