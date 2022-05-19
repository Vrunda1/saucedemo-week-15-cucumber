package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutCompletePage.class.getName());

    public CheckOutCompletePage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement thankyouMessage;

    public String verifyThankYoutext(){
        log.info("getting Thankyou Message text  "+thankyouMessage.toString());
        return getTextFromElement(thankyouMessage);
    }




}
