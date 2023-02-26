

Feature: Home Quote Testing
  I want to use this template for my feature file

	Background:
	* this is quote test

  @smoke
  Scenario: Create A Home Quote
    Given Click Home Lob button
    When Insert Zip Code '10467'
    And Click Start New Quote button2
    Then Validate Home Quote Page Title "Let's Get Started!"
    When Insert Location '3106 Decatur Ave'
    And Insert Unit Number '34B'
    And Click Next button

  @dataDriven @csr-247 @regression2
  Scenario Outline: Home Quote With <zipCode>,<aptNo>
    Given Click Home Lob button
    When Insert Zip Code2 <zipCode>
    And Click Start New Quote button2
    Then Validate Home Quote Page Title "Let's Get Started!"
    When Insert Location '3106 Decatur Ave'
    And Insert Unit Number <aptNo>
    And Click Next button

    Examples: 
      | zipCode | aptNo |
      | '10467' | '32B' |
      | '10462' | '34A' |
      | '10468' | '48C' |
