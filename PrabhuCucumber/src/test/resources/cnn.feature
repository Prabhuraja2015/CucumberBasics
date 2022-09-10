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
@CNN
Feature: Checking links of CNN
  I want to use this template for my feature file

  @CNNone
  Scenario: Check top links of cnn
    Given I open browser
    And  I go to site 'http://cnn.com'
    #Then Menu should have links 'World,US politics'   
    Then Menu should have links
    |	Links				|	Title	|
    |	World				|	XYZ		|
    |	US politics	|	TMV		|
    
  @CNNSecond
  Scenario Outline:: Check top links of cnn for many different browser
    Given I want to open '<browser>'
    And  I navigate to site '<URL>'
    #Then Menu should have links 'World,US politics'   
    Then Menu should have links
    |	Links				|	Title	|
    |	World				|	XYZ		|
    |	US politics	|	TMV		|
    Examples: Running site on different browsers
    | browser	|	URL							|
    |	chrome	|	http://cnn.com	|
    |	Edge		| http://cnn.com	|
    |	Firefox	|	http://cnn.com	|
    
    
    
    