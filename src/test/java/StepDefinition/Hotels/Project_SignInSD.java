package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Project_SignIn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Project_SignInSD {
    Project_SignIn signIn = new Project_SignIn();


    @Then("^I click header sign in$")
    public void clickSignIn () {
        signIn.clickSignIn();
        Misc.pause(2);
    }

    @Then("^I click sign in from the menu$")
    public void clickSecondSignInBtn () {
        signIn.clickSecondSignIn();
        Misc.pause(2);
    }

    @Then("^I type invalid email$")
    public void enterInvalidEmail () {
        signIn.typeEmailAddress("abcd@test.com");
    }

    @And("^I type invalid password$")
     public void typeInvalidPassword () {
     signIn.typePassword("gtheyhfd");
     Misc.pause(3);
     }

     @And("^I click login button$")
    public void clickSubmit () {
        signIn.clickLogin();
     }

     @Then("^verify verification message is displayed$")
    public void verifyTryAgainMsgDisplayed () {
        Commands.checkTrue(signIn.verifyErrorMsgIsDisplayed(),"Error message is not displayed");
     }





}
