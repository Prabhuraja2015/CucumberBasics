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
@Buycomputer
Feature: Buying a computer
  I want to use this template for my feature file
  
  Background: Buying a Dell PC
  Given I want to buy a PC
  And PC should be from Dell

  @BuyingDesktops
  Scenario: Buying Desktops          
    When select the monitor size as 15 inch
    And a 'carbon' finish
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  @Buyinglaptop
  Scenario Outline: Buying laptop    
    When select the monitor size as 12 inch   
    And a 'sleak silver' finish
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
