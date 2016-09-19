package test.automation.TestSuite;

import atu.alm.wrapper.exceptions.ALMServiceException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import test.automation.base.LocalDriverManager;
import test.automation.base.TestDataProvider;
import test.automation.helpers.ObjectHelper;
import org.testng.annotations.Test;
import test.automation.base.ConfigTestBase;
import test.automation.helpers.ObjectHelper;
import test.automation.common.Generic;
import test.automation.pageconstant.GlobalConstants;

/**
 * Created by jgros32 on 05/05/2016.
 */
public class BT_TC002_UserWo_J4U_BTFE_Accts_NoClip extends ConfigTestBase {

    private ObjectHelper objectHelper = null;
    private Generic generic = null;
    private RemoteWebDriver localDriver = null;
    private String returnValue [] = null;

    @Test(dataProvider="getDataFromFile", dataProviderClass=TestDataProvider.class)
    public void BT_TC002_UserWo_J4U_BTFE_Accts_NoClip(String almTestCaseName, String execute, String url, String password, String clubCardNumber, String zipCode, String boxTopEventName) throws Exception {

        if(execute.toUpperCase().equals("YES")) {

            localDriver = LocalDriverManager.getDriver();
            generic = new Generic(localDriver);
            objectHelper = new ObjectHelper(localDriver, GlobalConstants.objectMapperDefPath);

            //declare variables
            String userName = returnValue[0];
            GlobalConstants.testCaseName = almTestCaseName;
            GlobalConstants.generalTestCaseStatus = "PASSED";

            //navigate to application page
            generic.navigateToURL(url);

            //navigate to sign in page

            //sign in to application with KMSI not checked

            //navigate to J4U tab


        } else {
        generic.log("Execute variable <> 'YES'. Skipping execution...");
        throw new SkipException("Execute variable <> 'YES'. Skipping execution...");
        }

    }
}
