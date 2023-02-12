#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Validate Luma Application Loginpage

  Scenario: Validate Wishlist product appears same as added in the Homepage
    Given User searches product "shirt" in the search bar
    When selects size and color
    And Clicks on Heart symbol
    Then Wishlist page opens and displays same added shirt

  Scenario: Validate Homepage lands after login with correct credential
    Then Applicaiton Homepage opens and displays message as "This is a demo store. No orders will be fulfilled."
