package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

public WebTablePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//input[@name='username']")
    public WebTablePage inputUsername;

@FindBy(xpath = "//input[@name='password']")
    public WebTablePage inputPassword;


@FindBy(xpath = "//button[@class='btn btn-primary login__submit']")
    public WebTablePage logInButton;
}
