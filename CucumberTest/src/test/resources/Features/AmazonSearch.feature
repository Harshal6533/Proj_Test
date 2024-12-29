Feature: 

  Background: 
    Given browser is open
    And user navigates to "https://amazon.in"

  Scenario: Search apple product on amazon
    When user enter "apple" is search bar
    And hits enter
    Then user navigates to search result

  Scenario: Search Samsung product on amazon
    When user enter "Samsung" is search bar
    And hits enter
    Then user navigates to search result
