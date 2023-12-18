package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogInAccountPage {

 public AmazonLogInAccountPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//span[@class='nav-action-inner']")
    public WebElement logInButton;

    @FindBy(xpath = "//h1[@class='a-spacing-small']")
    public WebElement logInTitle;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "   //*[@id='ap_password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id='signInSubmit']")
   public WebElement submitButton;

   @FindBy(xpath = "//*[@id='searchDropdownBox']")
   public WebElement searchDropDownBox;

    @FindBy(xpath ="//option[@value='search-alias=toys']")
    public WebElement selectGameOption;


    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement searchBox;












}
