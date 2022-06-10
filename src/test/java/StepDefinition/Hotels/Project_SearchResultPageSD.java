package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Project_SearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class Project_SearchResultPageSD {

    Project_SearchResultPage sr = new Project_SearchResultPage();


    @And("^I type (.+) in destination box$")
    public void typeInDestinationBox (String cityName) {
        sr.typeTheDestination("bora".toUpperCase());
        Misc.pause(2);
    }

    @When("^I enter checkin and checkout dates$")
    public void getCheckinAndOutDates () {
        sr.clickCheckInTable();
        sr.selectDateFromAnyMonth("August 2022","1");
        sr.selectDateFromAnyMonth("August 2022","10");
        sr.clickDoneBtn();
        Misc.pause(2);
        sr.clickOnSearchBtn();

    }

    @Then("^I verify tell us how we can improve our site text is displayed$")
    public void verifyHowWeCanImproveTextIsDisplayed () {
        Commands.checkTrue(sr.howWeImproveIsDisplayed(),"Tell us how we can improve our site text is not displayed");
    }


    @Then("^I verify share feedback button is displayed$")
    public void verifyShareFeedbackIsDidplayed () {
       Commands.checkTrue(sr.isShareFeedbackDisplayed(),"Share Feedback Link is not displayed");

    }

    @Then("^I verify share feedback button is enabled$")
    public void verifyShareFeedbackIsEnabled () {
        Commands.checkTrue(sr.isShareFeedbackEnabled(),"Share Feedback Link is not enabled");

    }








}
