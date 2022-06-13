package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.Project_Calender;
import cucumber.api.java.en.When;

public class Project_CalenderSD {

    Project_Calender cal = new Project_Calender();

    @When("^I click checkin box$")
    public void clickCheckInTable () {
        cal.clickCheckInTable();
    }

    @When("^I click checkout box$")
    public void clickCkecoutTable () {
        cal.clickCheckOutTable();

    }

    @When("^verify arrow is disabled$")
    public void verifyLeftArrowIsDisabled () {
        Commands.checkFalse(cal.leftArrowEnabled(),"Left arrow is enabled.");
    }


    @When("^verify dates are disabled$")
    public void disabledDates () {
        Commands.checkEquals(cal.disabledDatesInCalender().size(),Misc.getCurrentDateAsInt()-1,"Dates are not disabled in current month.");

    }




}
