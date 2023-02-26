Feature: Auto Quote Testing
  I want to use this template for my feature file

  @smoke1
  Scenario: Create A Auto Quote
    Given Click Car Lob button
    And Click Start New Quote button1
    When Insert Zip Code1 '10467'
    And Click Continue button
    Then Validate About You Page Title 'About You'
    When Insert Date Of Birth '10/10/1990'
    And Click Next button1
    And Ckick Next button2
    And Insert First Name 'Jon'
    And Insert Last Name 'Son'
    And Click Next button01
    And Click Next button02
    And Insert Address '3106 Decatur Ave'
    And Insert Apt Number '34B'
    And Click Next button3
    Then Validate Vehicle Details Page Title 'Vehicle Details'
    When Click Alert Close button
    And Click Vehicle Year Select '2023'
    And Click Vehicle Make Select 'Subaru'
    And Click Vehicle Model Select 'Ascent Touring'

  @dataDriven @csr-420 @regression1
  Scenario Outline: Create A Auto Quote <zipCode>,<dOB>,<fN>,<lN>,<address>,<apt>
    Given Click Car Lob button
    And Click Start New Quote button1
    When Insert Zip Code1 <zipCode>
    And Click Continue button
    Then Validate About You Page Title 'About You'
    When Insert Date Of Birth <dOB>
    And Click Next button1
    And Ckick Next button2
    And Insert First Name <fN>
    And Insert Last Name <lN>
    And Click Next button01
    And Click Next button02
    And Insert Address <address>
    And Insert Apt Number <apt>
    And Click Next button3
    Then Validate Vehicle Details Page Title 'Vehicle Details'
    When Click Alert Close button
    And Click Vehicle Year Select '2023'
    And Click Vehicle Make Select 'Subaru'
    And Click Vehicle Model Select 'Ascent Touring'

    Examples: 
      | zipCode | dOB             | fN     | lN        | address                  | apt    |
      | '10467' | '10/10/1990' | 'Jon'  | 'Son'    | '3106 Decatur Ave'  | '31A'  |
      | '10467' | '09/09/1988' | 'Roy'  | 'Don'    | '3106 Decatur Ave'  | '45D ' |
      | '10469' | '05/05/1972' | 'Bobi' | 'Rimon' | '1141 Allerton Ave'  | '20B'  |
