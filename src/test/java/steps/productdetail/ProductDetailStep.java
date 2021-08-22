package steps.productdetail;

import pages.productdetail.ProductDetailPage;
import utils.driverutils.StrongerDriver;

import java.util.ArrayList;

public class ProductDetailStep extends StrongerDriver {

    public static ArrayList<String> arrList = new ArrayList<>();

    public void clickAddToCartButton() {
        clickToBy(ProductDetailPage.ADD_TO_CART_BUTTON);
    }

    public void setProductInfo() {
        arrList.add(findByElement(ProductDetailPage.PRODUCT_TITLE_TEXT).getText() + "," + findByElement(ProductDetailPage.PRODUCT_PRICE_TEXT).getText());
    }

    public String getProductInfo(int index) {
        return arrList.get(index);
    }
}