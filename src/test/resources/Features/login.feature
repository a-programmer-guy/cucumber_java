# website used for testing is https://www.saucedemo.com/
#Author ctrl-kay
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given a user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then user is redirected to the inventory page
