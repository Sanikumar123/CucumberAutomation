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

 
  @Login_Validation
  Scenario: Validate Homepage lands after login with correct credential
   
    Then Applicaiton Homepage opens and displays message as "This is a demo store. No orders will be fulfilled."

  @Login_Datatable
  Scenario Outline: Validate Homepage lands after login with correct credential
    Given User clicks on Sign In link
    When user Enters <EmailId> and <Password> and Clicks on Sign In button
    Then Applicaiton Homepage opens and displays message as "This is a demo store. No orders will be fulfilled."

    Examples: 
      | EmailId                     | Password   |
      | seleniumtutorial4@gmail.com | Dexter@456 |
      | seleniumtutorial4@gmail.com | Dexter@456 |
