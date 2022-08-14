#Author: ctrl-kay

Feature: Test log out functionality

  @smoke
  Scenario: Check that a user can log out
    Given user is logged in
    And user is on the inventory page
    When user clicks hambuger button
    And the menu is displayed
    And user clicks logout link
    Then the user is logged out
    And redirected to the homepage
