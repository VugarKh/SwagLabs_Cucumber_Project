package com.saucedemo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

    public static void switchWindowAndVerify(String expectedInUrl,String expectedTitle){

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            Driver.getDriver().switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title verification failed!",actualTitle.contains(expectedTitle));
    }

    public static void verifyTitle(WebDriver driver,String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
}
