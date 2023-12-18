@valhalla
Feature: Log-in and account functionality
  User Story:
  As a user, I should be able to login with correct credentials

  Background:
  Given User is on the homepage of the website and try to log-in

  Scenario:
    When User is on the login page of Amazon and sees "Giriş yap" title
    And User types "vittoamatotest888@gmail.com" in the email input box
    And User clicks the button to continue
    And USer types "Wien2362" in the password input box
    And User clicks submit button
    And User clicks search dropdown box
    And User selects product type "search-alias=toys" for the game option
    And User types "winmau" and click to search




