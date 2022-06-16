package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class Sprint2_TC25 extends Commands {

    By signInButtonHeaderLocator = By.xpath("//div[@id='gc-custom-header-nav-bar-acct-menu']//button[text()='Sign in']");
    By feedbackLocator = By.xpath("//a[@target='_blank']//div[text()='Feedback']");
    By starRating_3 = By.xpath("//input[@id='page-rating-3']/parent::div");
    By enterYourCommentsLocator = By.xpath("//textarea[@placeholder='Please enter your comments about this page']");
    By willYouReturnDropDown = By.xpath("//select[@id='will-you-return']");
    By priorToThisVisitYESBtn = By.xpath("//input[@id='booked-here-before-yes']/parent::div");
    By didYouAccomplishYESBtn = By.xpath("//input[@id='were-you-successful-yes']/parent::div");
    By submitFeedbackLocator = By.xpath("//button[@id='submit-button']");
    By thankUMessageLocator = By.xpath("//h5[text()='THANK YOU FOR YOUR FEEDBACK.']");





    public void clickSignIn () {
        clickIt(signInButtonHeaderLocator);
    }
    public void clickFeedback() {
        clickIt(feedbackLocator);
        switchToSecondWindow();
    }
    public void clickStar(String starNum) {
       clickIt(By.xpath("//input[@id='page-rating-" + starNum + "']/parent::div"));
    }
    public void typeInCommentBox (String comment) {

        type(enterYourCommentsLocator, comment);
    }
    public void chooseFromDropDown () {
        selectByVisibleText(willYouReturnDropDown,"Somewhat likely");
    }
    public void clickOnYesBtn (String data) {
        clickIt(By.xpath("//input[@id='booked-here-before-" + data + "']/parent::div"));
    }
    public void clickDidUAccomplishYesBtn (String data) {
        clickIt(By.xpath("//input[@id='were-you-successful-" + data + "']/parent::div"));
    }
    public void clickSubmit () {
        clickIt(submitFeedbackLocator);
    }
    public boolean verifyThankUMsgDisplayed () {
        return isElementDisplayed(thankUMessageLocator);
    }





}
