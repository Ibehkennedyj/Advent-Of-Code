# Created by Kennedy at 2/16/2021
Feature: DayFeature
  This feature will define how a day will run and provide solution

  Scenario: Day 0
    Given I set the active day as 0
    Then process properties
    Then load the input
    And load the solutions
    And load the solution implementation
    And check that the solutions provided is correct

  Scenario Outline: Day 1 with different input and different answers
    Given I set the active day as 1
    Given I set the active year as 2015
    Then load the solution implementation
    And confirm that <input> will return <answer>
    Examples:
      | input   | answer |
      | )())()) | -3     |
      | )))     | -3     |
      | ))(     | -1     |
      | ())     | -1     |
      | ))((((( | 3      |
      | (()(()( | 3      |
      | (((     | 3      |
      | ()()    | 0      |
      | (())    | 0      |