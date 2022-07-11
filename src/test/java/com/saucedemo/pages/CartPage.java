package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    public CartPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='cart_item']")
    public List<WebElement> CartItems;
    @FindBy(xpath = "//span[.='Your Cart']")
    public WebElement your_cart;
    @FindBy(linkText = "Sauce Labs Backpack")
    public WebElement sauce_labs_backpack;
    @FindBy (linkText = "Sauce Labs Bike Light")
    public WebElement sauce_labs_bike_light;
    @FindBy (linkText = "Sauce Labs Fleece Jacket")
    public WebElement sauce_labs_fleece_jacket;

    @FindBy (linkText = "Sauce Labs Bolt T-Shirt")
    public WebElement sauce_labs_bolt_tshirt;

    @FindBy (linkText = "Sauce Labs Onesie")
    public WebElement sauce_labs_onesie;

    @FindBy (linkText = "Test.allTheThings() T-Shirt (Red)")
    public WebElement TestallTheThings_TShirt_Red;

    @FindBy (xpath = "//button[@id='checkout']")
    public WebElement checkout_button;
}
