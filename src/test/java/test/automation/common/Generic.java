package test.automation.common;

import test.automation.helpers.ObjectHelper;
import test.automation.pageconstant.GlobalConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by mmasi03 on 11/5/2015.
 */
public class Generic {

    private ObjectHelper objectHelper = null;
    private RemoteWebDriver driver = null;

    public Generic(RemoteWebDriver driver) {
        objectHelper = new ObjectHelper(driver, GlobalConstants.objectMapperDefPath);
        this.driver = driver;
    }

    public String getCurrentWindowHandle() {
        return driver.getWindowHandle();
    }

    public void switchToWindow(String windowHandle) {
        this.log("Switching window control.");
        driver.switchTo().window(windowHandle);
    }


    public String openNewBrowserWindow() {
        this.log("Opening new Browser window...");
        String stringHandles;
        Set<String> previousWindows = driver.getWindowHandles();
        String previousHandle = driver.getWindowHandle();
        ((JavascriptExecutor)driver).executeScript("window.open();");
        Set<String> newWindows = driver.getWindowHandles();
        newWindows.removeAll(previousWindows);
        String newHandle = ((String)newWindows.toArray()[0]);
        stringHandles = previousHandle + ";" + newHandle;
        return stringHandles;
    }


    public void log(String entry) {
        Reporter.log(entry);
    }


    public void navigateToURL(String URL) throws Exception{
        this.log("Navigating to URL '" + URL + "'.");
        driver.manage().window().maximize();
        String previousURL = driver.getCurrentUrl();
        driver.get(URL);
        Thread.sleep(2000);
        String newURL = driver.getCurrentUrl();
        if(previousURL.equals(newURL)){
            //retry navigate for a second time
            driver.get(URL);
        }
    }



    public String generateRandomTelephoneNumber() throws Exception {

        Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);

        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

        return df3.format(num1) + df3.format(num2) + df4.format(num3);

    }


    public void selectDropdownOption(WebElement dropdownObject, String itemToSelect) throws AWTException {
        this.log("Select dropdown Item '" + itemToSelect + "'.");

        JavascriptExecutor javaExecutor = (JavascriptExecutor)driver;

        Select selectElement = new Select(dropdownObject);
        selectElement.selectByVisibleText(itemToSelect);

    }

    public void selectDropdownOption(WebElement dropdownObject, int itemToSelectByIndex) throws AWTException {
        this.log("Select dropdown Item '" + itemToSelectByIndex + "'.");

        Select selectElement = new Select(dropdownObject);
        selectElement.selectByIndex(itemToSelectByIndex);
    }


    public String getSelectedItemDropdownOption(WebElement dropdownObject) {
        this.log("Get the selected value from the dropdown.");

        Select selectElement = new Select(dropdownObject);
        List<WebElement> objTemp = selectElement.getAllSelectedOptions();
        return objTemp.get(0).getText();
    }

    public List<WebElement> getAllItemDropdownOption(WebElement dropdownObject) {
        this.log("Get the list from the dropdown.");

        Select selectElement = new Select(dropdownObject);
        List<WebElement> objTemp = selectElement.getOptions();


        return objTemp;
    }

    public void clickUsingJavaExecutor(WebElement element) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) this.driver;

        if (driver.getCapabilities().getCapability("browserName").equals("safari")){
            element.click();
            Thread.sleep(2000);
        }else{
            executor.executeScript("arguments[0].click();", element);
            Thread.sleep(2000);
        }
    }


    public void clickUsingJavaExecutor(final Enum<?> objectDefinition, String... args) throws Exception {
        WebElement element = objectHelper.GetElementReference(objectDefinition.toString(), args);

        if (driver.getCapabilities().getCapability("browserName").equals("safari")){
            element.click();
            Thread.sleep(2000);
        }else{
            JavascriptExecutor executor = (JavascriptExecutor) this.driver;
            executor.executeScript("arguments[0].click();", element);
            Thread.sleep(2000);
        }
    }

    public boolean validateObjectIfExist(final Enum<?> objectDefinition, String... args) throws Exception{
        this.log("Validate if object does exist.");

        boolean blnFlag = false;
        objectHelper.waitForElementToExist(10, objectDefinition.toString(), args);
        if(objectHelper.isElementExist(objectDefinition.toString(), args)){
            blnFlag = true;
        }

        return blnFlag;
    }

    public boolean validateObjectIfExist(final Enum<?> objectDefinition) throws Exception{
        this.log("Validate if object does exist.");

        boolean blnFlag = false;
        objectHelper.waitForElementToExist(10, objectDefinition.toString());
        if(objectHelper.isElementExist(objectDefinition.toString())){
            blnFlag = true;
        }

        return blnFlag;
    }


    public boolean waitThirtyMinutes() throws InterruptedException {
        this.log("Session idle for 30 minutes.");

        Thread.sleep(GlobalConstants.thirtyMinutes + 300000);
        return true;
    }


    public String getPageURL() {
        this.log("Fetching page URL...");

        return driver.getCurrentUrl();
    }


    public boolean closeBrowser () throws Exception {
        this.log("Closing Browser window...");

        driver.close();

        return true;
    }



    public String mouseHover(String returnType, final Enum<?> objectDefinition, String... args) throws Exception{
        this.log("This method will perform a mouse hover and return the color change.");

        Actions actions = new Actions(driver);

        actions.moveToElement(objectHelper.GetElementReference(objectDefinition.toString(), args)).perform();
        actions.moveToElement(objectHelper.GetElementReference(objectDefinition.toString(), args)).perform();
        String returnValue = null;

        switch (returnType){
            case "COLOR":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString(), args).getCssValue("color");
                break;

            case "URL":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString(), args).getAttribute("href");
                break;

            case "UNDERLINE":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString(), args).getCssValue("text-decoration");
                break;

            case "CURSOR":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString()).getCssValue("cursor");
                break;

            case "TOOLTIP":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString(), args).getAttribute("title");
                break;

        }

        return returnValue;
    }

    public String mouseHover(String returnType, final Enum<?> objectDefinition) throws Exception{
        this.log("This method will perform a mouse hover and return the color change.");

        Actions actions = new Actions(driver);
        actions.moveToElement(objectHelper.GetElementReference(objectDefinition.toString())).perform();
        String returnValue = null;

        switch (returnType.toUpperCase()){
            case "COLOR":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString()).getCssValue("color");
                break;

            case "URL":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString()).getAttribute("href");
                break;

            case "UNDERLINE":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString()).getCssValue("text-decoration");
                break;

            case "CURSOR":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString()).getCssValue("cursor");
                break;

            case "TOOLTIP":
                returnValue = objectHelper.GetElementReference(objectDefinition.toString()).getAttribute("title");
                break;
        }

        return returnValue;
    }


    public String getObjectColor(String colorCSSProperty, final Enum<?> objectDefinition) throws Exception{
        this.log("This method will get the color of the object.");

        String fontColor = objectHelper.GetElementReference(objectDefinition.toString()).getCssValue(colorCSSProperty).replace("rgb(", "");

        fontColor = fontColor.replace(")", "");
        String[] arrTemp_A = fontColor.split(", ");
        String[] arrColor_A = arrTemp_A[0].split("\\(");
        int textColor_A = Integer.parseInt(arrColor_A[1]);
        int textColor_B = Integer.parseInt(arrTemp_A[1]);
        int textColor_C = Integer.parseInt(arrTemp_A[2]);
        String strColor_A = "#" + Integer.toHexString(textColor_A) + Integer.toHexString(textColor_B) + Integer.toHexString(textColor_C);

        return strColor_A;
    }


    public String getObjectColor(String colorCSSProperty, final Enum<?> objectDefinition, String...args) throws Exception{
        this.log("This method will get the color of the object.");

        String fontColor = objectHelper.GetElementReference(objectDefinition.toString(), args).getCssValue(colorCSSProperty).replace("rgb(", "");

        fontColor = fontColor.replace(")", "");
        String[] arrTemp_A = fontColor.split(", ");
        String[] arrColor_A = arrTemp_A[0].split("\\(");
        int textColor_A = Integer.parseInt(arrColor_A[1]);
        int textColor_B = Integer.parseInt(arrTemp_A[1]);
        int textColor_C = Integer.parseInt(arrTemp_A[2]);
        String strColor_A = "#" + Integer.toHexString(textColor_A) + Integer.toHexString(textColor_B) + Integer.toHexString(textColor_C);

        return strColor_A;
    }


//    public void waitForPageLoaded() throws InterruptedException {
//        RemoteWebDriver driver = LocalDriverManager.getDriver();;
//        Thread.sleep(2000);
//
//        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver driver)
//            {
//                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
//            }
//        };
//
//        Wait<WebDriver> wait = new WebDriverWait(driver,90);
//        try
//        {
//            wait.until(expectation);
//        }
//        catch(Throwable error)
//        {
//            Assert.fail("Timeout waiting for Page Load Request to complete.");
//        }
//    }

}