package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Project_Feedback;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Project_FeedbackSD {

    Project_Feedback feedback = new Project_Feedback();


    @And("^I click feedback from sign in menu$")
    public void clickFeedback () {
        feedback.clickFeedback();
        Misc.pause(2);
    }
    @And("^I click submit button$")
    public void clickSubmit () {
        feedback.clickSubmit();
    }

    @Then("^verify error message is displayed$")
    public void erroeMessageIsDisplayed () {
        Commands.checkTrue(feedback.verifyErrorMessageIsDisplayed(), "Error message is not displayed when user submits empty feedback. ");
    }

    @Then("^verify red dots around stars is displayed$")
    public void redDotsAroundStarsDisplayed () {
        Commands.checkTrue(feedback.VerifyRedDotsAroundStarsIsDisplayed(), "Red dots around stars is not displayed when user submits empty feedback. ");
    }


}
