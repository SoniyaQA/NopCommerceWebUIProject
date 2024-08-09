Feature: registration feature


  Scenario: User should register successful
    Given User is on homepage
    When User click on register button
    Then User should be able to verify the Register Text

  @regression
    Scenario: User should click on I am human
      Given User is on homepage
      When User click on I am Human
      And User click on register button
      Then User should be able to verify the Register Text


