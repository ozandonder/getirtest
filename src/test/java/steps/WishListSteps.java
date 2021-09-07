package steps;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.StrongerDriver;

import java.util.List;

public class WishListSteps extends StrongerDriver {
    public static By WISH_LIST_REMOVE_BUTTON = By.id("ic_wishlist");

    public void removeAllWishListItem() {
        List<MobileElement> removeWishListButtonList = findByElements(WISH_LIST_REMOVE_BUTTON);
        for (int i = 0; i < removeWishListButtonList.size(); i++) {
            clickToBy(WISH_LIST_REMOVE_BUTTON);
        }
    }

    public WishListSteps checksAddedProductsWishList(int expectedCount) {
        int a = findByElements(WISH_LIST_REMOVE_BUTTON).size();
        System.out.println(a);
        Assert.assertEquals("Wish list size is incorrect", a, expectedCount);
        return this;
    }
}