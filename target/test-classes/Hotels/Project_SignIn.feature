@invalidCredentials  @sanity
Feature: SignUp Page


  @verificationMessage
  Scenario: Verify verification message for invalid sign in credentials is displayed
    Given I am on Hotels main page
    When  I click header sign in
    And  I click sign in from the menu
    And  I type invalid email
    And  I type invalid password
    And I click login button
    Then verify verification message is displayed


