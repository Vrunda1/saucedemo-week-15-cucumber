$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "purchase functionality",
  "description": "",
  "id": "purchase-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3992203100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User navigates saucedemo page and complete the item purchase",
  "description": "",
  "id": "purchase-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login with credential username \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I login with credential password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \"Price (high to low)\" from high to low field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest  products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"Vienaa\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter details firstname  lastName \"George\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter details zipPostalCode \"38001\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to see message \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseTest.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 101343200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    }
  ],
  "location": "PurchaseTest.iLoginWithCredentialUsername(String)"
});
formatter.result({
  "duration": 102819700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 34
    }
  ],
  "location": "PurchaseTest.iLoginWithCredentialPassword(String)"
});
formatter.result({
  "duration": 67899800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnLoginButton()"
});
formatter.result({
  "duration": 98678800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "PurchaseTest.iFilterTheProductsByPriceFromHighToLowField(String)"
});
formatter.result({
  "duration": 5114959900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iSelectCheapestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 54937300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iSelectCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 43682900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iOpenShoppingCart()"
});
formatter.result({
  "duration": 73778400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iGoToCheckout()"
});
formatter.result({
  "duration": 67789500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vienaa",
      "offset": 27
    }
  ],
  "location": "PurchaseTest.iEnterDetailsFirstname(String)"
});
formatter.result({
  "duration": 106221900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "George",
      "offset": 37
    }
  ],
  "location": "PurchaseTest.iEnterDetailsFirstnameLastName(String)"
});
formatter.result({
  "duration": 104000900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "38001",
      "offset": 31
    }
  ],
  "location": "PurchaseTest.iEnterDetailsZipPostalCode(String)"
});
formatter.result({
  "duration": 85364300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 79174400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnFinishButton()"
});
formatter.result({
  "duration": 63734300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 33
    }
  ],
  "location": "PurchaseTest.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 43883100,
  "status": "passed"
});
formatter.after({
  "duration": 671548400,
  "status": "passed"
});
});