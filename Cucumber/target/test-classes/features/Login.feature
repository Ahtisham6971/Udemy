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

Feature: Application Login

#Background:                          #Background is for pre requisite & should always on the top & pre requisite must be same for all scenario
#Given validate the browser
#When Browser is trigged
#Then check if Browser is started

# We cant use background & hooks together if we are dealing with same application then use background otherwise hooks

@RegTest @SmokeTest
Scenario: Home page default login
Given User is on netbanking landing page
When User login into with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on netbanking landing page
When User login into with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario: Home page default login
Given User is on netbanking landing page
When User sign up with following details
|jenny|abcd|john@abcd.com|Australia|3242353|

Then Home page is populated
And Cards displayed are "false"


## for Parameterization Scenario with outline is mandatory
@MobileTest
Scenario Outline: Home page default login
Given User is on netbanking landing page
When User login into application with <Username> and password <password>
Then Home page is populated
And Cards displayed are "false"

Examples:                   ## Examples is mandatory for parameterization
|Username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|
|user4|pass4|











