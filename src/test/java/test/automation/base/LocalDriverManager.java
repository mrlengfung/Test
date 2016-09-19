package test.automation.base;

import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by mmasi03 on 2/1/2016.
 */
public class LocalDriverManager {

    private static ThreadLocal<RemoteWebDriver> webDriver = new ThreadLocal<>();

    public static RemoteWebDriver getDriver() {
        return webDriver.get();
    }

    static void setWebDriver(RemoteWebDriver driver){
        webDriver.set(driver);
    }

}
