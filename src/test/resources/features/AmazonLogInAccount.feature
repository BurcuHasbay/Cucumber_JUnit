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
    And User scrolls down till the next button
    And User scrolls up till the search box
    And User deletes the the previous typed one and types "Winmau dart oku" in the search box and clicks
    When User scrolls down till the dart he or she selects then clicks on it
    Then User sees the title of the product and the price
    Then User clicks on the picture to zoom in





