Feature: Amazon sign-up functionality and verification

  Scenario: User should be able to hover over the log-in box and click on it to sign-up

    When User is on the Amazon home page
    And User hovers the mouse over the clickable log-in box
    And User sees the "Üye olun" message
    And User click the "üye olun" link button