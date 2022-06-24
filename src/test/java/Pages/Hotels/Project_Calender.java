package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Project_Calender extends Commands {



    By checkInBoxLocator = By.xpath("//button[@id='date_form_field-btn']");
    By previousMonthArrowLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[1]");
    By disabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");
    By leftArrowLocator = By.xpath("//button[@data-stid='date-picker-paging' and @disabled]");





    public void clickCheckInTable () {
        clickIt(checkInBoxLocator);
    }
    public void clickPreviousMonthArrow () {
        clickIt(previousMonthArrowLocator);
    }
    //public void clickCheckOutTable () {
     //   clickIt(checkOutBoxLocator);
    //}

    public List<WebElement> disabledDatesInCalender () {
        return findWebElements(disabledDatesLocator);
    }

    public boolean leftArrowEnabled () {
      return isElementEnabled(leftArrowLocator);
    }













}
