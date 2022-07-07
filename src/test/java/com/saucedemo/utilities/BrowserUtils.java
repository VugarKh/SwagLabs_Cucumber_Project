package com.saucedemo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * This method accept a List<WebElements> and returns List<String>
      webElementList
     */
    public static List<String> getElementsText(List<WebElement> webElementList){

        //Create placeholder list<String>
        List<String>actualAsString = new ArrayList<>();
        for (WebElement each : webElementList){
            actualAsString.add(each.getText());
        }
        return actualAsString;
    }


//    //This method accepts String expected title  assert
  public void assertTitle(String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("expectedTitle", actualTitle);
    }

//            BrowserUtils.assertTitle("This pages title");
//
////--------------------------------------------------------------------------
//             public boolean assertTitle(){
//
//        String actualTitle = Driver.getDriver().getTitle();
//
//       return actualTitle.equals.expectedTitle();
//    }
//-----------------------------------------------------------------------------
    //hover method
    public static void hover(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }


}
