package test.automation.base;

import test.automation.helpers.CustomTestReportHelper;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Created by mmasi03 on 2/1/2016.
 */
public class WebDriverListener implements IInvokedMethodListener {

    private CustomTestReportHelper customTestReportHelper = null;

    public WebDriverListener() {
        customTestReportHelper =  new CustomTestReportHelper();
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

        if(method.isTestMethod()){
            String browserName = method.getTestMethod().getXmlTest().getParameter("browserName");
//            String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
            RemoteWebDriver driver = null;
            try {
                driver = LocalDriverFactory.createInstance(browserName);
            } catch (WebDriverException e) {
                if(e.toString().contains("locking port")){
                    try{
                        Thread.sleep(30000);

                    } catch (InterruptedException e1){
                        e1.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            LocalDriverManager.setWebDriver(driver);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult){
        if(method.isTestMethod()){

            RemoteWebDriver driver = LocalDriverManager.getDriver();

            if(testResult.getStatus() == ITestResult.FAILURE){
                customTestReportHelper.GenerateScreenshotAndLinkToReport(driver, testResult);
            }

            if(!(driver == null)){
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException ex) {
                    ex.printStackTrace();
                }

                try {
                    driver.quit();
                } catch (WebDriverException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
