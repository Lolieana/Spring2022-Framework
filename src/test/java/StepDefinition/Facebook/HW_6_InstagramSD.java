package StepDefinition.Facebook;

import Helper.Misc;
import Pages.Commands;
import Pages.Facebook.HW_5_FacebookLinks;
import Web.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HW_6_InstagramSD {

    HW_5_FacebookLinks links = new HW_5_FacebookLinks();



    @Given("^I am on Facebook home page$")
    public void launchFacebookPage () {
        MyDriver.launchUrlOnNewWindowWithWait("https://www.facebook.com/");
        Misc.pause(2);
    }

    @When("^I Click on Facebook Pay$")
    public void openFacebookPay () {
        links.clickFacebookPay();
        Misc.pause(2);
    }

    @And("^I Click on Oculus$")
    public void openOculus () {
        links.clickOculus();
        Misc.pause(2);
    }

    @And("^I Click on Instagram$")
    public void openInstagram () {
        links.clickInstagram();
        Misc.pause(2);
    }

    @And("^I Click on Portal$")
    public void openPortal () {
        links.clickPortal();
        Misc.pause(2);
    }

    @And("^I click on Bulletin$")
    public void openBulletin () {
        links.clickBulletin();
        Misc.pause(2);
    }

    @And("^I Close ALL windows except Instagram$")
    public void closeAllLinksButInstagram () {
        links.closeLinks();
    }

    @Then("^I Verify number of window-Handles is 1$")
    public void getNumberOfWindowHandles () {
        Commands.checkEquals(Commands.getAllWindowHandles().size(), 1, "more than one window");
    }

    @Then("^I Verify Page Title is Instagram$")
    public void getInstagramTitle () {
        Commands.checkEquals(Commands.getTitle(),"Instagram","Title is not same");
    }


    @Then("^Verify Log in button on Instagram is disabled by default$")
    public void verifyIntagramLogInIsDisabled () {
        Commands.checkTrue(links.isInstagramLogInBtnDisabled(),"is enabled");
    }









}
