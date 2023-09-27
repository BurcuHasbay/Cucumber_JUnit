package com.cydeo.stepDefinitions;


import io.cucumber.java.BeforeStep;
import org.junit.After;
import org.junit.Before;

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
    public void tearDownScenario(){
        System.out.println("====Closing Browser Using Cucumber @After");
        System.out.println("==== Scenario is ended.Take SS if it failed.");


    }


    @BeforeStep
    public void setUpStep(){
        System.out.println("-----------appliying setup using @BeforeStep");

    }





}
