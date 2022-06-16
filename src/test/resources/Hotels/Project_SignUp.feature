@termsAndConditionsOpensInNewTab  @privacyStatementsOpensInNewTab
Feature: SignUp Page


  Background:
    Given I am on Hotels main page
    When  I click header sign in
    And  I click signup it is free from sign in menu

    @termsAndConditions
  Scenario: Verify Terms And Conditions link open correct page on new tab
    And I click Terms and conditions link
    Then Verify terms and conditions link open on new page


      @privacyStatements
  Scenario: Verify Privacy Statements link open correct page on new tab
    And I click privacy statements link
    Then Verify privacy statements link open correct page on new tab