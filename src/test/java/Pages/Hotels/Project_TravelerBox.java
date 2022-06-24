package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class Project_TravelerBox extends Commands {

   // By travelersBox = By.xpath("//div[@id='adaptive-menu']");
    By travelersBox = By.xpath("(//div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder'])[2]");
    By childrenIncreaseBtn = By.xpath("(//span[@class='uitk-step-input-button'])[4]");
    By adultIncreaseBtn = By.xpath("(//span[@class='uitk-step-input-button'])[2]");
    //By dropDownChildAge = By.xpath("//select[@id='child-age-input-0-0']");
    By dropDownChildAge = By.xpath("//select[@id='age-traveler_selector_children_age_selector-0-0']");
   // By doneButton = By.xpath("//button[@data-testid='guests-done-button']");
    By doneButton = By.xpath("//button[@id='traveler_selector_done_button']");
    //By dropDownChildAge_2 = By.xpath("//select[@id='child-age-input-0-1']");
    By dropDownChildAge_2 = By.xpath("//select[@id='age-traveler_selector_children_age_selector-0-1']");

   // By adultGuestsNumberLocator = By.xpath("//input[@id='adult-input-0']");
    By adultGuestsNumberLocator = By.xpath("//input[@id='traveler_selector_adult_step_input-0']");
    //By childrenGuestsNumberLocator = By.xpath("//input[@id='child-input-0']");
    By childrenGuestsNumberLocator = By.xpath("//input[@id='traveler_selector_children_step_input-0']");
    //By numOfGuestsOnHomePage = By.xpath("//button[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']");
    By numOfGuestsOnHomePage = By.xpath("//label[text()='Travelers']//following-sibling::input");



    public void clickTravelersBox () {
        clickIt(travelersBox);
    }
    public void clickChildrenIncreaseBtn () {
        clickIt(childrenIncreaseBtn);
    }

    public void clickAdultIncreaseBtn () {
        clickIt(adultIncreaseBtn);
    }
    public void getChildrenAgeFromDropDown_1 () {
        selectInDropdown(dropDownChildAge,"4");
    }
    public void getChildrenAgeFromDropDown_2 () {
        selectInDropdown(dropDownChildAge_2,"Under 1");
    }
    public void clickOnDoneBtn () {
        clickIt(doneButton);
    }

    public String getAdultNumber () {
       return getAttributeValueFromWebElement(adultGuestsNumberLocator,"value");
    }

    public String getChildrenNumber () {
        return getAttributeValueFromWebElement(childrenGuestsNumberLocator,"value");
    }
    public String getNumberOfGuestsOnHomePage () {
        return getAttributeValueFromWebElement(numOfGuestsOnHomePage,"value");
    }





}
