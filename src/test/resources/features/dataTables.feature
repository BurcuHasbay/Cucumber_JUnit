Feature: Examples of Cucumber dataTables implementation


  Scenario: List of fruits I like
    Then user should see the fruits I like
      | Kiwi       |
      | Watermelon |
      | Grapes     |
      | Strawberry |
      | Peach      |
      | Grapefruit |
      | Blackberry |

  #mac: command + option + L

  Scenario: User should be able to see all 12 months in months
  dropdown
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |