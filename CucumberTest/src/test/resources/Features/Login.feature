@SmokeScenario
Feature: feature ti test login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters UserName and Password
    And Clicks on Login button
    Then user is navigated to the home page

