package Pages.Darksky;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HW_5_TempsMatchInSameDay extends Commands {

    /**
     * darksky.net
     * Verify same values are displayed in the Today's data
     */



    By todayTempBar = By.xpath("//a[@data-day='0']");
    By lowTempPresent = By.xpath("(//span[@class='tempRange']//span[@class='minTemp'])[1]");
    By highTempPresent = By.xpath("(//span[@class='tempRange']//span[@class='maxTemp'])[1]");
    By lowTempAfterClick = By.xpath("(//span[@class='highTemp swip']//span[@class='temp'])[1]");
    By highTempAfterClick = By.xpath("(//span[@class='lowTemp swap']//span[@class='temp'])[1]");




    public void clickTodayTempBar () {
        clickIt(todayTempBar);}

    public String getLowTempPresent () {
        return getTextOfWebElement(lowTempPresent);
    }

    public String getHighTempPresent () {
        return getTextOfWebElement(highTempPresent);
    }
    public String getLowTempAfterClick () {
        return getTextOfWebElement(lowTempAfterClick);
    }

    public String getHighTempAfterClick () {
        return getTextOfWebElement(highTempAfterClick);
    }




}
