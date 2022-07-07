package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public  WebElement addtoCart(String element ){
        WebElement webElement = Driver.getDriver().findElement(By.xpath("//button[.='Add to cart' and 'add-to-cart-" + element + "']"));
        return webElement;
    }

    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCart;
}
