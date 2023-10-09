package com.cydeo.stepDefinitions;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTables_StepDefinitions {



    @Then("user should see the fruits I like")
    public void user_should_see_the_fruits_i_like(List<String>fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

//Task for DropDown

    DropDownsPage dropDownsPage = new DropDownsPage();

    @Given("User is on the dropdown page of practice tool")
    public void user_is_on_the_dropdown_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        List<String> actualMonths=BrowserUtils.dropDownOptionsAsString(dropDownsPage.monthDropDown);

        Assert.assertEquals(expectedMonths,actualMonths);
        //Assert will check the size of the list first. If it matches, it will check the content
        //one by one



        }

    }

