package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;
   
    @CacheLookup
    @FindBy(xpath= "//input[@id='postal-code']")
    WebElement zipCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    public void enterFirstname(String fname){
        sendTextToElement(firstName,fname);
        log.info("Enter firstName"+fname+ " to firstName field "+firstName.toString() );
    }
    public void enterLastname(String lname){
        sendTextToElement(lastName,lname);
        log.info("Enter lastName "+lname+ " to lastName field "+firstName.toString() );
    }
    public void enterZipCode(String zip){
        sendTextToElement(zipCode,zip);
        log.info("Enter ZipCode "+zip+ " to lastName field "+zipCode.toString() );
    }
    public void clickOncontinue(){
        clickOnElement(continueButton);
        log.info("Clicking on continue Button "+ continueButton.toString());
    }


}
