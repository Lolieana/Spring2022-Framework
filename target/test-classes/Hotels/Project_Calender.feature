@disabledDates
Feature: Calender

  Background:
    Given I am on Hotels main page



    @checkInDisabledDates
  Scenario: Verify past dates in checkin box are disabled for the user in current month
      When  I click checkin box
      Then verify dates are disabled

    @checkOutDisabledDates
  Scenario: Verify past dates in checkout box are disabled for the user in current month
     # When  I click checkout box
      Then verify dates are disabled

    @leftArrow
  Scenario: Verify left arrow in the calender is disabled to the user
      When  I click checkin box
      Then verify arrow is disabled
