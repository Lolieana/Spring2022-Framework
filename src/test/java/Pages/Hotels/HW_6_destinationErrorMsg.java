package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class HW_6_destinationErrorMsg extends Commands {


    By searchButton = By.xpath("//button[text()='Search']");
    By destinationMegError = By.xpath("//div[text()='Please select a destination']");
    By travelersBox = By.xpath("//div[@id='adaptive-menu']");
    By childrenIncreaseBtn = By.xpath("(//span[@class='uitk-step-input-button'])[4]");
    By childrenAgeError = By.xpath("//h3[text()='Please provide the ages of children.']");
    By dropDownChildAge = By.xpath("//select[@id='child-age-input-0-0']");
    By doneButton = By.xpath("//button[@data-testid='guests-done-button']");
    By clickDestination = By.xpath("//button[@data-stid='location-field-destination-menu-trigger']");
    By destinationBox = By.xpath("//input[@id='location-field-destination']");
    By newYorkLocator = By.xpath("//div[text()='New York, United States']");
    By travelersNumBeforeClickSearch = By.xpath("//button[@data-testid='travelers-field-trigger']");
    By travelersNumAfterClickSearch = By.xpath("//div[@class='uitk-field-label']//span");


    


    public void clickOnSearchBtn () {
        clickIt(searchButton);
    }

    public boolean destinationErrorMsgDisplayed () {
        return isElementDisplayed(destinationMegError);
    }

    public void clickTravelersBox () {
        clickIt(travelersBox);
    }

    public void clickChildrenIncreasBtn () {
        clickIt(childrenIncreaseBtn);
    }

    public boolean childrenAgeErrorMsgIsDisplayed () {
        return isElementDisplayed(childrenAgeError);
    }

    public boolean childrenAgeErrorMsgIsNotDisplayed () {
        return !isElementExist(childrenAgeError);
    }

    public void getChildrenAgeFromDropDown () {
        selectInDropdown(dropDownChildAge,"2");
    }

    public void clickOnDoneBtn () {
        clickIt(doneButton);
    }

    public void typeInDestinationBox () {
        clickIt(clickDestination);
        type(destinationBox,"New York");
        Misc.pause(2);
        clickIt(newYorkLocator);
    }

    public String getGuestsNumBeforeClickSearch () {
        return getTextOfWebElement(travelersNumBeforeClickSearch);
    }

    public String getGuestsNumAfterClickSearch () {
       return getTextOfWebElement(travelersNumAfterClickSearch);
    }






}
