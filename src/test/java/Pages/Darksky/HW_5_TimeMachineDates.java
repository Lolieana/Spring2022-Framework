package Pages.Darksky;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW_5_TimeMachineDates extends Commands {

/**
 * darksky.net
 * Verify the current date is highlighted in Time Machine's calendar
 */


    // Locators of Landing Page elements
    By timeMachineLocator = By.xpath("//a[text()='Time Machine' or text()='TIME MACHINE']");
    By currentDateLocator = By.xpath("//td[@class='is-today']");

   public void clickTimeMachineBttn () {
       clickIt(timeMachineLocator);
   }

   public String getHiglightedDate () {
      return getTextOfWebElement(currentDateLocator);
   }

   public boolean isCurrentDateHighlighted() {
       return Misc.getCurrentDateAsInt() == Integer.parseInt(getTextOfWebElement(currentDateLocator));

   }

}
