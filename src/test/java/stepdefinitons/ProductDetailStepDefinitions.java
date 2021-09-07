package stepdefinitons;

import cucumber.api.java.en.*;
import steps.ProductDetailStep;

public class ProductDetailStepDefinitions {

    ProductDetailStep productDetailStep = new ProductDetailStep();

    @And("^User add the product to basket at Product Detail Page$")
    public void userAddTheProductToBasketAtProductDetailPage() {
        productDetailStep.clickAddToCartButton();
    }

    @And("^User add the product to basket and set Product Info at Product Detail Page$")
    public void userAddTheProductToBasketAtSetProductInfoAtProductDetailPage() {
        productDetailStep.clickAddToCartButton();
        productDetailStep.setProductInfo();
    }
}
