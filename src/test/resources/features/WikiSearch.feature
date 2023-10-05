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

  @ScenarioOutline
  Scenario Outline: Wikipedia Search for Functionality and Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    And User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedNameHeader>" is in the main header
    Examples:
      | searchValue    | expectedTitle  | expectedNameHeader |
      | Eda Erdem      | Eda Erdem      | Eda Erdem          |
      | Anne Boleyn    | Anne Boleyn    | Anne Boleyn        |
      | Roxelana       | Roxelana       | Roxelana
      | Matt Smith     | Matt Smith     | Matt Smith         |
      | Alex De Souza  | Alex De Souza  | Alex De Souza      |
      | Jun Ji-hyun    | Jun Ji-hyun    | Jun Ji-hyun        |
      | Alex De Souza  | Alex De Souza  | Alex De Souza      |
      | Emma Watson    | Emma Watson    | Emma Watson        |
      | Michael Gambon | Michael Gambon | Michael Gambon     |
      | Gal Gadot      | Gal Gadot      | Gal Gadot          |


