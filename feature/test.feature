@getmethod
Feature: GETmethod

Scenario: 01 Test GET to get list of users
Given I hit the get method to get list of users
Then I verify the count 
Then I verify the list of user details are correct


Scenario: 02 Update one user
Given: I hit the PUT method
Then I verify the details have been updated 

Scenario: 03 post method 
Given I hit POST to create an user 
Then I verify the user is created 

Scenario: 04 delete method 
Given I hit Delete 
Then I verify the created user is no more 

Scenario: 05 get single user
Given I hit get method for one user
Then I verify the details of user have been fetched
