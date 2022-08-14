#Author: ctrl-kay
#Feature: test login on the website https://www.saucedemo.com/
Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And clicks login button
    Then user is redirected to inventory page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
