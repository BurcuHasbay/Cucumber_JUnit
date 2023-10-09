Feature: User should be able to login using correct credential


  Scenario: Positive login scenario
    Given User is on the login page of web table app
    When User enters username "Test"
    And User enters password "Tester"
    And User clicks to login
    Then User should see url contains orders


  Scenario: Positive login scenario
    Given User is on the login page of web table app
    When User enters username "Test" and password "Tester" and logins
    Then User should see url contains orders


  @wip
  Scenario: User should be able to sef all 12 months in months dropdown
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User should see url contains orders