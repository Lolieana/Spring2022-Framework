Feature: Hotels Destination Error Msg

  Scenario: Verify destination error is displayed if destination box was empty
    Given I am on Hotels home page
    When  I Click on search button
    Then Verify error destination message is displayed on home page




  Scenario: Verify enter-children's age error is displayed when user add a child
    Given I am on Hotels home page
    When  I Click on travelers button
     And  I click on add children button
     Then Verify Please provide the ages of children error message is displayed



  Scenario: Verify error is not displayed when user enter children age
    Given I am on Hotels home page
    When  I Click on travelers button
     And  I click on add children button
     And  I select children age
    Then Verify ages of children message is not displayed


  Scenario: Verify numbers of travelers before and after is the same.
    Given I am on Hotels home page
    When  I Click on travelers button
     And  I click on add children button
     And  I select children age
     And  I click done button
     And  I get the number of guests from travelers box
     And  I type where i am going in destination box
     And  I click search button
     And  I get the guest number after click search
     Then Verify number of guests is displayed on home page are same number after click search



   # hotels.com
   # Verify enter-children's age error is displayed as soon user add a child
   # and, error is NOT displayed as soon user enter's children's age
   # After click Search button
   # Also, verify numbers of travelers before and after is the same.
