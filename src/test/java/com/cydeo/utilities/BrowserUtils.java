package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * This method will verify if the current URL contains expected value.
     */

    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));

    }


    /**
     * This method will accept a dropdown as a WebElement
     * and return all the options' test in a List of String
     * @param dropDownElement
     * @return
     */
        public static List<String>dropDownOptionsAsString(WebElement dropDownElement){
            Select select = new Select(dropDownElement);

            //List of all ACTUAL months as a Web Element
            List<WebElement> actualOptionsAsAWebElement = select.getOptions();

            //Create a list of String and pass all the actual web element's options string into that
            //new list

            //List of all ACTUAL months as a String
            List<String>actualOptionAsAString = new ArrayList<>();

            for (WebElement each : actualOptionsAsAWebElement) {
                actualOptionAsAString.add(each.getText());
            }
            return actualOptionAsAString;
        }





}
