package test.automation.base;

import test.automation.common.ExcelUtils;
import test.automation.pageconstant.GlobalConstants;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

/**
 * Created by mmasi03 on 1/25/2016.
 */
public class TestDataProvider {

    @DataProvider(name="getDataFromFile")
    public static Object[][] getDataFromFile(Method testMethod, ITestContext context) throws Exception{

        String banner = context.getCurrentXmlTest().getParameter("banner");
        String testName = testMethod.getName();

        ExcelUtils excelUtils = new ExcelUtils();
        excelUtils.setExcelFile(GlobalConstants.testDataFilePath + GlobalConstants.testDataFileName, banner);

        Object[][] testObjectArray = excelUtils.getTableArray(testName);
        return (testObjectArray);

    }

}
