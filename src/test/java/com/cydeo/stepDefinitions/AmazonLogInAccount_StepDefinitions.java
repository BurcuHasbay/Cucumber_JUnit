package com.cydeo.stepDefinitions;

import com.cydeo.pages.AmazonLogInAccountPage;
import com.cydeo.pages.AmazonPage;
import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonLogInAccount_StepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    AmazonLogInAccountPage amazonLogInAccountPage = new AmazonLogInAccountPage();

    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
    @Given("User is on the homepage of the website and try to log-in")
    public void userIsOnTheHomepageOfTheWebsiteAndTryToLogIn() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
        amazonPage.rejectAllCookies.click();
        actions.moveToElement(amazonPage.logInContainerBox).perform();
        amazonLogInAccountPage.logInButton.click();
    }
    @When("User is on the login page of Amazon and sees {string} title")
    public void userIsOnTheLoginPageOfAmazonAndSeesTitle(String string) {
        Assert.assertTrue(amazonLogInAccountPage.logInTitle.isDisplayed());
    }

    @And("User types {string} in the email input box")
    public void user_types_in_the_email_input_box(String string) {
    amazonLogInAccountPage.emailInputBox.sendKeys(string);
    }
    @And("User clicks the button to continue")
    public void user_clicks_the_button_to_continue() {
        amazonLogInAccountPage.continueButton.click();

    }


    @And("USer types {string} in the password input box")
    public void userTypesInThePasswordInputBox(String string) {
        amazonLogInAccountPage.passwordInputBox.sendKeys(string);
    }

    @And("User clicks submit button")
    public void userClickSubmitButton() {
        amazonLogInAccountPage.submitButton.click();
    }


    @And("User clicks search dropdown box")
    public void userClicksSearchDropdownBox() {
        amazonLogInAccountPage.searchDropDownBox.click();
    }


    @And("User selects product type {string} for the game option")
    public void userSelectsProductTypeForTheGameOption(String string) {
        Select select = new Select(amazonLogInAccountPage.searchDropDownBox);
        select.selectByValue("search-alias=toys");
    }

    @And("User types {string} and click to search")
    public void userTypesAndClickToSearch(String string) {
    amazonLogInAccountPage.searchBox.sendKeys(string);
    amazonLogInAccountPage.searchBoxClickButton.click();


    }

    @And("User scrolls down till the next button")
    public void userScrollsDownTillTheNextButton() {
        js.executeScript("arguments[0].scrollIntoView(true)", amazonLogInAccountPage.nextButton);
    }

    @And("User scrolls up till the search box")
    public void userScrollsUpTillTheSearchBox() {
        js.executeScript("arguments[0].scrollIntoView(true)", amazonLogInAccountPage.searchBox);
    }


    @And("User deletes the the previous typed one and types {string} in the search box and clicks")
    public void userDeletesTheThePreviousTypedOneAndTypesInTheSearchBoxAndClicks(String string) {
        amazonLogInAccountPage.searchBox.clear();
        amazonLogInAccountPage.searchBox.sendKeys(string);
        amazonLogInAccountPage.searchBoxClickButton.click();
    }


    @When("User scrolls down till the dart he or she selects then clicks on it")
    public void userScrollsDownTillTheDartHeOrSheSelectsThenClicksOnIt() {

        js.executeScript("arguments[0].scrollIntoView(true)", amazonLogInAccountPage.winmauDarkTungstenOk);
        amazonLogInAccountPage.winmauDarkTungstenOk.click();


    }


    @Then("User sees the title of the product and the price")
    public void userSeesTheTitleOfTheProductAndThePrice() {
       // System.out.println("amazonLogInAccountPage.productTitle.isDisplayed() = " + amazonLogInAccountPage.productTitle.isDisplayed());

    }

    @Then("User clicks on the picture to zoom in")
    public void userClicksOnThePictureToZoomIn() {
    }
}
