package test.automation.base;

import atu.alm.wrapper.ALMServiceWrapper;
import atu.alm.wrapper.ITestCase;
import atu.alm.wrapper.ITestCaseRun;
import atu.alm.wrapper.enums.StatusAs;
import atu.alm.wrapper.exceptions.ALMServiceException;
import test.automation.pageconstant.GlobalConstants;
import junit.framework.Assert;
import org.testng.SkipException;

import java.time.LocalDateTime;


/**
 * Created by jbuen17 on 1/21/2016.
 */
public class ALMIntegration {

    private ALMServiceWrapper almWrapper = null;
    private String almURL;
    private String almUserName;
    private String almPassword;
    private String almDomain;
    private String almProject;
    private String almTestSetPath;
    private String almTestSetName;
    private String almTestSetID;
    private ITestCaseRun objRun = null;
    private ITestCase objTestCase = null;
    private String testStepExecutionResults [][] = new String [1][5];

    public ALMIntegration(String[] args) {
        almURL = args[0];
        almUserName = args[1];
        almPassword = args[2];
        almDomain = args[3];
        almProject = args[4];
        almTestSetPath = args[5];
        almTestSetName = args[6];
        almTestSetID = args[7];

        almWrapper = new ALMServiceWrapper(almURL);
    }

    public void initializeConnection() throws ALMServiceException {
        boolean isConnected = almWrapper.connect(almUserName, almPassword, almDomain, almProject);

        if(isConnected){
            System.out.println("Connected to ALM!");
        }else{
            System.out.println("Unable to connect to ALM.");
        }
    }

    public void updateTestCaseResult() throws ALMServiceException {
        StatusAs status;

        if (GlobalConstants.generalTestCaseStatus.toUpperCase().equals("PASSED")) {
            status = StatusAs.PASSED;
        } else {
            status = StatusAs.FAILED;
        }
        objTestCase = almWrapper.updateResult(almTestSetPath, almTestSetName, Integer.valueOf(almTestSetID), GlobalConstants.testCaseName, status);
        objRun = almWrapper.createNewRun(objTestCase, LocalDateTime.now().toString(), status);
        for (int i = 0; i < testStepExecutionResults.length; i ++){
            if (testStepExecutionResults[i][1].equals("Passed")) {
                status = StatusAs.PASSED;
            } else {
                status = StatusAs.FAILED;
            }
            almWrapper.addStep(objRun, "Step " + testStepExecutionResults[i][0], status , testStepExecutionResults[i][2], testStepExecutionResults[i][3], testStepExecutionResults[i][4]);
        }
        terminateConnection();
    }

    public void addExecutionStep(int stepNo, String stepDesc, String expected, String actual, String testStatus){

        if (stepNo > 1) {
            testStepExecutionResults = (String[][]) resizeArray(testStepExecutionResults, testStepExecutionResults.length + 1);
            if (testStepExecutionResults[testStepExecutionResults.length - 1] == null){
                testStepExecutionResults[testStepExecutionResults.length - 1] = new String[5];
            }
        }

        if (testStatus.equals("Failed")){
            GlobalConstants.generalTestCaseStatus = "Failed";
        }
        testStepExecutionResults[testStepExecutionResults.length - 1][0] = Integer.toString(stepNo);
        testStepExecutionResults[testStepExecutionResults.length - 1][1] = testStatus;
        testStepExecutionResults[testStepExecutionResults.length - 1][2] = stepDesc;
        testStepExecutionResults[testStepExecutionResults.length - 1][3] = expected;
        testStepExecutionResults[testStepExecutionResults.length - 1][4] = actual;

    }

    public void terminateTestExecution() throws ALMServiceException {
        updateTestCaseResult();
        terminateConnection();
        Assert.fail("Test execution terminated!");
        throw new SkipException("Test execution terminated!");
    }

    public static Object resizeArray(Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class elementType = oldArray.getClass().getComponentType();
        Object newArray = java.lang.reflect.Array.newInstance(elementType,newSize);
        int preserveLength = Math.min(oldSize,newSize);
        if (preserveLength > 0) {
            System.arraycopy(oldArray,0,newArray,0,preserveLength);
        }
        return newArray;
    }

    public void terminateConnection() {
        almWrapper.close();
    }

}
