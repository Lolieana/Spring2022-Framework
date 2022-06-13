package StepDefinition.Hotels;

import Pages.Commands;
import Pages.Hotels.Project_SignUp;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Project_SignUpSD {

    Project_SignUp signUp = new Project_SignUp();
    String startWindowHandle;
    String termsWindowHandle;
    String privacyWindowHandle;

    @When("^I signup it is free from sign in menu$")
    public void clickSignUp () {
        startWindowHandle = signUp.clickSignUpLink();
    }
    @And("^I click Terms and conditions link$")
    public void swichToTermsAndCondNewPage () {
        termsWindowHandle = signUp.clickTermsAndCondLink();
    }
    @When("^Verify terms and conditions link open on new page$")
    public void verifyTermsAndConditionOpenInNewTab () {
        Commands.checkTrue(!startWindowHandle.equals(termsWindowHandle) && signUp.termsAndCondHeaderExist(), "Terms and condition not on the new page");

    }
    @And("^I click privacy statements link$")
    public void swichToPrivacyStatNewPage () {
        privacyWindowHandle = signUp.clickPrivacyStatLink();
    }

    @When("^Verify privacy statements link open correct page on new tab$")
    public void verifyPrivacyStatOpenInNewTab () {
        Commands.checkTrue(!startWindowHandle.equals(privacyWindowHandle) && signUp.privacyHeaderExist(), "Privacy statement not on the new page");

    }








}
