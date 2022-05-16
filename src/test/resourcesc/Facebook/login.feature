Feature: Facebook login


   # Scenario name
  Scenario: Verify user cannot login with invalid credentials
    # steps (Gherkin steps)
    Given I am on facebook landing page
    When I enter $%^&*( in login username
    And I enter abcd@1234 in login password
    And I click on login button
    Then I verify error is displayed

  # Comment in feature file
  # valid user credentials are not available.
  Scenario: Verify user can login with valid credentials
    Given I am on facebook landing page
    When I enter validUser@gmail.com in login username
    And I enter validPass@1234 in login password
    And I click on login button
    Then I verify Facebook Homepage is displayed

  Scenario: Verify user cannot login with empty credentials
    Given I am on facebook landing page
    And I click on login button
    Then I verify error is displayed


  Scenario: Verify user cannot login with empty credentials
    Given I am on facebook landing page
    When I enter var@gmail.com in login username
    And I enter valkdfjklsdhfkljsdhf;s@1234 in login password
    And I click on login button
    Then I verify error is displayed