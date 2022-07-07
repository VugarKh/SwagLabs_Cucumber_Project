package com.saucedemo.step_definitions;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.SwagLabHomePage;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;

public class SwagLabStepDef {

    SwagLabHomePage swag = new SwagLabHomePage();
    BasePage basePage = new BasePage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @Given("user is on SwagLabs login page")  //Test1
    public void user_is_on_swag_labs_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals("Swag Labs", Driver.getDriver().getTitle());
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        swag.username.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        swag.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("user should see home page")
    public void user_should_see_home_page() {
        swag.loginButton.click();
        String actual = swag.homePageVerification.getText();
        String expected = "PRODUCTS";
        Assert.assertEquals(expected, actual);
    }


    @Then("user should verify that {int} items are displayed")//test2
    public void user_should_verify_that_items_are_displayed(Integer int1) {

    }


    @When("user add all item to cart")
    public void userAddAllItemToCart() throws InterruptedException {
        ArrayList<String> webElements = new ArrayList<>(Arrays.asList("sauce-labs-backpack", "sauce-labs-bike-light", "sauce-labs-bolt-t-shirt", "sauce-labs-fleece-jacket", "sauce-labs-onesie", "test.allthethings()-t-shirt-(red)"));

        for (int i = 0; i < webElements.size(); i++) {
            basePage.addtoCart(webElements.get(i)).click();

        }
    }


    @And("user should be able to click on cart button")
    public void userShouldBeAbleToClickOnCartButton() {
        basePage.shoppingCart.click();
    }



    @Then("verify that user is on the cart page")
    public void verifyThatUserIsOnTheCartPage() {
        String expectedHeader = "YOUR CART";
        String actualHeader =cartPage.your_cart.getText();
        Assert.assertEquals(expectedHeader,actualHeader);

    }

    @And("user should be able to see all {int} items on cart")
    public void userShouldBeAbleToSeeAllItemsOnCart(int numberOfItems) {
        Assert.assertEquals(numberOfItems,cartPage.CartItems.size());

    }

    @When("user click on checkout button")
    public void userClickOnCheckoutButton() {
        cartPage.checkout_button.click();
    }

    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedHeader) {

        String actualHeader = checkoutPage.Checkout_Your_Information.getText();
        Assert.assertEquals(expectedHeader,actualHeader);
    }

    @When("user should be able to type:")
    public void userShouldBeAbleToType() {
    }

    @And("user click on continue button")
    public void userClickOnContinueButton() {
    }

    @Then("user should be able to see {string} page")
    public void userShouldBeAbleToSeePage(String arg0) {
    }

    @When("user should be able to see total price")
    public void userShouldBeAbleToSeeTotalPrice() {
    }

    @And("user should be able click on {string} button")
    public void userShouldBeAbleClickOnButton(String arg0) {
    }

    @Then("user should be able to see {string} text")
    public void userShouldBeAbleToSeeText(String arg0) {
    }
}
