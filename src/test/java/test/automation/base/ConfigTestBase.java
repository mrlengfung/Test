package test.automation.base;

import test.automation.common.Common;
import test.automation.pageconstant.GlobalConstants;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.File;

/**
 * Created by mmasi03 on 11/5/2015.
 */
public class ConfigTestBase {

    @Parameters({"objectMapperFile", "banner"})
    @BeforeSuite
    public void setupSuite(String objectMapperFile, String banner) throws Exception {
        GlobalConstants.objectMapperDefPath = new File(objectMapperFile).getAbsolutePath();
        new Common().OverrideSSLHandshakeException();
    }

    @Parameters({"browserName"})
    @AfterSuite
    public void cleanupSuite(String browserName) throws Exception {
        if(browserName.toLowerCase().contains("chrome")){
            //kill all chromedriver.exe and chrome.exe processes
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
        }
    }

}