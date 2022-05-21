package StepDefinition.Darksky;

import Helper.Misc;
import Pages.Commands;
import Pages.Darksky.HW_5_TempsMatchInSameDay;
import Pages.Darksky.HW_5_TimeMachineDates;
import Web.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HW_6_TimeMachineSD {

    HW_5_TimeMachineDates tMachine = new HW_5_TimeMachineDates();
    Commands scroll = new Commands();
    HW_5_TempsMatchInSameDay tempSummary = new HW_5_TempsMatchInSameDay();


    @Given("^I am on darksky home page$")
    public void openDarkskyPage () {
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
    }

    @When("^I scroll down to the bottom of the page$")
    public void scrollToTheBottom () {
        scroll.scrollToBottom();
    }

    @And("^I click on Time Machine button$")
    public void clickTimeMachineBtn () {
        tMachine.clickTimeMachineBttn();
    }

    @Then("^I verify today day is highlighted$")
    public void verifyTheDateIsHighlited() {
        Assert.assertTrue(tMachine.isCurrentDateHighlighted(), "Error");
    }




    @When("^I scroll down to daily weather summary$")
    public void scrollToDailySummary () {
        scroll.scroll();
    }

   @When("^I click on daily weather summary bar$")
    public void clickOnDailySummaryBar () {
        tempSummary.clickTodayTempBar();
   }



    @Then("^I verify low temps are equals and high temps are equals$")
    public void verifyLowAndHighTempAreEquals () {
        int lowTempConvert = Misc.removeDegreeAndGetTempAsInt(tempSummary.getLowTempPresent());
        int highTempConvert = Misc.removeDegreeAndGetTempAsInt(tempSummary.getHighTempPresent());
        int lowTempConvertAfterClick = Misc.removeDegreeAndGetTempAsInt(tempSummary.getLowTempAfterClick());
        int highTempConvertAfterClick = Misc.removeDegreeAndGetTempAsInt(tempSummary.getHighTempAfterClick());

        Assert.assertTrue(lowTempConvert == lowTempConvertAfterClick && highTempConvert == highTempConvertAfterClick, "Temps not equal");
    }



















}
