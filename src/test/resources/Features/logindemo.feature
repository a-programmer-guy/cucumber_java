#Author: ctrl-kay AKA a-programmer-guy
#Feature: test login on the website https://www.saucedemo.com/
@smokefeature
Feature: Test login functionality

  @smoketest
  Scenario: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And clicks login button
    Then user is redirected to inventory page
