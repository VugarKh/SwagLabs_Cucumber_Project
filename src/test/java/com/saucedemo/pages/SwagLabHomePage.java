package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {

    public SwagLabHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
