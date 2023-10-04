package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    // Create constructor first
    // Then initialize the driver instance and this class' instance using PageFactory.initElements

    public WikipediaPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //We can now start locating Web Elements using @FindBy annotation

    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

}
