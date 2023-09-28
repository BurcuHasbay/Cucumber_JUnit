package com.cydeo.stepDefinitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.ref.SoftReference;

public class GoogleStepDefinitions {
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see the title is Google")
    public void user_should_see_the_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle
        );
    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        
    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
    }
}
