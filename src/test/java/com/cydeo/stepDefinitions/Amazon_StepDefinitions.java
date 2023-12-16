package com.cydeo.stepDefinitions;

import com.cydeo.pages.AmazonPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Amazon_StepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    Actions actions = new Actions(Driver.getDriver());

    @When("User is on the Amazon home page")
    public void user_is_on_the_amazon_home_page() {
        Driver.getDriver().get("https://www.amazon.com.tr/");

    }
    @When("User hovers the mouse over the clickable log-in box")
    public void user_hovers_the_mouse_over_the_clickable_log_in_box() {
    actions.moveToElement(amazonPage.logInContainerBox).perform();
    }
    @When("User sees the {string} message")
    public void user_sees_the_message(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }
    @When("User clicks the sign-up link button")
    public void user_click_the_link_button() {
        WebElement beANewMemberLink= Driver.getDriver().findElement(By.linkText("Üye Olun."));
        actions.moveToElement(beANewMemberLink).pause(4000).perform();

    }


    @And("User rejects all the cookies")
    public void userRejectsAllTheCookies() {
        amazonPage.rejectAllCookies.click();
    }
}
