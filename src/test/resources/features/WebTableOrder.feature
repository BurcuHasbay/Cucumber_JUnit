Feature: Web table user order feature


  @wip
  Scenario: User should be able to place order and see in the web table

  Given User is already logged in and on order page
  When User selects product type "Familybea"
  And User enters quantity "2"
  And User enters costumer name "Sherlock Holmes"
  And User enters street "221B Baker Street"
  And User enters city "London"
  And User enters state "England"
  And User enters zipcode "50505"
  And User selects credit card type "MasterCard"
  And User enters credit card number "1111222233334444"
  And User enters expiry date "12/23"
  And User enters process order button
  Then User should see "Sherlock Holmes" in first row of the web table