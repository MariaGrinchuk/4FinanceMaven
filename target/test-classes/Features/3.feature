Feature: API Test and Comparison

  Scenario: User should be able to go to the staring page and login.

    Given User is at the Account Page
    When Go to the Game Page
    And Check that Language Dependence Parameter is present on the page
    And Open the Language dependence Window
    And Call API to see the most voted Board game
    Then Compare results with the page
