package test.automation.common;

import test.automation.helpers.CustomTestReportHelper;
import test.automation.base.ConfigTestBase;
import test.automation.base.LocalDriverManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * Created by mmasi03 on 11/5/2015.
 */
public class TestListener extends ConfigTestBase implements ITestListener {

    private CustomTestReportHelper customTestReportHelper = null;

    public TestListener() {
        customTestReportHelper =  new CustomTestReportHelper();
    }

    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("Test Steps for: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        customTestReportHelper.GenerateScreenshotAndLinkToReport(LocalDriverManager.getDriver(), result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
//      System.out.println("on test method " + getTestMethodName(result) + " success");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
//      System.out.println("test method " + getTestMethodName(result) + " skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//      System.out.println("test failed but within success % " + getTestMethodName(result));
    }

    @Override
    public void onStart(ITestContext context) {
//      System.out.println("on start of test " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
//      System.out.println("on finish of test " + context.getName());
    }

}
