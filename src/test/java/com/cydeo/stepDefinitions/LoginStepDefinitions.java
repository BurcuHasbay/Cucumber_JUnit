package com.cydeo.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @When("user enters librarian username")
    public void ser_enters_librarian_username() {
        System.out.println("user enters librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");


    }

    @When("user enters student username")
    public void user_enters_student_username() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
