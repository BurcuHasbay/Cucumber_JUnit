@wip
Feature: Amazon sign-up functionality and verification


  Scenario: amazon home page functionality

    When User is on the Amazon home page
    And User rejects all the cookies
    And User sees "Yeni müşteri misiniz?" message
    And User hovers the mouse over the clickable log-in box
    Then User clicks the sign-up link button
    When User types first name and last name as "Vitto Amato" in the name box
    And User types "vittoamatoTest888@gmail.com"  in the e-mail box
    And User types the password as "Wien2362" in the password box
    And User types the same password "Wien2362" in the password
    And User clicks the checkbox button
    Then User clicks the button to create an account