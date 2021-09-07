package stepdefinitons;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import steps.HomePageStep;
import utils.AppiumServerController;

import java.net.MalformedURLException;

public class HomePageStepDefinitons {

    HomePageStep homePageStep = new HomePageStep();

    @Before
    public void before() throws MalformedURLException {
        AppiumServerController.startAppiumServer();
    }

    @After
    public void after() {
        AppiumServerController.stopAppiumServer();
    }

    @Given("^User should pass onboarding screens$")
    public void userShouldPassOnBoardingScreens() {
        homePageStep.swipeOnBoardingToUntilHomePage().checkHomePageExists(true);
    }

    @And("^User returns to last page$")
    public void userReturnsToLastPage() {
        homePageStep.returnLastPage();
    }

    @And("^User click \"([^\"]*)\" at Hamburger Menu$")
    public void userClickAtHamburgerMenu(String menuItem) {
        homePageStep.clickHamburgerMenuItem(menuItem);
    }

    @And("^User click \"([^\"]*)\" action icon$")
    public void userClickActionIcon(String iconName) {
        homePageStep.clickActionIcon(iconName);
    }
}
