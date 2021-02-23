# Created by Kennedy at 2/16/2021
Feature: DayFeature
  This feature will define how a day will run and provide solution

  Scenario: Day 0
    Given I set the active day as 0
    Then load the input
    And load the solutions
    And load the solution implementation
    And check that the solutions provided is correct