#Author: ctrl-kay
Feature: Check login functionality

	@smoke
  Scenario Outline: Check login functionality with valid credentials
    Given user is on login page
    When users enters valid <username> and <password>
    And clicks the login button
    Then user is navigated to the inventory page

  Scenario Outline: Second scenerio in test
    Given user is
    When users enters 
    And clicks the 
    Then user is 

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
