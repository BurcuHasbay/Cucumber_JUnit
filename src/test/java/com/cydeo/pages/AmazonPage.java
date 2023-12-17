package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {


    //// Create constructor first
    public AmazonPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "sp-cc-rejectall-container")
    public WebElement rejectAllCookies;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement logInContainerBox;


    @FindBy(xpath ="//a[@class='nav-a']" )
    public WebElement UyeOlunLink;

    @FindBy(xpath = "//div[@class='nav_pop_new_cust nav-flyout-content nav-flyout-accessibility']")
    public WebElement newMemberMessage;

   // @FindBy(partialLinkText = "Üye olun.")
    //public WebElement UyeOlunLink;

    @FindBy(id = "ap_customer_name")
    public WebElement userNameLastNameBox;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='ap_password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath ="//*[@id='ap_password_check']")
    public WebElement passwordBox2;

    @FindBy(xpath = "//*[@id='continue']")
    public WebElement continueButton;












}
