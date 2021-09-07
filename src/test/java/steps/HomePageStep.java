package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.StrongerDriver;

public class HomePageStep extends StrongerDriver {

    public static By NEXT_BUTTON = By.id("btn_next");
    public static By HOME_PAGE_TOOLBAR = By.id("toolbar");
    public static By HAMBURGER_MENU_BUTTON = By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");

    public HomePageStep swipeOnBoardingToUntilHomePage() {
        while (isElementPresent(NEXT_BUTTON)) {
            clickToBy(NEXT_BUTTON);
            wait(2);
        }
        return this;
    }

    public void checkHomePageExists(Boolean condition) {
        Assert.assertEquals("User checks if home page exists is incorrect", isElementDisplayed(HOME_PAGE_TOOLBAR), condition);
    }

    public void returnLastPage() {
        driverNavigateBack();
    }

    public void clickActionIcon(String iconName) {
        clickToBy(By.id("action_" + iconName));
    }

    public void clickHamburgerMenuItem(String menuItem) {
        clickToBy(HAMBURGER_MENU_BUTTON);
        clickToBy(By.xpath("//android.widget.CheckedTextView[@text='" + menuItem + "']"));
    }
}