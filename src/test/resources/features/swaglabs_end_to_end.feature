Feature: Shopping feature

  User story: As a user, When I’m on the SwagLabs home page I should be able to add items one by one and
  after each addition user should see that item in the cart and click on continue shopping button. When user added
  all items to the cart, user should be able to see all items in the cart.Verify total price and user should be able
  to proceed to checkout.

  @test1
  Scenario:
    Given user is on SwagLabs login page
    When user enters valid username
    And user enters valid password
    Then user should see home page

  @test2
  Scenario:
    Given user is on landing home page
    Then user should verify that 6 items are displayed


  @test3
  Scenario:
    Given user is on home page
    When user add item to cart
    And user should be able to click on cart and verify that item was added to the cart
    Then  user should be able to click continue shopping

  @test4
  Scenario:
    Given user is on cart page
    And user should be able to see all 6 items on cart
    When user click on checkout button
    Then user should be able to see "CHECKOUT: YOUR INFORMATION"

  @test5
  Scenario:
    Given user is on checkout information page
    When user should be able to type:
      | first name      |
      | last name       |
      | zip/postal code |

    And user click on continue button
    Then user should be able to see "CHECKOUT: OVERVIEW" page

  @test6
  Scenario:
    Given user is on checkout overview page
    When user should be able to see total price
    And user should be able click on "Finish" button
    Then user should be able to see "THANK YOU FOR YOUR ORDER" text
