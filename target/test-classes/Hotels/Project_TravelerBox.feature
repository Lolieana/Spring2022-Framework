@sumOfTheGuests
Feature: Update number of guests on home page


  @verifyMatchingGuestsCount
  Scenario: Verify user can update number of guests on Home page
    Given I am on Hotels main page
    When  I click traveler box
    And  I increase adults number
    And I increase children number
    And I choose first children age
    And I choose second children age
    Then verify  number of guests are matching