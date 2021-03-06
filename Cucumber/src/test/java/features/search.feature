Feature: Search and place order for vegetables

@SmokeTest
Scenario: Search for items and validate results
Given User is on GreenKart Landing page
When User Searched for Cucumber vegetable 
Then "Cucumber" results are displayed

@RegressionTest
Scenario Outline: Search for items and then move to checkout page
Given User is on GreenKart Landing page
When User Searched for <Name> vegetable
And Added items to cart
And User proceeded to checkout page
Then verify selected <Name> are displayed in checkout page

Examples:                   ## Examples is mandatory for parameterization
|Name		|
|Beetroot|
|Brinjal|
