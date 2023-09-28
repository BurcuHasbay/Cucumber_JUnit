package com.cydeo.stepDefinitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.lang.ref.SoftReference;

public class GoogleStepDefinitions {

    //WANT TO CREATE POM IN THE CLASS LEVEL
    //WHY?
    //
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();



    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see the title is Google")
    public void user_should_see_the_title_is_google() {
    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
    String expectedTitle = "apple - Google Search";
    String actualTitle = Driver.getDriver().getTitle();

    Assert.assertEquals(actualTitle,expectedTitle);

    }
}
