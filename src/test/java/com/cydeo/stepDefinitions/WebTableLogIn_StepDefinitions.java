package com.cydeo.stepDefinitions;

import com.cydeo.pages.WebTableLogInPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTableLogIn_StepDefinitions {


    WebTableLogInPage webTableLogInPage = new WebTableLogInPage();

    @Given("User is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }


    @When("User clicks to login")
    public void user_clicks_to_login() {
    webTableLogInPage.logInButton.click();
    }
    @Then("User should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }

    @When("User enters username {string}")
    public void user_enters_username(String string) {
    webTableLogInPage.inputUsername.sendKeys(string);
    }
    @When("User enters password {string}")
    public void user_enters_password(String string) {
    webTableLogInPage.inputPassword.sendKeys(string);
    }



}
