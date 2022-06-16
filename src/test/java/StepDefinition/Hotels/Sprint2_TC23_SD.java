package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Sprint2_TC23;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sprint2_TC23_SD {


    Sprint2_TC23 st = new Sprint2_TC23();


    @And("^I type (.+) in destination$")
    public void typeInDestinationBox (String cityName) {
        st.typeTheDestination("manhattan".toUpperCase());
        Misc.pause(2);
    }

    @When("^I enter checkin date and checkout date$")
    public void getCheckinAndOutDates () {
        st.clickCheckInTable();
        st.selectDateFromAnyMonth("August 2022","10");
        st.selectDateFromAnyMonth("August 2022","15");
        st.clickDoneBtn();
        Misc.pause(2);
        st.clickOnSearchBtn();

    }
    @When("^I click star rating (.+)$")
    public void clickStar (String starNum) {
        st.clickStarRating(starNum);
    }

    @And("^I Select (.+) from sort-by dropdown$")
    public void selectFromDropDown (String option) {
        st.selectSortOption(option);
        Misc.pause(5);
    }

    @Then("^verify all listed hotels are 5 stars$")
    public void verifyAllHotelslistedFiveStars () {
        List<WebElement> starsRating = st.verifyAllHotelsRated5Stars();
        boolean allRatingFound = true;
        for (WebElement oneHotelRating : starsRating) {
            if (!oneHotelRating.getText().equals( "5 out of 5")) {
                allRatingFound = false;
                break;
            }
        }
        Commands.checkTrue(allRatingFound, " not all hotels got 5 stars");
    }

    @Then("^verify all hotels are listed from low to high by price$")
    public void verifyAllHotelsAreSortedInIncreasedOrderByPrice () {
        List<WebElement> hotelsPrice = st.verifyallhotelsPriceInIncreasedOrder();
        boolean isSorted = true;
        int startingPrice = Integer.valueOf(hotelsPrice.get(0).getText().split("\\$")[1]);
        for (WebElement oneHotelPrice : hotelsPrice) {
            int followingHotelPrice = Integer.valueOf(oneHotelPrice.getText().split("\\$")[1]);
           // System.out.println("***** " + followingHotelPrice);
            if ( followingHotelPrice < startingPrice ) {
                isSorted = false;
                break;
            } else {

                startingPrice = followingHotelPrice;
            }
        }
        Commands.checkTrue(isSorted, " Hotels are not sorted in increased order by pricing");
    }







}
