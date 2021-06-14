#Author: mwalsh@qa.com

Feature: Can calculate addition and subtraction correctly?
  To test whether addition and subtraction return the correct
  results.

  Scenario: 3 add 4 is 7
    Given a calculator
    When 3 and 4 are added
    Then the result should be 7

  Scenario: 4 subtract 3 is 1
    Given a calculator
    When 3 is subtracted from 4
    Then the result should be 1
    
 Scenario: 3 multiplied 4 is 12
    Given a calculator
    When 3 and 4 are multiplied
    Then the result should be 12

  Scenario: 12 divided 3 is 4
    Given a calculator
    When 12 is divided by 3
    Then the result should be 4
    