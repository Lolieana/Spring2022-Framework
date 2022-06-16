@errorMessageForInvalidDataInSignUpPage
Feature: Signup page



  Background:
    Given I am on Hotels main page
    When  I click header sign in
    And  I click signup it is free from sign in menu
    And  I type invalid email #!@###
    And  I type invalid first name !@
    And  I type invalid last name %^&
    And  I type invalid password abc123$$@1@D


    @enterInvalidEmail
  Scenario: Verify error message for invalid email in SignUp form
    Then Verify error message is displayed after entering invalid email

      @enterInvalidFirstName
  Scenario: Verify error message for invalid first name in SignUp form
    Then Verify error message is displayed after entering invalid first name

  @enterInvalidLastName
  Scenario: Verify error message for invalid last name in SignUp form
    Then Verify error message is displayed after entering invalid last name

  @checkboxDisplayed
  Scenario: Verify checkbox is displayed for invalid data in SignUp form
    Then verify Keep me signed in checkbox is displayed

  @checkboxEnabledFoeInvalidData
  Scenario: Verify checkbox is enabled for invalid data
    Then verify Keep me signed in checkbox is enabled

  @continueBtnDisplayed
  Scenario: Verify continue btn is displayed for invalid data in SignUp form
    Then verify “Continue” button is displayed

  @continueBtnIsNotEnabledWithInvalidData
  Scenario: Verify continue btn is not enabled for invalid data in SignUp form
    Then verify “Continue” button is NOT enabled



