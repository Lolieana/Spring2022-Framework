package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Project_Calender extends Commands {



    By checkInBoxLocator = By.id("d1-btn");
    By checkOutBoxLocator = By.id("d2-btn");
    By disabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");
    By leftArrowLocator = By.xpath("//button[@data-stid='date-picker-paging' and @disabled]");





    public void clickCheckInTable () {
        clickIt(checkInBoxLocator);
    }
    public void clickCheckOutTable () {
        clickIt(checkOutBoxLocator);
    }

    public List<WebElement> disabledDatesInCalender () {
        return findWebElements(disabledDatesLocator);
    }

    public boolean leftArrowEnabled () {
      return isElementEnabled(leftArrowLocator);
    }













}
