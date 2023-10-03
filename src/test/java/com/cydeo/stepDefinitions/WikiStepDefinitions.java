package com.cydeo.stepDefinitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefinitions {

    //creating Object
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("http   s://www.wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikiSearchPage.searchBox.sendKeys(string);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string ));
    }
}
