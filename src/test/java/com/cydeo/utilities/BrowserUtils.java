package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {
    /*
In this class, only general utility methods that are not related to some specific page
 */
    public static void sleep(int second){
        second*=2000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }



    /*
    This method below accepts 3 arguments:
    Arg 1- webdriver
    Arg 2- expectedInUrl: to verify if the url contains given String
    Arg 3- expectedTitle to be compared to actualTitle
     */
    public static void switchWindAndVerify(String expectedInURL, String expectedTitle){
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }





    /*
    This method below accepts String "expectedTitle" and Asserts if it is true

    */
    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyURLContains(String expectedInTitle){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInTitle));

    }
}
