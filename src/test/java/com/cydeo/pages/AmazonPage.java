package com.cydeo.pages;

import com.cydeo.utilities.Driver;
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

    @FindBy(id = "nav-flyout-ya-newCust")
    public WebElement areYouNew;

    @FindBy(linkText = "Üye olun.")
    public WebElement BeANewMemberLink;






}
