Feature: Facebook Instagram

  Scenario: Verify number of number of window open is 1
    Given I am on Facebook home page
    When  I Click on Facebook Pay
      And  I Click on Oculus
      And  I Click on Instagram
      And  I Click on Portal
      And  I click on Bulletin
      And  I Close ALL windows except Instagram
     Then I Verify number of window-Handles is 1


  Scenario: Verify page title is Instagram
    Given I am on Facebook home page
    When  I Click on Facebook Pay
    And  I Click on Oculus
    And  I Click on Instagram
    And  I Click on Portal
    And  I click on Bulletin
    And  I Close ALL windows except Instagram
    Then I Verify Page Title is Instagram


  Scenario: Verify Instagram log in button is disabled
    Given I am on Facebook home page
    When  I Click on Instagram
    And  I Close ALL windows except Instagram
    Then Verify Log in button on Instagram is disabled by default