package com.cydeo.stepDefinitions;

import com.cydeo.pages.AmazonPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Amazon_StepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    Actions actions = new Actions(Driver.getDriver());

    @When("User is on the Amazon home page")
    public void user_is_on_the_amazon_home_page() {
        Driver.getDriver().get("https://www.amazon.com.tr/");

    }
    @When("User hovers the mouse over the clickable log-in box")
    public void user_hovers_the_mouse_over_the_clickable_log_in_box() {
    actions.moveToElement(amazonPage.logInContainerBox).pause(Duration.ofSeconds(4)).perform();
    }
    @When("User sees the {string} message")
    public void user_sees_the_message(String string) {
        Assert.assertEquals(amazonPage.areYouNew.getText(),string);

    }
    @When("User clicks the {string} link button")
    public void user_click_the_link_button(String string) {
    amazonPage.BeANewMemberLink.click();
    }


    @And("User rejects all the cookies")
    public void userRejectsAllTheCookies() {
        amazonPage.rejectAllCookies.click();
    }
}
