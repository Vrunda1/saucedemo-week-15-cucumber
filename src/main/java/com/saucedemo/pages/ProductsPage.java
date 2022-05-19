package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortHightoLow;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
    WebElement costliestProduct;
    @CacheLookup
    @FindBy(xpath= "//div[text()='Sauce Labs Onesie']")
    WebElement cheapestProduct;

    @CacheLookup
    @FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement shoppingCart;

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
        log.info("Clicking on shopping Cart Button "+ shoppingCart.toString());
    }

    public void selectHighToLow(String hilo){
        selectByVisibleTextFromDropDown(sortHightoLow,hilo);
        log.info("Selecting High To Low from dropDown "+hilo+" from dropdown "+sortHightoLow.toString() );
    }
    public void clickOnCostliestProduct(){
        clickOnElement(costliestProduct);
        log.info("Clicking on costliest Product "+ costliestProduct.toString());
    }
    public void clickOncheapestProduct(){
       clickOnElement(cheapestProduct);
        log.info("Clicking on cheapest Product  "+ cheapestProduct.toString());
    }
    public void clickOnGenderAddtoCartButton(){
        clickOnElement(addToCartButton);
        log.info("Clicking on addToCart Button "+ addToCartButton.toString());
    }
}
