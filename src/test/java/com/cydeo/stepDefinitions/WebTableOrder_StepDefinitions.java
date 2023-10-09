package com.cydeo.stepDefinitions;

import com.cydeo.pages.WebTableLogInPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTableOrder_StepDefinitions {

    //Without creating the object of the login() method, you CAN'T SUMMON It
    WebTableLogInPage webTableLogInPage = new WebTableLogInPage();


    // TO be already on the Order PaGE, we have to log in first by using Log in method
    @Given("User is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        webTableLogInPage.login("username","password");
        String orderURL = ConfigurationReader.getProperty("web.table.order.url");
    }
    @When("User selects product type {string}")
    public void user_selects_product_type(String string) {

    }
    @When("User enters quantity {string}")
    public void user_enters_quantity(String string) {

    }
    @When("User enters costumer name {string}")
    public void user_enters_costumer_name(String string) {

    }
    @When("User enters street {string}")
    public void user_enters_street(String string) {

    }
    @When("User enters city {string}")
    public void user_enters_city(String string) {

    }
    @When("User enters state {string}")
    public void user_enters_state(String string) {

    }
    @When("User enters zipcode {string}")
    public void user_enters_zipcode(String string) {

    }
    @When("User selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {

    }
    @When("User enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

    }
    @When("User enters expiry date {string}")
    public void user_enters_expiry_date(String string) {

    }
    @When("User enters process order button")
    public void user_enters_process_order_button() {

    }
    @Then("User should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

    }



}
