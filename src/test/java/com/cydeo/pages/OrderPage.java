package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.ja.且つ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage{

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name ="product")
    public WebElement productDropDown;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;


    @FindBy(name = "name")
    public WebElement inputName;


    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;


    @FindBy(name ="state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    //To use all cards if needed
    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(css = "input[name='cardExp']")
    public WebElement inputCardExp;

    @FindBy(css = "button[type='submit']")
    public WebElement processOrderButton;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement inputCardNo;



}
