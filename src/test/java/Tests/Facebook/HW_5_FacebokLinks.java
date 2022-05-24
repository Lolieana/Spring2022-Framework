package Tests.Facebook;

import Helper.Misc;
import Pages.Facebook.HW_5_FacebookLinks;
import Web.MyDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_5_FacebokLinks {

    @Test
    public void testNewWindows () {
        MyDriver.launchUrlOnNewWindowWithWait("https://www.facebook.com/");
        Pages.Facebook.HW_5_FacebookLinks fb = new Pages.Facebook.HW_5_FacebookLinks();
        fb.clickLinks();
        Misc.pause(2);
        fb.closeLinks();
        MyDriver.getDriver().getWindowHandles().size();

        Assert.assertEquals(MyDriver.getDriver().getWindowHandles().size(), 1, "more than one window");
        Assert.assertEquals(MyDriver.getDriver().getTitle(),"Instagram","Title is not same");
        Assert.assertFalse(fb.logInBttn().isEnabled(),"is enabled");


    }



}
