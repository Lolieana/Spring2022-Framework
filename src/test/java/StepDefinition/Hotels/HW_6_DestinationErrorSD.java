package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.HW_6_destinationErrorMsg;
import Web.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HW_6_DestinationErrorSD {
    Commands hotels = new Commands();
    HW_6_destinationErrorMsg msg = new HW_6_destinationErrorMsg();
    String guestBefore = "";
    String guestAfter = "";


    @Given("^I am on Hotels home page$")
    public void lauchHotelPage () {
        MyDriver.launchUrlOnNewWindowWithWait("https://www.hotels.com/");
    }

    @When("^I Click on search button$")
    public void clickSearchBox () {
        msg.clickOnSearchBtn();
    }

    @Then("^Verify error destination message is displayed on home page$")
    public void errorMsgIsDisplayed () {
       Commands.checkTrue(msg.destinationErrorMsgDisplayed(),"Error message is not displayed");
    }

    @When("^I Click on travelers button$")
    public void clickTravelersBtn () {
        msg.clickTravelersBox();
    }

    @When("^I click on add children button$")
    public void clickAddChildrenBtn () {
        msg.clickChildrenIncreasBtn();
    }

    @Then("^Verify Please provide the ages of children error message is displayed$")
    public void verifyAddChildrenErrorMsgIsDisplayed () {
        Commands.checkTrue(msg.childrenAgeErrorMsgIsDisplayed(),"Error msg is not displayed");
    }

    @And("^I select children age$")
    public void selectChildrenAge () {
        msg.getChildrenAgeFromDropDown();
        Misc.pause(3);
    }

    @Then("^Verify ages of children message is not displayed$")
    public void verifyAddChildrenErrorMsgIsNotDisplayed () {
        Commands.checkTrue(msg.childrenAgeErrorMsgIsNotDisplayed(),"Error msg is displayed");
    }

    @And("^I click done button$")
    public void clickDoneBtn () {
        msg.clickOnDoneBtn();
        Misc.pause(2);
    }

    @And("^I get the number of guests from travelers box$")
    public void getGuestsNum () {
        guestBefore = msg.getGuestsNumBeforeClickSearch();
    }

    @And("^I type where i am going in destination box$")
    public void typeInDestinationBox () {
        msg.typeInDestinationBox();
        Misc.pause(2);
    }

    @And("^I click search button$")
    public void clickSearch () {
        msg.clickOnSearchBtn();
        Misc.pause(2);
    }

    @And("^I get the guest number after click search$")
    public void guestsNumAfterclick () {
        guestAfter = msg.getGuestsNumAfterClickSearch();
    }

    @Then("^Verify number of guests is displayed on home page are same number after click search$")
    public void verifyGuestsNumAreEquals () {
        Commands.checkEquals(guestBefore, guestAfter,"Guests number do not match");
    }







}
