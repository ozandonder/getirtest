package steps;

import org.openqa.selenium.By;
import utils.StrongerDriver;

import java.util.ArrayList;

public class ProductDetailStep extends StrongerDriver {

    public static By ADD_TO_CART_BUTTON = By.id("text_action_bottom1");
    public static By PRODUCT_TITLE_TEXT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    public static By PRODUCT_PRICE_TEXT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");


    public static ArrayList<String> arrList = new ArrayList<>();

    public void clickAddToCartButton() {
        clickToBy(ADD_TO_CART_BUTTON);
    }

    public void setProductInfo() {
        arrList.add(findByElement(PRODUCT_TITLE_TEXT).getText() + "," + findByElement(PRODUCT_PRICE_TEXT).getText());
    }

    public String getProductInfo(int index) {
        return arrList.get(index);
    }
}