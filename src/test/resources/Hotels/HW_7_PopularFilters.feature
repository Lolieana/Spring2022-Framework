@regression
Feature: Popular Filters Not Checked

  @popularFilters
  Scenario: Verify all popular filters are uncheck
    #Given I am on Hotels main page
    When  I choose checkin date and choose checkout date
     And  I type my destination
     And  I click search
     Then Verify all popular filters are not selected


  Scenario: Verify the lowest hotel price is less then or equal to $100
    Given I am on Hotels main page
    When  I choose checkin date and choose checkout date
     And  I type my destination
     And  I click search
     And  I select Price option
     Then Verify first option is lowest price

  Scenario: Verify the Star rating buttons are displayed in increasing order
    Given I am on Hotels main page
    When  I choose checkin date and choose checkout date
     And  I type my destination
     And  I click search
     Then Verify rating is sorted in increasing order


  Scenario: Verify the "No Matches" error is displayed on the page
    Given I am on Hotels main page
     When I choose checkin date and choose checkout date
      And I type my destination
      And I click search
      And I type my invalid property search
     Then Verify error message is displayed
     Then Verify the invalid data entered is displayed as one of the filters
