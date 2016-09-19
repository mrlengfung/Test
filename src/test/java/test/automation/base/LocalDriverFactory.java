package test.automation.base;

import test.automation.pageconstant.GlobalConstants;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.URL;

/**
 * Created by mmasi03 on 2/1/2016.
 */
public class LocalDriverFactory {

    static RemoteWebDriver createInstance(String browserName) throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

        if (browserName.toLowerCase().contains("firefox")) {
            capabilities = DesiredCapabilities.firefox();
//            capabilities.setCapability("marionette", true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capabilities.setBrowserName("firefox");
            capabilities.setPlatform(Platform.WINDOWS);
        }

        if (browserName.toLowerCase().contains("ie") || browserName.toLowerCase().contains("internet explorer")) {
            System.setProperty("webdriver.ie.driver",GlobalConstants.driversIEChromePath + "IEDriverServer.exe");
            capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, false);

            capabilities.setBrowserName("internet explorer");
            capabilities.setPlatform(Platform.WINDOWS);
        }

        if (browserName.toLowerCase().contains("chrome")) {
            System.setProperty("webdriver.ie.driver",GlobalConstants.driversIEChromePath + "chromedriver.exe");
            capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.WINDOWS);
        }

        if (browserName.toLowerCase().contains("safari")) {
            SafariOptions options = new SafariOptions();
            options.setUseCleanSession(true);
            capabilities = DesiredCapabilities.safari();
            capabilities.setCapability(SafariOptions.CAPABILITY, options);
            capabilities.setBrowserName("safari");
            capabilities.setPlatform(Platform.MAC);

//            //Clear Cache
//            String[] args = {"/usr/bin/osascript", "/Users/jbuen17/Downloads/ClearCacheScript3.scpt"};
//
//            try {
//                Process process = Runtime.getRuntime().exec(args);
//                process.waitFor();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
        }

        RemoteWebDriver driver = new RemoteWebDriver(new URL(GlobalConstants.GRIDHUB), capabilities);
        return driver;

    }
}
