package steps.basket;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.basket.BasketPage;
import steps.productdetail.ProductDetailStep;
import utils.driverutils.StrongerDriver;

import java.util.List;

public class BasketStep extends StrongerDriver {

    public ProductDetailStep productDetailStep = new ProductDetailStep();

    public void checksAddedProductsAndPrices() {
        int removeButtonSize = findByElements(BasketPage.REMOVE_BUTTON).size();
        for (int i = 0; i < removeButtonSize; i++) {
            String productTitle = findByElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[" + (i + 1) + "]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
            String productPrice = findByElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[" + (i + 1) + "]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]")).getText();
            Assert.assertEquals("User checks if home page exists is incorrect", productDetailStep.getProductInfo(i), productTitle + "," + productPrice);
        }
    }

    public void removeAllProducts() {
        List<MobileElement> removeProductButtonList = findByElements(BasketPage.REMOVE_BUTTON);
        for (int i = 0; i < removeProductButtonList.size(); i++) {
            clickToBy(BasketPage.REMOVE_BUTTON);
        }
    }

    public void checkTotalPriceAtBasket(String totalPrice) {
        Assert.assertEquals("Total price is incorrect", findByElement(BasketPage.TOTAL_PRICE_TEXTBOX).getText(), "$" + totalPrice);
    }

    public void checkEmptyBasket() {
        Assert.assertEquals("Empty Basket info message is incorrect", findByElement(BasketPage.EMPTY_BASKET_INFO_TEXT).getText(), BasketPage.EMPTY_BASKET_INFO_MESSAGE);
        Assert.assertTrue("Shop Now button is not show", findByElements(BasketPage.SHOP_NOW_BUTTON).size() > 0);
    }
}