package com.cydeo.stepDefinitions;

import com.cydeo.pages.AmazonPage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Amazon_StepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    Actions actions = new Actions(Driver.getDriver());

   // Faker faker = new Faker();

    //String generatedPassword = faker.internet().password();


    @When("User is on the Amazon home page")
    public void user_is_on_the_amazon_home_page() {
        Driver.getDriver().get("https://www.amazon.com.tr/");

    }


    @And("User rejects all the cookies")
    public void userRejectsAllTheCookies() {
        amazonPage.rejectAllCookies.click();
    }


    @When("User hovers the mouse over the clickable log-in box")
    public void user_hovers_the_mouse_over_the_clickable_log_in_box() {
    actions.moveToElement(amazonPage.logInContainerBox).perform();
    }


    @And("User sees {string} message")
    public void userSeesMessage(String string) {

        WebElement newMemberMessage = Driver.getDriver().findElement(By.id("nav-flyout-ya-newCust"));
        System.out.println("newMemberMessage.getText().contains(string) = " + newMemberMessage.getText().contains(string));
    }

    @Then("User clicks the sign-up link button")
    public void user_click_the_link_button() {
      amazonPage.UyeOlunLink.click();

    }

    @When("User types first name and last name as {string} in the name box")
    public void userTypesFirstNameAndLastNameAsInTheNameBox(String string) {
        amazonPage.userNameLastNameBox.sendKeys(string);
    }

    @And("User types {string}  in the e-mail box")
    public void userTypesInTheEMailBox(String string) {
        amazonPage.emailBox.sendKeys(string);
    }

    @And("User types the password as {string} in the password box")
    public void userTypesThePasswordAsInThePasswordBox(String string) {
        amazonPage.passwordBox.sendKeys(string);
    }

    @And("User types the same password {string} in the password")
    public void userTypesTheSamePasswordInThePassword(String string) {
        amazonPage.passwordBox2.sendKeys(string);
    }

    @And("User clicks the checkbox button")
    public void userClicksTheCheckboxButton() {
        amazonPage.checkBox.click();
    }

    @Then("User clicks the button to create an account")
    public void userClicksTheButtonToCreateAnAccount() {
        amazonPage.continueButton.click();
    }

    /* @When("User types first name and las name in the name box")
    public void user_types_first_name_and_las_name_in_the_name_box() {
        amazonPage.userNameLastNameBox.sendKeys(faker.name().firstName(),faker.name().lastName());
    }
    */


   /* @When("User types email  in the e-mail box")
    public void user_types_email_in_the_e_mail_box() {
    amazonPage.emailBox.sendKeys(faker.internet().emailAddress());
    }
    */


   /* @When("User types a password in the password box")
    public void user_types_a_password_in_the_password_box() {
    amazonPage.passwordBox.sendKeys(generatedPassword);
    }

    */
   /* @When("User types the same password in the password box to check")
    public void user_types_the_same_password_in_the_password_box_to_check() {
    amazonPage.passwordBox2.sendKeys(generatedPassword);
    }

    */
  /*  @Then("User clicks the button to create an account")
    public void user_clicks_the_button_to_create_an_account() {
    amazonPage.continueButton.click();
    }

   */

}
