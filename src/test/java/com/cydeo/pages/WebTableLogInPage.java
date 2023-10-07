package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLogInPage {

public WebTableLogInPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

@FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;


@FindBy(xpath = "//button[.='Login']")
    public WebElement logInButton;

    /**
     * No paramaters.
     * When we call this method, it will directly log in using
     * Username: Test
     * Password: Tester
     */
    public void login(){
    this.inputUsername.sendKeys("Test");
    this.inputPassword.sendKeys("Tester");
    this.logInButton.click();
}

    /**
     * This method will accept two arguments and login
     * @param username
     * @param password
     */

    public void login(String username, String password){
        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(password);
        this.logInButton.click();
    }

}
