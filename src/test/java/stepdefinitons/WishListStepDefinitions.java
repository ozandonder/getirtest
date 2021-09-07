package stepdefinitons;

import cucumber.api.java.en.Then;
import steps.WishListSteps;

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
