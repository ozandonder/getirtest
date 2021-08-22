package stepdefinitons.wishlist;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.wishlist.WishListSteps;

public class WishListStepDefinitions {

    WishListSteps wishListSteps = new WishListSteps();

    @Then("^User should see \"([^\"]*)\" product have been deleted at wish list$")
    public void userShouldSeeProductHaveBeenDeletedFromWishList(int exceptedCount) {
        wishListSteps.checksAddedProductsWishList(exceptedCount).removeAllWishListItem();
    }

    @Then("^User should see \"([^\"]*)\" product at wish list$")
    public void userShouldSeeProductAtWishList(int exceptedCount) {
        wishListSteps.checksAddedProductsWishList(exceptedCount);
    }
}
