@regression
Feature: To check Topmenu navigation

 Scenario Outline: TopMenu navigation
   Given I am on homepage
   When I mouse hover on "<tab>"
   Then I should navigate successfully on all tabs

   Examples:
   |tab     |
   |Computers|
   |Electronics|



