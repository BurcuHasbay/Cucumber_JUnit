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
    When User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedNameHeader>" is in the main header

    Examples: search values we are going to be using in this scenario below
      | searchValue   | expectedTitle    | expectedNameHeader |
      | Eda Erdem     | Beyonce          | Diana          |
      | Anne Boleyn   | Hürrem Sultan    | Ferzan Özpetek |
      | Nil Peri      | Gülşen Bubikoğlu | Jun Ji-hyun    |
      | Emma Watson   | Gal Gadot        | Matt Smith     |
      | Alex De Souza | Anya Taylor-Joy  | Mert Alaş      |

