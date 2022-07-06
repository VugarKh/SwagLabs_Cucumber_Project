package com.saucedemo.step_definitions;

import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwagLabStepDef {
    @Given("user is on SwagLabs login page")  //Test1
    public void user_is_on_swag_labs_login_page() {

    }
    @When("user enters valid username")
    public void user_enters_valid_username() {

    }
    @When("user enters valid password")
    public void user_enters_valid_password() {

    }
    @Then("user should see home page")
    public void user_should_see_home_page() {

    }




    @Given("user is on home page")  //Test2
    public void user_is_on_home_page() {

    }
    @Then("user should verify that {int} items are displayed")
    public void user_should_verify_that_items_are_displayed(Integer int1) {

    }




    @Given("user is on landing home page")  //Test 3
    public void user_is_on_landing_home_page() {

    }

    @When("user add item to cart")
    public void user_add_item_to_cart() {

    }
    @When("user should be able to click on cart and verify that item was added to the cart")
    public void user_should_be_able_to_click_on_cart_and_verify_that_item_was_added_to_the_cart() {

    }
    @Then("user should be able to click continue shopping")
    public void user_should_be_able_to_click_continue_shopping() {

    }





    @Given("user is on cart page")  //Test 4
    public void user_is_on_cart_page() {

    }
    @Given("user should be able to see all {int} items on cart")
    public void user_should_be_able_to_see_all_items_on_cart(Integer int1) {

    }
    @When("user click on checkout button")
    public void user_click_on_checkout_button() {

    }
    @Then("user should be able to see {string}")
    public void user_should_be_able_to_see(String string) {

    }





    @Given("user is on checkout information page")  //Test 5
    public void user_is_on_checkout_information_page() {

    }
    @When("user should be able to type:")
    public void user_should_be_able_to_type(io.cucumber.datatable.DataTable dataTable) {

    }
    @When("user click on continue button")
    public void user_click_on_continue_button() {

    }
    @Then("user should be able to see {string} page")
    public void user_should_be_able_to_see_page(String string) {

    }




    @Given("user is on checkout overview page")  //Test 6
    public void user_is_on_checkout_overview_page() {

    }
    @When("user should be able to see total price")
    public void user_should_be_able_to_see_total_price() {

    }
    @When("user should be able click on {string} button")
    public void user_should_be_able_click_on_button(String string) {

    }
    @Then("user should be able to see {string} text")
    public void user_should_be_able_to_see_text(String string) {

    }

}
