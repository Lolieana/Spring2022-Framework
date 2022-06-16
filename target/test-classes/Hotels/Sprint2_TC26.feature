@dealsPageLinks
Feature: deals page

  Background:
    Given I am on Hotels main page
    When  I click more travel
    And  I click on deals


    @manageYourBookingAnyWhereLink
  Scenario: Verify manage your booking any time any where link on Deals page is displayed
    Then verify manage your booking link is displayed

  Scenario: Verify manage your booking any time any where link on Deals page is enabled
    Then verify manage your booking link is enabled

  Scenario: Verify “Search, book and Save on the go!” title is displayed
    And I click manage your booking
    Then verify title is displayed




    @stayFlexibleWithFreeCancellationLink
  Scenario: Verify “Stay Flexible with free cancellation” is displayed on Deals page
    Then verify stay flexible link is displayed

  Scenario: Verify “Stay Flexible with free cancellation” is enabled on Deals page
    Then verify stay flexible link is enabled

  Scenario: Verify “Amazing deals with free cancellation” title is displayed
    And I click stay flexible
    Then verify amazing deals title is displayed




    @saveOnYourNextTripToTheGreatOutdoorsLink
  Scenario: Verify “Save on your next trip to the great outdoors” is displayed
    Then verify save on your next trip link is displayed

  Scenario: Verify “Save on your next trip to the great outdoors” is enabled
    Then verify save on your next trip link is enabled

  Scenario: Verify “Save on your next trip to the great outdoors” title is displayed
    And I click save on your next trip
    Then verify Save on your next trip to the great outdoors title is displayed



