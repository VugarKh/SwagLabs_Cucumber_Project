package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage {
    public CheckOutCompletePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(tagName = "h2")
    public WebElement thankYouMsgHeader;
}
