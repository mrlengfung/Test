package test.automation.helpers;

import test.automation.constants.GlobalConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.FileInputStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public final class ObjectHelper {

    private Properties properties = null;
    private String propertiesFile = null;
    private WebElement _webElement = null;
    private By locateElement = null;
    private boolean isDirect = false;
//    private String os;
    private RemoteWebDriver driver;

    public ObjectHelper(RemoteWebDriver driver, String propertiesFile) {

        this.driver = driver;
        this.propertiesFile = propertiesFile;
//        os = driver.getCapabilities().getCapability("platformName").toString();
    }

    public final int countElement(String objectReferenceId) throws Exception {
        String[] command = GetObjectValueAndType(objectReferenceId);

        if(command[0].contains("[{0}]")){
            return findElementsBy(command[0].replace("[{0}]", ""), command[1]).size();
        }else{
            return findElementsBy(command[0].replace("{0}", ""), command[1]).size();
        }
    }


    public final boolean isElementExist(String objectReferenceId) throws Exception {

        String[] command = GetObjectValueAndType(objectReferenceId);
        return (findElementsBy(command[0], command[1]).size() != 0);
    }

    public final boolean isElementExist(String objectReferenceId, String... args) throws Exception {

        String[] command = GetObjectValueAndType(objectReferenceId);
        if (command == null) {
            return false;
        }

        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].contains("'")) {
                command[0] = command[0].replace("'{" + Integer.toString(i) + "}'", "\"{" + args[i] + "}\"");
            } else {
                command[0] = command[0].replace("{" + Integer.toString(i) + "}", args[i]);
            }
        }
        return (findElementsBy(command[0], command[1]).size() == 0) ? false : true;
    }

    public final WebElement GetElementReference(String objectReferenceId) throws Exception {

        String[] command = GetObjectValueAndType(objectReferenceId);

        if (command == null) {
            return null;
        }
        return findElementBy(command[0], command[1]);
    }

    public final WebElement GetElementReference(String objectReferenceId, String... args) throws Exception {

        String[] command = GetObjectValueAndType(objectReferenceId);
        if (command == null) {
            return null;
        }

        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].contains("'")) {
                command[0] = command[0].replace("'{" + Integer.toString(i) + "}'", "\"{" + args[i] + "}\"");
            } else {
                command[0] = command[0].replace("{" + Integer.toString(i) + "}", args[i]);
            }
        }

        return findElementBy(command[0], command[1]);
    }

    public final List<WebElement> GetMultipleElementReference(String objectReferenceId) throws Exception {

        String[] command = GetObjectValueAndType(objectReferenceId);
        if (command == null) {
            return null;
        }

        return findElementsBy(command[0], command[1]);
    }

    public String GetTextValue(String objectDefinition) throws Exception {

        if (this.isElementExist(objectDefinition)) {
            return this.GetElementReference(objectDefinition).getText();
        }
        return null;
    }

    public String GetTextValue(String objectDefinition, String...args) throws Exception {

        if (this.isElementExist(objectDefinition, args)) {
            return this.GetElementReference(objectDefinition, args).getText();
        }
        return null;
    }

    public final WebElement waitForElementToExist(long waitSeconds, String objectReferenceId, String... args) throws Exception {

        String[] command = GetObjectValueAndType(objectReferenceId);

        if (command[0] == null) {
            return null;
        }

        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].contains("'")) {
                command[0] = command[0].replace("'{" + Integer.toString(i) + "}'", "\"{" + args[i] + "}\"");
            } else {
                command[0] = command[0].replace("{" + Integer.toString(i) + "}", args[i]);
            }
        }

        try {
            switch (command[1].toLowerCase()) {
                case "id":
                    locateElement = By.id(command[0]);
                    break;
                case "name":
                    locateElement = By.name(command[0]);
                    break;
                case "linktext":
                    locateElement = By.linkText(command[0]);
                    break;
                case "partiallinktext":
                    locateElement = By.partialLinkText(command[0]);
                    break;
                case "tagname":
                    locateElement = By.tagName(command[0]);
                    break;
                case "classname":
                    locateElement = By.className(command[0]);
                    break;
                case "cssselector":
                    locateElement = By.cssSelector(command[0]);
                    break;
                case "xpath":
                    locateElement = By.xpath(command[0]);
                    break;
                case "direct":
                    isDirect = true;
                    break;
            }
            FluentWait<RemoteWebDriver> fluentWait = new FluentWait<>(driver);
            fluentWait.withTimeout(waitSeconds, TimeUnit.SECONDS);
            fluentWait.ignoring(NoSuchElementException.class);
            fluentWait.ignoring(NotFoundException.class);
            fluentWait.ignoring(ElementNotVisibleException.class);
            fluentWait.until((RemoteWebDriver remoteDrv) -> {

                    return remoteDrv.findElement(locateElement);

            });
        } catch (org.openqa.selenium.TimeoutException e) {
            return null;        // returning null to be caught as an assert in the @Test methods
        }
        finally {
            isDirect = false;   // very important to have it in finally as I cannot declare the variable as final as it is being set to true if it is a direct call
            // finally is guaranteed to be called when the method exits
        }
        return _webElement;

    }

    public final WebElement waitForElementToExist(long waitSeconds, String objectReferenceId) throws Exception {

        String[] command = GetObjectValueAndType(objectReferenceId);

        if (command[0] == null) {
            return null;
        }

        try {
            switch (command[1].toLowerCase()) {
                case "id":
                    locateElement = By.id(command[0]);
                    break;
                case "name":
                    locateElement = By.name(command[0]);
                    break;
                case "linktext":
                    locateElement = By.linkText(command[0]);
                    break;
                case "partiallinktext":
                    locateElement = By.partialLinkText(command[0]);
                    break;
                case "tagname":
                    locateElement = By.tagName(command[0]);
                    break;
                case "classname":
                    locateElement = By.className(command[0]);
                    break;
                case "cssselector":
                    locateElement = By.cssSelector(command[0]);
                    break;
                case "xpath":
                    locateElement = By.xpath(command[0]);
                    break;
                case "direct":
                    isDirect = true;
                    break;
            }
            FluentWait<RemoteWebDriver> fluentWait = new FluentWait<>(driver);
            fluentWait.withTimeout(waitSeconds, TimeUnit.SECONDS);
            fluentWait.ignoring(NoSuchElementException.class);
            fluentWait.ignoring(NotFoundException.class);
            fluentWait.ignoring(ElementNotVisibleException.class);
            fluentWait.until((RemoteWebDriver remoteDrv) -> {
                if (!isDirect) {
                    return remoteDrv.findElement(locateElement);
                } else {
//                    if (remoteDrv instanceof IOSDriver) {
//                        iosDriver = (IOSDriver) remoteDrv;
//                        return iosDriver.findElementByIosUIAutomation(command[0]);
//                    } else if (remoteDrv instanceof AndroidDriver) {
//                        androidDriver = (AndroidDriver) remoteDrv;
//                        return androidDriver.findElementByAndroidUIAutomator(command[0]);
//                    } else
                        return remoteDrv.findElement(locateElement);
                }
            });
        } catch (org.openqa.selenium.TimeoutException e) {
                return null;        // returning null to be caught as an assert in the @Test methods
        }
        finally {
                isDirect = false;   // very important to have it in finally as I cannot declare the variable as final as it is being set to true if it is a direct call
                // finally is guaranteed to be called when the method exits
        }
        return _webElement;
    }

    public String[] GetObjectValueAndType(String objectReferenceId) throws Exception {

        String[] command= null;
        String objectValue;

//        String findKey = os + "." + objectReferenceId;
        String findKey = objectReferenceId;
        if (properties == null) {
            FileInputStream fileInputStream = new FileInputStream(propertiesFile);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        }
        if (properties.containsKey(findKey)) {

            objectValue = properties.getProperty(findKey);
            if (objectValue.contains(GlobalConstants.DELIMETER))
                command = objectValue.split(GlobalConstants.DELIMETER);
        }
        return command;
    }

    private WebElement findElementBy(String objectReferenceValue, String objectReferenceType) throws Exception {

        WebElement webElement = null;

        if (objectReferenceValue == null) {
            return null;
        }

        try {
            switch (objectReferenceType.toLowerCase()) {
                case "id":
                    webElement = driver.findElementById(objectReferenceValue);
                    break;
                case "name":
                    webElement = driver.findElementByName(objectReferenceValue);
                    break;
                case "linktext":
                    webElement = driver.findElementByLinkText(objectReferenceValue);
                    break;
                case "partiallinktext":
                    webElement = driver.findElementByPartialLinkText(objectReferenceValue);
                    break;
                case "tagname":
                    webElement = driver.findElementByTagName(objectReferenceValue);
                    break;
                case "classname":
                    webElement = driver.findElementByClassName(objectReferenceValue);
                    break;
                case "cssselector":
                    webElement = driver.findElementByCssSelector(objectReferenceValue);
                    break;
                case "xpath":
                    webElement = driver.findElementByXPath(objectReferenceValue);
                    break;
            }
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            // Add logging info here
            return null;
        }
        return webElement;
    }

    private List<WebElement> findElementsBy(String objectReferenceValue, String objectReferenceType) throws Exception {

        List<WebElement> webElements = null;

        if (objectReferenceValue == null) {
            return null;
        }

        try {
            switch (objectReferenceType.toLowerCase()) {
                case "id":
                    webElements = driver.findElementsById(objectReferenceValue);
                    break;
                case "name":
                    webElements = driver.findElementsByName(objectReferenceValue);
                    break;
                case "linktext":
                    webElements = driver.findElementsByLinkText(objectReferenceValue);
                    break;
                case "partiallinktext":
                    webElements = driver.findElementsByPartialLinkText(objectReferenceValue);
                    break;
                case "tagname":
                    webElements = driver.findElementsByTagName(objectReferenceValue);
                    break;
                case "classname":
                    webElements = driver.findElementsByClassName(objectReferenceValue);
                    break;
                case "cssselector":
                    webElements = driver.findElementsByCssSelector(objectReferenceValue);
                    break;
                case "xpath":
                    webElements = driver.findElementsByXPath(objectReferenceValue);
                    break;
            }
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            // Add logging info here
            return null;
        }
        return webElements;
    }

}