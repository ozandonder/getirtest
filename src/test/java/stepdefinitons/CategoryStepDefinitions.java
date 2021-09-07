package stepdefinitons;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import steps.CategoryStep;

public class CategoryStepDefinitions {

    CategoryStep categoryStep = new CategoryStep();

    @When("^User changes category to \"([^\"]*)\" at Category Tabs$")
    public void userChangesCategoryToAtCategoryTabs(String categoryName) {
        categoryStep.clickCategoryTab(categoryName);
    }

    @And("^User open \"([^\"]*)\"st product detail$")
    public void userOpenStProductDetail(String productLocation) {
        categoryStep.clickGoToProductDetail(productLocation);
    }

    @And("^User click random category$")
    public void userClickRandomCategory() {
        categoryStep.clickRandomCategoryTab();
    }

    @And("^User adding \"([^\"]*)\" random product to WishList$")
    public void userAddingRandomProductToWishList(int countOfAdd) {
        categoryStep.addingRandomProductToWishList(countOfAdd);
    }

    @And("^User clicks the WishList button for product \"([^\"]*)\"st$")
    public void userClicksTheWishlistButtonForProductSt(int productIndex) {
        categoryStep.addingAProductToWishList(productIndex);
    }
}
