package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[@class='title']")
    public WebElement Checkout_Your_Information;

    @FindBy (id = "first-name")
    public WebElement firstName;

    @FindBy (css = "#last-name")
    public WebElement lastName;

    @FindBy (css = "#postal-code")
    public WebElement zipCode;

    @FindBy (xpath = "//input[@id='continue']")
    public WebElement continueBtn;


}
