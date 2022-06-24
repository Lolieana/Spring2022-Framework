package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Project_TravelerBox;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Project_TravelerBoxSD {
    Project_TravelerBox gn = new Project_TravelerBox();

    @When("^I click traveler box$")
    public void clickTravelerBox () {
        gn.clickTravelersBox();
    }
    @Then("^I increase adults number$")
    public void addAdults () {
       for (int i=1; i<= 6-2; i++) {
           gn.clickAdultIncreaseBtn();

       }

    }
    @Then("^I increase children number$")
    public void clickChildrenBtn () {
        for (int i = 1; i <= 2; i++) {
            gn.clickChildrenIncreaseBtn();
        }
    }
    @Then("^I choose first children age$")
    public void addChildrenAge () {
        gn.getChildrenAgeFromDropDown_1();
        gn.getChildrenAgeFromDropDown_2();
    }
    @Then("^I choose second children age$")
    public void addChildrenAge_2 () {
        gn.getChildrenAgeFromDropDown_2();
        Misc.pause(2);
        gn.clickOnDoneBtn();
    }
    @Then("^verify  number of guests are matching$")
    public void verifyNumberOfGuestsAreMatching () {
       int numOfAdultInInt =  Integer.valueOf(gn.getAdultNumber());
        int numOfChildrenInInt =  Integer.valueOf(gn.getChildrenNumber());
        int totalNumber = numOfAdultInInt + numOfChildrenInInt;

        String textAfterSplit = gn.getNumberOfGuestsOnHomePage().split(" ")[0];
        int totalOnHomePage = Integer.valueOf(textAfterSplit);
        Commands.checkEquals(totalNumber,totalOnHomePage,"Sum of adult and children in Traveler box are not matching as selected.");




    }







}
