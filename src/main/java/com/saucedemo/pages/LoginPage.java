package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath= "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void setUserName(String text){
        sendTextToElement(userName,text);
        log.info("Enter userName "+ text.toString());
    }

    public void setPassword(String text){
        sendTextToElement(password,text);
        log.info("Enter password "+ text.toString());
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on LoginButton "+ loginButton.toString());
    }







}
