package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.HW_7_PopularFilters;
import Web.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW_7_PopularFilterSD {
    HW_7_PopularFilters pf = new HW_7_PopularFilters();


    @Given("^I am on Hotels main page$")
    public void launchHotelsMainPage () {
        MyDriver.launchUrlOnNewWindowWithWait("https://www.hotels.com/");
    }

    @When("^I choose checkin date and choose checkout date$")
    public void getCheckinDate () {
        pf.clickCheckInBox();
        pf.selectDateFromAnyMonth("June 2022","15");
        pf.selectDateFromAnyMonth("June 2022","18");
        pf.clickDoneBtn();

    }

    @Then("^I type my destination$")
    public void getDestination () {
        pf.clickDestinationBox();
        pf.typeDestination();
        pf.pickDestination();
    }

    @And("^I click search$")
    public void clickSearch () {
        pf.clickSearch();
        Misc.pause(5);
    }

    @Then("^Verify all popular filters are not selected$")
    public void verifyAllPopularFiltersNotSelected () {
       List<WebElement> popularFilters = pf.getAllPopularFilters();
       boolean isNotSelected = true;
        for (WebElement oneFilter : popularFilters) {
            if (oneFilter.isSelected()) {
                isNotSelected = false;
                break;
            }
        }
        Commands.checkTrue(isNotSelected,"Popular Filters are selected ");
    }

    @And("^I select (.+) option$")
    public void selectFromDropDown (String option) {
        pf.selectSortOption(option);
        Misc.pause(5);
    }

    @Then("^Verify first option is lowest price$")
    public void verifyFirstSelectHotelIslowest () {
        String getText =  pf.getFirstSelectPrice().substring(1);
        int convert = Integer.valueOf(getText);
        Commands.checkTrue(convert <= 100, "Price is greater than 100");

    }

    @Then("^Verify rating is sorted in increasing order$")
    public void verifyRatingInIncreasedOrder () {
        List<WebElement> sortedStars = pf.getRatingElements();
        boolean isNotSorted = true;
        int num = 1;
        for (WebElement element : sortedStars) {
           int starValue = Character.getNumericValue(element.getText().charAt(0));
           if (starValue != num) {
                isNotSorted = false;
                break;
            }
            num++;
        }
        Commands.checkTrue(isNotSorted,"Stars are not sorted ");

    }


    @When("^I type my invalid property search$")
    public void typeInPropertySearchBtn () {
        Misc.pause(5);
        pf.typeWrongPropertyName();
        Misc.pause(5);
    }

    @Then("^Verify error message is displayed$")
    public void getErrorMessage () {
       // pf.verifyErrorMessageDisplayed();
        Commands.checkTrue(pf.verifyErrorMessageDisplayed(), "Erroe message is not displayed ");
    }

    @Then("^Verify the invalid data entered is displayed as one of the filters$")
    public void verifyIfTheElementExit () {
        Commands.checkTrue(pf.checkIfInvalidEnterIsPartOfFilters(), "Invalid data entered is not part of the filters");
    }
























}
