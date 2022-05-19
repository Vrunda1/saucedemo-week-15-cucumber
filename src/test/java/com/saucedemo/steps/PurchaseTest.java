package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class PurchaseTest  {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {

    }

    @When("^I login with credential password \"([^\"]*)\"$")
    public void iLoginWithCredentialPassword(String pw){
        new LoginPage().setPassword(pw);
    }

    @When("^I login with credential username \"([^\"]*)\"$")
    public void iLoginWithCredentialUsername(String user) {
        new LoginPage().setUserName(user);
    }

    @Then("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductsPage().clickOnShoppingCart();

    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }


    @And("^I filter the products by Price \"([^\"]*)\" from high to low field$")
    public void iFilterTheProductsByPriceFromHighToLowField(String hilo) throws InterruptedException {
        Thread.sleep(5000);

        new ProductsPage().selectHighToLow(hilo);
    }


    @And("^I select cheapest  products and add to basket$")
    public void iSelectCheapestProductsAndAddToBasket() {
        new ProductsPage().clickOncheapestProduct();
    }

    @And("^I select costliest products and add to basket$")
    public void iSelectCostliestProductsAndAddToBasket() {
        new ProductsPage().clickOncheapestProduct();
    }

    @And("^I enter details firstname \"([^\"]*)\"$")
    public void iEnterDetailsFirstname(String fname) {
        new CheckOutPage().enterFirstname(fname);
    }

    @And("^I enter details firstname  lastName \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastName(String lname) {
        new CheckOutPage().enterLastname(lname);
    }

    @And("^I enter details zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsZipPostalCode(String zp) {
        new CheckOutPage().enterZipCode(zp);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOncontinue();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new FinishPage().clickOnFinishButton();
    }



    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String msg)  {
        Assert.assertEquals("Cannot see the message ThankYou For YourOrder",msg,new CheckOutCompletePage().verifyThankYoutext());
    }
}
