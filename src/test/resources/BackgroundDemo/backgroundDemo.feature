#Author: ctrl-kay
# Given and When steps are the same in both scenerios, background would be useful here
Feature: Check homepage functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to inventory page


  Scenario: check logout link
    When user clicks hamburger dropdown
    And logout link is displayed
    Then user clicks logout link

  Scenario: verify about link is present
    And about link is displayed
    Then user clicks about link
