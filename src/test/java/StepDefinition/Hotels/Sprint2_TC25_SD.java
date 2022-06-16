package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Sprint2_TC25;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Sprint2_TC25_SD {

    Sprint2_TC25 fb = new Sprint2_TC25();


    @And("^I click on star (.+)$")
    public void chooseStar3 (String starNum) {
        fb.clickStar(starNum);
    }
    @And("^I type (.+) in comment box$")
    public void tybeInCommentsBox (String comment) {

        fb.typeInCommentBox(comment);
    }
    @And("^I choose from drop down$")
    public void selectFromDropDown () {
        fb.chooseFromDropDown();
    }
    @And("^I choose (.+) to answer first question$")
    public void pickYesForFirstQuestion (String data) {
        fb.clickOnYesBtn(data);
    }
    @And("^I choose (.+) to answer second question$")
    public void pickYesForSEcondQuestion (String data) {
        fb.clickDidUAccomplishYesBtn(data);
    }
    @Then("^Verify Thank you for your feedback message is displayed$")
    public void verifyThankYouMsgIsDisplayed () {
        Commands.checkTrue(fb.verifyThankUMsgDisplayed(),"Message is not displayed");
    }




}
