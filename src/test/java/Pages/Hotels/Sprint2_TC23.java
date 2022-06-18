package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sprint2_TC23 extends Commands {

    //Destination box locators
    By clickDestination = By.xpath("//div[@id='destination_form_field-menu']");
    By destinationBox = By.xpath("//input[@id='destination_form_field']");
    By manhattanLocator = By.xpath("//div[text()='New York, New York, United States']");

    // check in and check out dates in the calender
    String monthDate_1 = "//h2[text()='";
    String monthDate_2 = "']/following-sibling::table//button[@data-day]";
    By calendarHeadingLocator = By.xpath("(//div[@data-stid='date-picker-month'])[1]//h2");
    By nextMonthArrowLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");
    By checkInBoxLocator = By.xpath("//button[@id='date_form_field-btn']");
    By doneButton = By.xpath("//button[@data-stid='apply-date-picker']");
    By searchButton = By.xpath("//button[@id='submit_button']");
    
    By star5Locator = By.xpath("//label[@aria-label='5★.']");
    By sortDropdownLocator = By.xpath("//select[@id='sort']");
    By all_5_StarsHotelsLocator = By.xpath(" //div[@class='uitk-rating']//span");
    By allHotelsPricesLocator = By.xpath("//div[contains(text(),'The price is')]/following-sibling::span//div");


    public void typeTheDestination (String cityName) {
        clickIt(clickDestination);
        Misc.pause(2);
        type(destinationBox,cityName);
        Misc.pause(2);
        clickIt(manhattanLocator);
    }
    public void clickCheckInTable () {
        clickIt(checkInBoxLocator);
    }
    public void goToTheMonth(String monthYear) {
        for (int i=0 ; i<12 ; i++) {
            if (getTextOfWebElement(calendarHeadingLocator).equalsIgnoreCase(monthYear)) {
                break;
            }
            clickIt(nextMonthArrowLocator);
        }
    }
    public void selectDateFromAnyMonth(String monthYear, String dateValue) {
        goToTheMonth(monthYear);
        By allDatesLocator = By.xpath(monthDate_1 + monthYear + monthDate_2);
        selectDateInCalendar(allDatesLocator, dateValue);
    }
    public void clickDoneBtn () {
        clickIt(doneButton);
    }
    public void clickOnSearchBtn () {

        clickIt(searchButton);
       // Misc.pause(2);
        MyDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void clickStarRating (String starNum) {

        clickIt(By.xpath("//label[@aria-label='" + starNum +  "★.']"));
       // Misc.pause(2);
        MyDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void selectSortOption (String option) {
        selectByVisibleText(sortDropdownLocator, option);
        Misc.pause(2);
    }
    public List<WebElement> verifyAllHotelsRated5Stars () {
        return findWebElements(all_5_StarsHotelsLocator);
    }
    public List<WebElement> verifyallhotelsPriceInIncreasedOrder () {
        return findWebElements(allHotelsPricesLocator);
    }


}
