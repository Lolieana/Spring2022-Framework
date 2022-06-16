package Pages.Hotels;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW_7_PopularFilters extends Commands {

    String monthDates_1 = "//h2[text()='";
    String monthDates_2 = "']/following-sibling::table//button[@data-day]";
    By calendarHeading = By.xpath("(//div[@data-stid='date-picker-month'])[1]//h2");
    By nextMonthArrow = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");
    By checkInBoxLocator = By.id("d1-btn");
    By checkOutBoxLocator = By.id("d2-btn");
    By clickDestinationBox = By.xpath("//button[@data-stid='location-field-destination-menu-trigger']");
    By destinationBox = By.xpath("//input[@id='location-field-destination']");
    By newYorkLocator = By.xpath("//div[text()='New York, United States']");
    By searchButton = By.xpath("//button[text()='Search']");
    By allPopularFiltersLocator = By.xpath("//input[@name='popularFilter']");
    By doneBtton = By.xpath("//button[@data-stid='apply-date-picker']");
    By sortDropdownLocator = By.xpath("//select[@id='sort']");
    By firstSelectOption = By.xpath("(//div[contains(text(),'The price is')]/following-sibling::span//div)[1]");
    By allStarslocator = By.xpath("//div[@class='uitk-button-toggle']//span");
    By searchByPropertyName = By.xpath("//button[@aria-label='Search by property name']/parent::div");
    By typeInPropertyBox = By.xpath("//input[@placeholder='e.g. Best Western']");
    By errorMessagelocator = By.xpath("//h3[text()='No matches']");
    By filterlocator= By.xpath("//div[@data-stid='playback-filter-pill-container']//button[@aria-label='Remove pppp']");











    public void clickCheckInBox () {
        clickIt(checkInBoxLocator);
    }


    public void clickCheckOutBox () {
        clickIt(checkOutBoxLocator);
    }

    public void goToMonth(String monthYear) {
        for (int i=0 ; i<12 ; i++) {
            if (getTextOfWebElement(calendarHeading).equalsIgnoreCase(monthYear)) {
                break;
            }
            clickIt(nextMonthArrow);
        }
    }

    public void selectDateFromAnyMonth(String monthYear, String dateValue) {
        goToMonth(monthYear);
        By allDatesLocator = By.xpath(monthDates_1 + monthYear + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValue);
    }

    public void clickDoneBtn () {
        clickIt(doneBtton);
    }

    public void clickDestinationBox () {
        clickIt(clickDestinationBox);
    }

    public void typeDestination () {
        type(destinationBox, "New York".toUpperCase());
    }

    public void pickDestination () {
        clickIt(newYorkLocator);
    }

    public void clickSearch () {
        clickIt(searchButton);
    }

    public List<WebElement> getAllPopularFilters () {
        return findWebElements(allPopularFiltersLocator);
    }

    public void selectSortOption (String option) {
        selectByVisibleText(sortDropdownLocator, option);
    }

    public String getFirstSelectPrice () {
        return getTextOfWebElement(firstSelectOption);
    }

    public List<WebElement> getRatingElements () {
        return findWebElements(allStarslocator);
    }

    public void typeWrongPropertyName () {
        clickIt(searchByPropertyName);
        type(typeInPropertyBox, "pppp");
        pressEnterButton(typeInPropertyBox);
    }

    public boolean verifyErrorMessageDisplayed () {
       return isElementDisplayed(errorMessagelocator);
    }

    public boolean checkIfInvalidEnterIsPartOfFilters () {
        return isElementExist(filterlocator);
    }


}
