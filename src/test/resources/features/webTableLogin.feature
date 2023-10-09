Feature: User should be able to login using correct credential

  Background: User is on the login page
Given User is on the login page of web table app



  Scenario: Positive login scenario

    When User enters username "Test"
    And User enters password "Tester"
    And User clicks to login



  Scenario: Positive login scenario
    When User enters username "Test" and password "Tester" and logins




  Scenario: User should be able to sef all 12 months in months dropdown
    When User enters below credentials
      | username | Test   |
      | password | Tester |
