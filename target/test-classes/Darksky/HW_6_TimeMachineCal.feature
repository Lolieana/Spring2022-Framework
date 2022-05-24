Feature: Darksky timeMachine


  Scenario: Verify the current date is highlighted in Time Machine's calendar
    Given I am on darksky home page
    When I scroll down to the bottom of the page
    And I click on Time Machine button
    Then I verify today day is highlighted