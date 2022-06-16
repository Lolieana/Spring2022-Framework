@smoke
Feature: Hotel search result page


  Background:
    Given I am on Hotels home page
    When  I type Manhattan in destination
    And  I enter checkin date and checkout date
    And  I click search button
    And I click star rating 5
    And  I Select Price from sort-by dropdown

    @searchByStarsRating
  Scenario: Verify all listed hotels has 5 stars rating
    Then verify all listed hotels are 5 stars

      @searchByIncreasedPrice
  Scenario: Verify all listed hotels prices are sorted in increased order
    Then verify all hotels are listed from low to high by price



