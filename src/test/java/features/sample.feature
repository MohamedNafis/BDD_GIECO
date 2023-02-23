Feature: Home Quote Testing
  I want to use this template for my feature file

  @home
  Scenario: Create A Home Quote
    Given Click Home Lob button
    When Insert Zip Code
    And Click Start New Quote button
    Then Validate Home Quote Page Title
    When Insert Location
    And Insert Unit Number
    And Click Next button
