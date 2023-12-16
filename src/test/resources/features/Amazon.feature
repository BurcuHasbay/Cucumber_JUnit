Feature: Amazon sign-up functionality and verification

  Scenario: User should be able to hover over the log-in box and click on it to sign-up

    When User is on the Amazon home page
    And User rejects all the cookies
    And User hovers the mouse over the clickable log-in box
    And User sees the "Yeni müşteri misiniz?" message
    And User clicks the sign-up link button