package StepDefinition.Hotels;

import Pages.Commands;
import Pages.Hotels.Sprint2_TC22;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class Sprint2_TC22_SD {

    Sprint2_TC22 sUp = new Sprint2_TC22();


    @And("^I type invalid email (.+)$")
    public void typeInvaildEmail (String email) {
        sUp.typeEmail(email);
    }

    @Then("^Verify error message is displayed after entering invalid email$")
    public void verifyerrorMsgIsDisplayed () {
        Commands.checkTrue(sUp.verifyErrorEmailDisplayed(),"Error msg is not displayed");
    }

    @And("^I type invalid first name (.+)$")
    public void typeInvaildFirstName (String name) {
        sUp.typeFirstName(name);
    }

    @Then("^Verify error message is displayed after entering invalid first name$")
    public void verifyerrorMsgIsDisplayedForInvalidFName () {
        Commands.checkTrue(sUp.verifyErrorFirstNameDisplayed(),"Error msg is not displayed");
    }

    @And("^I type invalid last name (.+)$")
    public void typeInvaildLastName (String name) {
        sUp.typeLastName(name);
    }

    @Then("^Verify error message is displayed after entering invalid last name$")
    public void verifyerrorMsgIsDisplayedForInvalidLName () {
        Commands.checkTrue(sUp.verifyErrorLastNameDisplayed(),"Error msg is not displayed");
    }

    @And("^I type invalid password (.+)$")
    public void typeInvaildPassword (String password) {
        sUp.typePassword(password);
    }

    @Then("^verify Keep me signed in checkbox is displayed$")
    public void verifyKeepMeSignedInBoxDisplayed () {
        Commands.checkTrue(sUp.verifyKeepSignInBoxDisplayed(),"Keep me signed in check box is not displayed ");
    }

    @Then("^verify Keep me signed in checkbox is enabled$")
    public void verifyKeepMeSignedInIsEnabled () {
        Commands.checkTrue(sUp.verifyKeepSignInBoxEnabled(),"Keep me signed in box is not enabled");
    }
    @Then("^verify “Continue” button is displayed$")
    public void verifyContinueBtnIsDisplayed () {
        Commands.checkTrue(sUp.verifyContinueBtnDisplayed(), "Continue btn is not displayed");
    }
    @Then("^verify “Continue” button is NOT enabled$")
    public void verifycontinueBtnIsNotEnabled () {
        Commands.checkTrue(!sUp.verifyContinueBtnNotEnabled(), " continue btn is enabled");
    }









}
