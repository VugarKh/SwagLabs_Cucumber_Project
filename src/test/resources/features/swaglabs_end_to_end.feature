Feature: Shopping feature

  User story: As a user, I should be able to login to SwagLabs web application by using valid credentials and
  when I’m on the SwagLabs home page I should be able to add items one by one in the cart and click on the cart
  button. Then I should be redirected to the cart page where I should be able to see all the added items. After
  verifying all items are in the cart I should be able to click checkout button and be redirected to the checkout:
  information page. On this page I should be able to fill out form with first name, last name and zip/postal code
  and by clicking on the continue button should be redirected to the checkout: overview page. On this page I
  should be able to see total item price and total price. Total item price should match expected price. After
  clicking finish button I should be redirected to the checkout: complete page where I should be able to verify
  THANK YOU FOR YOUR ORDER message.


  Scenario:
    Given user is on SwagLabs login page
    When user enters valid username
    And user enters valid password
    Then user should see home page

    Then user should verify that 6 items are displayed and count expected price of all items

    When user add all item to cart
    And user should be able to click on cart button


    Then verify that user is on the cart page
    And user should be able to see all 6 items on cart
    When user click on checkout button
    Then user should be able to see "CHECKOUT: YOUR INFORMATION"



    When user should be able to type user information:
      | first name      | James |
      | last name       | Bond  |
      | zip/postal code | 50505 |

    And user click on continue button
    Then user should be able to see "CHECKOUT: OVERVIEW" page

    And verify that user is able to see total price and verify items total price equals to expected price of items
    And user should be able click on "Finish" button
    Then user should be able to see "THANK YOU FOR YOUR ORDER" header

