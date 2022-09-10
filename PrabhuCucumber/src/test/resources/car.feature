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
@CarTrading
Feature: Car Trading
  I want to buy and sell a car

  @BuyCar
  Scenario: Buying a second hand car
    Given I want to buy 1 car    
    And Car shape is 'rectangle'   
    And Car should be from Hyundai
    And car can be yellow,red,green in color
    And car showroom address is 12th,Avenue street,Delhi

