@basket
Feature: Basket Page Scenario

  @Test @1
  Scenario: User should deletes all products from basket
    Given User should pass onboarding screens
    When User changes category to "Baby Care" at Category Tabs
    And User open "random"st product detail
    And User add the product to basket and set Product Info at Product Detail Page
    And User returns to last page
    And User click "Snacks" at Hamburger Menu
    And User open "random"st product detail
    And User add the product to basket and set Product Info at Product Detail Page
    And User returns to last page
    And User click "cart" action icon
    And User should deletes all products from basket
    Then User should see all product have been deleted from the basket

  @Test @3
  Scenario: User should see info message and shop button at empty basket
    Given User should pass onboarding screens
    And User open "1"st product detail
    And User add the product to basket and set Product Info at Product Detail Page
    And User returns to last page
    And User click "cart" action icon
    And User should deletes all products from basket
    Then User should see info message and shop button at empty basket