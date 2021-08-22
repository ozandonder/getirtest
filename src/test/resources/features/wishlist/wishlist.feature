@wishList
Feature: Wish List Scenario

  @Test @2
  Scenario: User deletes all item from Wishlist
    Given User should pass onboarding screens
    When User click random category
    And User adding "3" random product to WishList
    And User click "My Wishlist" at Hamburger Menu
    Then User should see "3" product have been deleted at wish list

  @Test @4
  Scenario: User see empty Wishlist after Uncheck Product Icon
    Given User should pass onboarding screens
    When User clicks the WishList button for product "1"st
    And User clicks the WishList button for product "1"st
    And User click "My Wishlist" at Hamburger Menu
    Then User should see "0" product at wish list