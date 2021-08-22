package steps.categories;

import org.junit.Assert;
import org.openqa.selenium.By;
import pages.categories.CategoryPage;
import utils.driverutils.StrongerDriver;

import java.util.ArrayList;

public class CategoryStep extends StrongerDriver {

    ArrayList<Integer> indexList = new ArrayList<>();
    int i, productCount, index;

    public void clickCategoryTab(String categoryName) {
        clickToBy(By.xpath("//*[@content-desc='" + categoryName + "']"));
    }

    public void clickRandomCategoryTab() {
        int numberOfCategory = findByElements(CategoryPage.CATEGORY_TAB_BUTTON).size();
        System.out.println("Number of Categories : " + numberOfCategory);
        findByElements(CategoryPage.CATEGORY_TAB_BUTTON).get(getRandomInt(numberOfCategory)).click();
    }

    public void clickGoToProductDetail(String productLocation) {
        if (productLocation.equals("random")) {
            productCount = findByElements(CategoryPage.PRODUCT_BUTTON).size();
            index = getRandomInt(productCount);
        } else {
            index = Integer.parseInt(productLocation);
        }
        findByElements(CategoryPage.PRODUCT_BUTTON).get(index).click();
    }

    public void addingRandomProductToWishList(int countOfAdd) {
        int wishListButtonCount = findByElements(CategoryPage.WISH_LIST_BUTTON).size();
        for (i = 0; i < wishListButtonCount; i++) {
            indexList.add(i);
        }
        for (i = 0; i < countOfAdd; i++) {
            index = (int) (Math.random() * indexList.size());
            findByElements(CategoryPage.WISH_LIST_BUTTON).get(index).click();
            indexList.remove(index);
        }
    }

    public void addingAProductToWishList(int productIndex) {
        findByElements(CategoryPage.WISH_LIST_BUTTON).get(productIndex).click();
        Assert.assertEquals("Add wishlist icon of the product is not selected", findByElement(CategoryPage.WISH_LIST_BUTTON).getAttribute("selected"), true);
    }
}