package com.cydeo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class DataTables_StepDefinitions {



    @Then("user should see the fruits I like")
    public void user_should_see_the_fruits_i_like(List<String>fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }



    @Given("User is on the dropdown page of practice tool")
    public void user_is_on_the_dropdown_page_of_practice_tool() {throw new io.cucumber.java.PendingException();
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(io.cucumber.datatable.DataTable dataTable) {

    }



}
