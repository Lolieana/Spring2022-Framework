package Tests.Darksky;

import Helper.Misc;
import Pages.Commands;
import Pages.Darksky.HW_5_TempsMatchInSameDay;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HW_5_TempMatchInSamDay {

   HW_5_TempsMatchInSameDay temp = new HW_5_TempsMatchInSameDay();

    @Test
    public void sameTemp () {
        MyDriver.launchUrlOnNewWindowWithWait("https://www.darksky.net/");
        Misc.pause(2);

        JavascriptExecutor js =  (JavascriptExecutor) MyDriver.getDriver();
        js.executeScript("scrollBy(0,800)");
        Misc.pause(5);
        temp.clickTodayTempBar();
        int lowTempConvert = Misc.removeDegreeAndGetTempAsInt(temp.getLowTempPresent());
        int highTempConvert = Misc.removeDegreeAndGetTempAsInt(temp.getHighTempPresent());
        int lowTempConvertAfterClick = Misc.removeDegreeAndGetTempAsInt(temp.getLowTempAfterClick());
        int highTempConvertAfterClick = Misc.removeDegreeAndGetTempAsInt(temp.getHighTempAfterClick());
        Commands.checkEquals(lowTempConvert,lowTempConvertAfterClick, "Temps are not same");
        Commands.checkEquals(highTempConvert,highTempConvertAfterClick,"Temps are not same");

    }

}
