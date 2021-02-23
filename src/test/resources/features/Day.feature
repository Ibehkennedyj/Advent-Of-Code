# Created by Kennedy at 2/16/2021
Feature: DayFeature
  This feature will define how a day will run and provide solution

  Scenario: Day 0
    When I provide a number 0
    Then check that the input for the number exists
    And check that the solution has been provided
    And check that the solution provider has been implemented
    And check that the solutions provided is correct

  Scenario: Day 1 with multiple test with same answer
    When I provide a number 1
    And provide inputs
      | input |
      | ()()  |
      | (())  |
    Then check that the solution is '0'