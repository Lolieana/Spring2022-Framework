package Pages.Facebook;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class HW_5_FacebookLinks extends Commands {

    /**
     * facebook.com/
     * Launch facebook.com
     * Click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
     * Close ALL windows except Instagram
     * Verify number of window-Handles is 1
     * Verify Page Title is Instagram
     * Verify Log in button on Instagram is disabled by default
     */



      By facebookPayLink = By.xpath("//a[text()='Facebook Pay']");
      By oculusLink = By.xpath("//a[text()='Oculus']");
      By portalLink = By.xpath("//a[text()='Portal']");
      By instagramLink = By.xpath("//a[text()='Instagram']");
      By bulletinLink = By.xpath("//a[text()='Bulletin']");
      By instagramLoginLocator = By.xpath("//button[@type='submit']");



    public void clickLinks () {
        clickIt(facebookPayLink);
        clickIt(oculusLink);
        clickIt(portalLink);
        clickIt(instagramLink);
        clickIt(bulletinLink);

    }

    public void closeLinks () {

        Set<String> allHandles = MyDriver.getDriver().getWindowHandles();
        String instagramHandle = MyDriver.getDriver().getWindowHandle();

        for (String handle : allHandles) {
            MyDriver.getDriver().switchTo().window(handle);
            if (MyDriver.getDriver().getTitle().equals("Instagram") ){
                instagramHandle = handle;
            } else {
                MyDriver.getDriver().close();
            }
        }
         MyDriver.getDriver().switchTo().window(instagramHandle);
    }



    public WebElement logInBttn () {
        return findWebElement(instagramLoginLocator);
    }





}
