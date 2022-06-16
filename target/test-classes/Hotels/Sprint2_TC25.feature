@sanity
Feature: feedback page

  @thankYouMsgDisplayed
  Scenario: Verify user can submit feedback after completing the feedback form
    Given I am on Hotels main page
    When  I click header sign in
    And  I click feedback from sign in menu
    And  I click on star 1
    And  I type not sure in comment box
    And I choose from drop down
    And  I choose no to answer first question
    And  I choose no to answer second question
    And  I click submit button
    Then Verify Thank you for your feedback message is displayed

