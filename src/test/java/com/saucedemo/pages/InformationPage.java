package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {

    public InformationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Checkout: Overview']")
    public WebElement checkoutHeader;

}
