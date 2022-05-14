package Tests.Darksky;

import Pages.Darksky.HW_5_TimeMachineDates;
import Web.MyDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LandingPage {

    // Verify user is able to click Time Machine button
    /*
        Steps:
        1. Launch darksky page
        2. Scroll down to Time Machine button
        3. Verify Time Machine button is enabled
     */
    @Test
    public void verifyTimeMachineClickable() {
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");

        Pages.Darksky.LandingPage lpage = new Pages.Darksky.LandingPage();
        Assert.assertTrue(lpage.isTimeMachineButtonEnabled(), "Error");

    }

    @Test
    public void click () {
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
        HW_5_TimeMachineDates time = new HW_5_TimeMachineDates();
        time.scrollToBottom();
        time.clickTimeMachineBttn();
        // String selectedDate = time.getHiglightedDate();
       // System.out.println(selectedDate);
        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("d");
       // String date_2 = date.format(now);
       // System.out.println(date_2);
        Assert.assertEquals(time.getHiglightedDate(), date.format(now), "Highlighted date is not matching the current date");


    }

}
