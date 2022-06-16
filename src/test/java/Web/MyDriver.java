package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class MyDriver {


    private static WebDriver driver;

    public static void launchUrlOnNewWindow(String url) {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get(url);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void launchUrlOnNewWindowWithWait(String url) {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);}

   // public static void quitWindows() {

     //  driver.quit();
   // }

    //@Before
   //public static void launchUrlOnNewWindow() {
      // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
      // driver = new ChromeDriver();
       // driver.get("https://www.facebook.com/");
       // driver.get("https://www.hotels.com/");
      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("https://www.hotels.com/");
  // }

   // @After
  //  public static void quitWindows() {
     //   driver.quit();
   // }


    public static WebDriver getDriver() {

        return driver;
    }



    public static Date getTomorrowDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    public static String[] getTomorrowDateFields() {
        Date dateTomorrow = getTomorrowDate();
        SimpleDateFormat df = new SimpleDateFormat("d MMMM yyyy");
        return df.format(dateTomorrow).split(" ");
        // [8, January, 2022]
    }

    public static String[] addDaysToTomorrow(int addDays) {
        Date dateTomorrow = getTomorrowDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateTomorrow);
        cal.add(Calendar.DAY_OF_MONTH, addDays);
        Date tomorrowPlusDays = cal.getTime();
        SimpleDateFormat df = new SimpleDateFormat("d MMMM yyyy");
        return df.format(tomorrowPlusDays).split(" ");
        // [15, January, 2022]
    }

    public static boolean isDateInCorrectFormat(String dateText, String expDateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(expDateFormat);
        boolean isDateFormatCorrect = true;

        try {
            sdf.parse(dateText);
        } catch (ParseException e) {
            isDateFormatCorrect = false;
        }

        return isDateFormatCorrect;
    }

    public static String getDateInFormat(String format) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }


}
