package com.cydeo.stepDefinitions;


import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.beans.BeanProperty;

/*
In this class, we will be able to pass pre- & post-conditions to each scenario and each step
 */

/*
Import from io.cucumber.java not from JUNIT
 */
public class Hooks {
   @Before
    public void setUpMethod(){

        System.out.println("=====Setting Up Browser Using Cucumber @Before");


    }

 @After
    public void tearDownScenario(Scenario scenario){


       if (scenario.isFailed()){
           byte[]screenshot = ((TakesScreenshot)Driver.getDriver())
                   .getScreenshotAs(OutputType.BYTES);

           //Keeping track of currently executed scenario
           scenario.attach(screenshot,"image/png",scenario.getName());
       }



     Driver.closeDriver();

        //System.out.println("====Closing Browser Using Cucumber @After");
        //System.out.println("==== Scenario is ended.Take SS if it failed.");


    }


    @BeforeStep
    public void setUpStep(){
        System.out.println("-----------applying setup using @BeforeStep");

    }

    @AfterStep
    public void afterStep(){
        System.out.println("-------------applying teardown using @AfterStep ");
    }




}
