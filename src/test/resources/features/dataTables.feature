Feature: Examples of Cucumber dataTables implementation

  Background: User is on the login page
  Given User is on the dropdown page of practice tool

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

      @wip
  Scenario: User should be able to sef all 12 months in months dropdown
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User should see url contains orders