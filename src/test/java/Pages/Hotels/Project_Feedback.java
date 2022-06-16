package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class Project_Feedback extends Commands {


    By feedbackLocator = By.xpath("//a[@target='_blank']//div[text()='Feedback']");
    By submitFeedbackLocator = By.xpath("//button[@id='submit-button']");
    By errormessageLocator = By.xpath("//p[text()='Please fill in the required information highlighted below.']");
    By redDotsAroundStarsLOcator = By.xpath("//fieldset[@id='required_box_page_rating']");




    public void clickFeedback() {
        clickIt(feedbackLocator);
        switchToSecondWindow();
    }
    public void clickSubmit () {

        clickIt(submitFeedbackLocator);
        Misc.pause(2);
    }

    public boolean verifyErrorMessageIsDisplayed () {
        return isElementDisplayed(errormessageLocator);
    }

    public boolean VerifyRedDotsAroundStarsIsDisplayed () {
        return isElementDisplayed(redDotsAroundStarsLOcator);
    }


}
