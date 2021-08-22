package stepdefinitons.basket;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.basket.BasketStep;

public class BasketStepDefinitions {

    BasketStep basketStep = new BasketStep();

    @When("^User should deletes all products from basket$")
    public void userShouldDeletesAllProductsFromBasket() {
        basketStep.checksAddedProductsAndPrices();
        basketStep.removeAllProducts();
    }

    @Then("^User should see all product have been deleted from the basket$")
    public void userShouldSeeAllProductHaveBeenDeletedFromTheBasket() {
        basketStep.checkTotalPriceAtBasket("0.00");
    }

    @Then("^User should see info message and shop button at empty basket$")
    public void userShouldSeeInfoMessageAndShopButtonAtEmptyBasket() {
        basketStep.checkEmptyBasket();
    }
}