Feature: Wikipedia search functionality and verification

  Scenario: Wikipedia Search for Functionality and Title Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    When User clicks wiki search button
    Then User sees "Bill Gates" is in the wiki title

    Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header


  Scenario Outline: Wikipedia Search for Functionality and Title Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    When User clicks wiki search button
    Then User sees "Bill Gates" is in the wiki title
    Then User sees "Steve Jobs" is in the main header

    Examples: search values we are going to be using in this scenario below
