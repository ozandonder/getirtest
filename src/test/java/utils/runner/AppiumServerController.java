package utils.runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumServerController {

    private static AppiumDriver<MobileElement> driver;

    public static void startAppiumServer() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Android SDK built for x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10.0");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("app", "/Users/ozan.donder/Desktop/sampleGetir.apk");

        URL hubURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(hubURL, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void stopAppiumServer() {
        driver.quit();
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
}

