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

}
