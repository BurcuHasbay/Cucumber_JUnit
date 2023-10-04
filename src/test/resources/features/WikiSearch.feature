Feature: Wikipedia search functionality and verification

  Scenario: Wikipedia Search for Functionality and Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    When User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title