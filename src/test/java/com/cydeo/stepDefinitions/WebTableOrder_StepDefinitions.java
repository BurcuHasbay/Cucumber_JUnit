package com.cydeo.stepDefinitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.WebTableLogInPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrder_StepDefinitions {

    //Without creating the object of the login() method, you CAN'T SUMMON It
    WebTableLogInPage webTableLogInPage = new WebTableLogInPage();

    BasePage basePage = new BasePage();

    OrderPage orderPage = new OrderPage();

    // TO be already on the Order PaGE, we have to log in first by using Log in method
    @Given("User is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
        webTableLogInPage.loginWithConfig();

        basePage.order.click();

    }
    @When("User selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(orderPage.productDropDown);

        select.selectByVisibleText(string);
    }


    @And("User enters quantity {int}")
    public void userEntersQuantity(int arg0) {

        //clear()method to delete what exist in the inputBox
        //orderPage.inputQuantity.clear();

        //OR

        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);


    //orderPage.inputQuantity.sendKeys(arg0 + "");
    //OR
    orderPage.inputQuantity.sendKeys(String.valueOf(arg0));
    }


    @When("User enters customer name {string}")
    public void user_enters_costumer_name(String string) {
    orderPage.inputName.sendKeys(string);
    }

    @When("User enters street {string}")
    public void user_enters_street(String string) {
    orderPage.inputStreet.sendKeys(string);
    }

    @When("User enters city {string}")
    public void user_enters_city(String string) {
    orderPage.inputCity.sendKeys(string);
    }

    @When("User enters state {string}")
    public void user_enters_state(String string) {
    orderPage.inputState.sendKeys(string);
    }

    @When("User enters zipcode {string}")
    public void user_enters_zipcode(String string) {
    orderPage.inputZip.sendKeys(string);
    }

    @When("User selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardTypes) {

        //This will look through and decide which radio button to be clicked
        BrowserUtils.clickRadioButton(orderPage.cardType, expectedCardTypes);

    }

    @When("User enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

        orderPage.inputCardExp.sendKeys(string);


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
