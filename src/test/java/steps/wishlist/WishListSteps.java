package steps.wishlist;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.basket.BasketPage;
import pages.homepage.HomePage;
import pages.wishlist.WishListPage;
import utils.driverutils.StrongerDriver;

import java.util.List;

public class WishListSteps extends StrongerDriver {

    public void removeAllWishListItem() {
        List<MobileElement> removeWishListButtonList = findByElements(WishListPage.WISH_LIST_REMOVE_BUTTON);
        for (int i = 0; i < removeWishListButtonList.size(); i++) {
            clickToBy(WishListPage.WISH_LIST_REMOVE_BUTTON);
        }
    }

    public WishListSteps checksAddedProductsWishList(int expectedCount) {
        int a = findByElements(WishListPage.WISH_LIST_REMOVE_BUTTON).size();
        System.out.println(a);
        Assert.assertEquals("Wish list size is incorrect", a, expectedCount);
        return this;
    }
}