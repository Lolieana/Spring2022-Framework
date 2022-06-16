@errorMessageOnEmptyFeedback
Feature: Feedback


  Background:
    Given I am on Hotels main page
    When  I click header sign in
    And  I click feedback from sign in menu
    And I click submit button

    @errorMessage
  Scenario: Verify error message is displayed after user click submit button on empty feedback form
    Then verify error message is displayed

      @errorWrappedStars
  Scenario: Verify red dots wrapped stars after user submit empty feedback form
    Then verify red dots around stars is displayed

