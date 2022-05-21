package Pages;

import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Set;


public class Commands {

    // Create a local method to find WebElement
    public WebElement findWebElement(By locator) {

        return MyDriver.getDriver().findElement(locator);
    }

    // check if the element exists in the dom
    public boolean isElementExist (By locator) {
        try {
            findWebElement(locator);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }





     // get title
    public static String getTitle () {
        return MyDriver.getDriver().getTitle();
    }


    // Create a local method to type in the webElement
    public void type(By locator, String data) {
        findWebElement(locator).sendKeys(data);
    }

    // Create a local method to find WebElements
    public List<WebElement> findWebElements(By locator) {
        return MyDriver.getDriver().findElements(locator);
    }

    public String getTextOfWebElement(By locator) {
        return findWebElement(locator).getText();
    }


    public String getAttributeValueFromWebElement(By locator, String attribute) {
        return findWebElement(locator).getText();
    }


    // Create a local method to click on the webElement
    public void clickIt(By locator) {
        findWebElement(locator).click();
    }

    // Create a local method to click on the webElement after scroll
    public void clickItWithScroll(By locator) {
        WebElement webElement = scrollToElement(locator);
        Misc.pause(2);
        webElement.click();
    }


    // Create a local method to find if element is enabled
    public boolean isElementEnabled(By locator) {
        return findWebElement(locator).isEnabled();
    }

    // Create a local method to select a value from a dropdown
    public void selectInDropdown(By locator, String dataToSelect) {
        WebElement ddElement = findWebElement(locator);
        Select dropdown = new Select(ddElement);
        dropdown.selectByVisibleText(dataToSelect);
    }

    // Create a local method to find if element is displayed
    public boolean isElementDisplayed(By locator) {
        return findWebElement(locator).isDisplayed();
    }

    // Create custom method to scroll
    public WebElement scrollToElement(By locator) {
        WebElement element = null;
        for (int i=0 ; i <= 15 ; i++) {
            try {
                element = findWebElement(locator);
                break;
            } catch ( ElementClickInterceptedException | NoSuchElementException e) {
                //scroll by 100
                JavascriptExecutor js =  (JavascriptExecutor) MyDriver.getDriver();
                js.executeScript("scrollBy(0,100)");
            }
        }
        return element;
    }

    public void scroll () {
        JavascriptExecutor js =  (JavascriptExecutor) MyDriver.getDriver();
        js.executeScript("scrollBy(0,800)");
        Misc.pause(2);
    }

    public void scrollToBottom() {

        JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Misc.pause(2);
    }
   // switch between two windows
    public static void switchToSecondWindow () {
        Set<String> allHandles = getAllWindowHandles();
        String fbWindowHandle = getCurrentWindowHandle();
        for (String handle : allHandles) {
            if (!handle.equals(fbWindowHandle)) {
                MyDriver.getDriver().switchTo().window(handle);
                break;
            }
        }
    }

    // custom methods to switch to a window
    public void switchToWindow(String newHandle) {
        MyDriver.getDriver().switchTo().window(newHandle);
    }

    // custom method to get current window-handle
    public static String getCurrentWindowHandle() {
        return MyDriver.getDriver().getWindowHandle();
    }

    // custom method to get all window-handles
    public static Set<String> getAllWindowHandles() {
        return MyDriver.getDriver().getWindowHandles();
    }

    // custom method to select date from Calendar
    public void selectDateInCalendar(By locator, String userDate) {
        List<WebElement> allDates = MyDriver.getDriver().findElements(locator);
        for (WebElement dateElement : allDates) {
            String dateValue = dateElement.getAttribute("data-day");
            if (dateValue.equals(userDate)) {
                dateElement.click();
                break;
            }
        }
    }

    public void selectFromSuggestions(By locator, String userSuggestion) {
        List<WebElement> allSuggestions = MyDriver.getDriver().findElements(locator);
        for (WebElement suggestion : allSuggestions) {
            if(suggestion.getText().equalsIgnoreCase(userSuggestion)) {
                suggestion.click();
                break;
            }
        }
    }



    // Method to perform Assert Equals
    public static void checkEquals(String v1, String v2, String msg) {
        Assert.assertEquals(v1, v2, msg);
    }

    // Method to perform Assert Equals
    public static void checkEquals(int v1, int v2, String msg) {
        Assert.assertEquals(v1, v2, msg);
    }

    // Method to perform Assert True
    public static void checkTrue(boolean b1, String msg) {
        Assert.assertTrue(b1, msg);
    }

    // Method to perform Assert False
    public static void checkFalse(boolean b1, String msg) {
        Assert.assertFalse(b1, msg);
    }









}
