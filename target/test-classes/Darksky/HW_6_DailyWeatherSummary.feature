Feature: Darksky dailyWeatherSummary


  Scenario: Verify same temp values are displayed in the Today's data
    Given I am on darksky home page
    When  I scroll down to daily weather summary
    And I click on daily weather summary bar
    Then I verify low temps are equals and high temps are equals