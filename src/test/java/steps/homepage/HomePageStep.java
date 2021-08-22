package steps.homepage;

import org.junit.Assert;
import org.openqa.selenium.By;
import pages.homepage.HomePage;
import utils.driverutils.StrongerDriver;

public class HomePageStep extends StrongerDriver {

    public HomePageStep swipeOnBoardingToUntilHomePage() {
        while (isElementPresent(HomePage.NEXT_BUTTON)) {
            clickToBy(HomePage.NEXT_BUTTON);
            wait(2);
        }
        return this;
    }

    public void checkHomePageExists(Boolean condition) {
        Assert.assertEquals("User checks if home page exists is incorrect", isElementDisplayed(HomePage.HOME_PAGE_TOOLBAR), condition);
    }

    public void returnLastPage() {
        driverNavigateBack();
    }

    public void clickActionIcon(String iconName) {
        clickToBy(By.id("action_" + iconName));
    }

    public void clickHamburgerMenuItem(String menuItem) {
        clickToBy(HomePage.HAMBURGER_MENU_BUTTON);
        clickToBy(By.xpath("//android.widget.CheckedTextView[@text='" + menuItem + "']"));
    }
}