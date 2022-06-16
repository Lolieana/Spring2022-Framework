package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Sprint2_TC26;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Sprint2_TC26_SD {
    Sprint2_TC26 links = new Sprint2_TC26();

    @And("^I click more travel$")
    public void clickOnTravel () {
        links.clickOnMoreTravelBox();
    }

    @And("^I click on deals$")
    public void pickDeals () {
        links.clickOnDeals();
    }
    @Then("^verify manage your booking link is displayed$")
    public void verifyManageYourBookingDisplayed () {
        Commands.checkTrue(links.checkManageYourBookingDisplayed(), " not display");
    }

    @Then("^verify manage your booking link is enabled$")
    public void verifyManageYourBookingIsEnabled () {
        Commands.checkTrue(links.checkManageYourBookingEnabled(), " not enabled");
    }
    @And("^I click manage your booking$")
    public void clickManageYourBooking () {
        links.clickManageYourBooking();
    }
    @Then("^verify title is displayed$")
    public void isTitleDisplayed () {
        Commands.checkTrue(links.verifySearchBookAndSaveTitleDisplayed(), " not displayed");
        Misc.pause(2);
        Commands.goBack();
    }

    @Then("^verify stay flexible link is displayed$")
    public void verifyStayFlexDisplayed () {
        Commands.checkTrue(links.checkStayFlexibleDisplayed(), "not display");
    }

    @Then("^verify stay flexible link is enabled$")
    public void verifyStayFlexEnabled () {
        Commands.checkTrue(links.checkStayFlexibleEnabled(), "not enabled");
    }

    @And("^I click stay flexible$")
    public void clickStayFlexLink () {
        links.clickStayFlexible();
    }

    @Then("^verify amazing deals title is displayed$")
    public void verifyAmazingDealsTitleDisplay () {
        Commands.checkTrue(links.verifyAmazingDealsTitleDisplayed(), " is not displayed");
        Misc.pause(2);
        Commands.goBack();
    }

    @Then("^verify save on your next trip link is displayed$")
    public void verifySaveOnYourNextTripDisplayed () {
        Commands.checkTrue(links.checkSaveOnYourNextTripDisplayed(), " not display");
    }

    @Then("^verify save on your next trip link is enabled$")
    public void verifySaveOnYourNextTripEnabled () {
        Commands.checkTrue(links.checkSaveOnYourNextTripEnabled(), " not enabled");
    }

    @And("^I click save on your next trip$")
    public void clickOnSaveOnYOurNextTrip () {
        links.clickSaveOnYourNextTrip();
    }

    @Then("^verify Save on your next trip to the great outdoors title is displayed$")
    public void verifySaveOnYourNextTripTitleDisplayed () {
        Commands.checkTrue(links.verifySaveOnYourNextTripGreatTitleDisplayed(), " Not display");
    }














}
