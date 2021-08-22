package utils.driverutils;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import utils.runner.AppiumServerController;

import java.util.List;
import java.util.Random;

public class StrongerDriver extends AppiumServerController {

    Random rand = new Random();

    protected MobileElement findByElement(By by) {
        return getDriver().findElement(by);
    }

    protected List<MobileElement> findByElements(By by) {
        return getDriver().findElements(by);
    }

    public void clickToBy(By by) {
        MobileElement element;
        element = getDriver().findElement(by);
        element.click();
    }

    public void touchAction(By by) {
        TouchActions action = new TouchActions(getDriver());
        action.scroll(findByElement(by), 10, 100);
        action.perform();
    }

    public boolean isElementPresent(By by) {
        return (findByElements(by).size() > 0) ? true : false;
    }

    public boolean isElementDisplayed(By by) {
        return getDriver().findElement(by).isDisplayed();
    }

    protected void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void driverNavigateBack() {
        getDriver().navigate().back();
    }

    public void driverRefresh() {
        getDriver().navigate().refresh();
    }

    public Integer getRandomInt(int count) {
        return rand.nextInt(count);
    }
}