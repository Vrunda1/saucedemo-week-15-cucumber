Feature: purchase functionality

  Scenario: User navigates saucedemo page and complete the item purchase
    Given I am on saucedemo page
    When I login with credential username "standard_user"
    And I login with credential password "secret_sauce"
    Then I click on Login button
    And I filter the products by Price "Price (high to low)" from high to low field
    And I select cheapest  products and add to basket
    And I select costliest products and add to basket
    And I open shopping cart
    And I go to checkout
    And I enter details firstname "Vienaa"
    And I enter details firstname  lastName "George"
    And I enter details zipPostalCode "38001"
    And I click on continue button
    And I click on finish button
    Then I should be able to see message "THANK YOU FOR YOUR ORDER"





