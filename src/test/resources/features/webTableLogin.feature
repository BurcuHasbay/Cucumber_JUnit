Feature: User should be able to login using correct credential


  Scenario: Positive login scenario
    Given User is on the login page of web table app
    When User enters "username"
    And User enters "password"
    And User clicks to login
    Then User should see url contains orders