Feature: Shopping feature

  User story: As a user, When I’m on the SwagLabs home page I should be able to add items one by one and
  after each addition user should see that item in the cart and click on continue shopping button. When user added
  all items to the cart, user should be able to see all items in the cart.Verify total price and user should be able
  to proceed to checkout.


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

