Feature: Web table user order feature


  Scenario: User should be able to place order and see in the web table

    Given User is already logged in and on order page
    When User selects product type "Familybea"
    And User enters quantity 2
    And User enters customer name "Sherlock Holmes"
    And User enters street "221B Baker Street"
    And User enters city "London"
    And User enters state "England"
    And User enters zipcode "50505"
    And User selects credit card type "MasterCard"
    And User enters credit card number "1111222233334444"
    And User enters expiry date "12/23"
    And User enters process order button
    Then User should see "Sherlock Holmes" in first row of the web table



  Scenario Template: User should be able to place order and see in the web table
    Given User is already logged in and on order page
    When User selects product type "<productType>"
    And User enters quantity <quantity>
    And User enters customer name "<customerName>"
    And User enters street "<street>"
    And User enters city "<city>"
    And User enters state "<state>"
    And User enters zipcode "<zipCode>"
    And User selects credit card type "<cardType>"
    And User enters credit card number "<cardNumber>"
    And User enters expiry date "<expiryDate>"
    And User enters process order button
    Then User should see "<expectedName>" in first row of the web table
    Examples:Famous female scientist
      | productType | quantity | customerName         | street           | city           | state   | zipCode | cardType         | cardNumber      | expiryDate | expectedName         |
      | Screenable  | 2        | Abigail Salyers      | Chester st.      | West Yorkshire | England | BD11EE  | American Express | 293130009111750 | 12/36      | Abigail Salyers      |
      | MoneyCog    | 3        | Rita Colwell         | Canterburry st.  | Brighton       | England | BN11AB  | American Express | 111033709648550 | 12/36      | Rita Colwell         |
      | Screenable  | 4        | Jennifer Doudna      | Priston Park st. | Oxford         | England | OX1BT   | American Express | 520630009648113 | 12/36      | Jennifer Doudna      |
      | MoneyCog    | 3        | Jo Handelsman        | Victoria st.     | Brighton       | England | BN11BN  | American Express | 359994209648710 | 12/36      | Jo Handelsman        |
      | MoneyCog    | 5        | Margaret McFall-Ngai | West Coast st.   | Manchester     | England | M1AW    | American Express | 358130009666128 | 12/36      | Margaret McFall-Ngai |
      | Familybea   | 2        | Rosalind Franklin    | Bakery st.       | London         | England | E17DS   | American Express | 774010009648996 | 12/36      | Rosalind Franklin    |

@wip
    Examples:Famous male scientist
      | productType | quantity | customerName              | street           | city           | state   | zipCode | cardType         | cardNumber      | expiryDate | expectedName         |
      | Screenable  | 2        | Alfred Nobel              | Chester st.      | West Yorkshire | England | BD11EE  | American Express | 293130009111750 | 12/36      | Abigail Salyers      |
      | MoneyCog    | 3        | Galileo Galilei Biography | Canterburry st.  | Brighton       | England | BN11AB  | American Express | 111033709648550 | 12/36      | Rita Colwell         |
      | Screenable  | 4        | Neil deGrasse Tyson Biogr | Priston Park st. | Oxford         | England | OX1BT   | American Express | 520630009648113 | 12/36      | Jennifer Doudna      |
      | MoneyCog    | 3        | Avicenna                  | Victoria st.     | Brighton       | England | BN11BN  | American Express | 359994209648710 | 12/36      | Jo Handelsman        |
      | MoneyCog    | 5        | Alfred Nobel              | West Coast st.   | Manchester     | England | M1AW    | American Express | 358130009666128 | 12/36      | Margaret McFall-Ngai |
      | Familybea   | 2        | Aziz Sancar               | Bakery st.       | London         | England | E17DS   | American Express | 774010009648996 | 12/36      | Rosalind Franklin    |
