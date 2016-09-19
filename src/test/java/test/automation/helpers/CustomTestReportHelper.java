package test.automation.helpers;

import test.automation.constants.GlobalConstants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;
import org.testng.ITestResult;

import java.io.File;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class CustomTestReportHelper {

    public final void GenerateScreenshotAndLinkToReport(RemoteWebDriver driver, ITestResult result) {

//        String screenshotfileName = driver.getCapabilities().getCapability("platformName").toString() + "_" + driver.getCapabilities().getCapability("applicationName").toString() + "_" +
//                result.getMethod().getMethodName() + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".png";

        String screenshotfileName = result.getMethod().getMethodName() + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".png";

        try {
            System.setProperty(GlobalConstants.REPORTNG_ESCAPE_OUTPUT, "false");
            File sourceFileStream = driver.getScreenshotAs(OutputType.FILE);
            File destDirStream = new File(GlobalConstants.SCREENSHOTS_DIRECTORY);
            if (!destDirStream.exists())
                destDirStream.mkdir();
            FileUtils.copyFile(sourceFileStream, new File(GlobalConstants.SCREENSHOTS_DIRECTORY + "/" + screenshotfileName));
            Reporter.setEscapeHtml(false);
            Reporter.log("<a href =" + URLEncoder.encode("/screenshots/", "utf-8") + screenshotfileName + " style=\"background-color:#ffffa0\">" + GlobalConstants.SCREENSHOT_TEXT + "</a>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}