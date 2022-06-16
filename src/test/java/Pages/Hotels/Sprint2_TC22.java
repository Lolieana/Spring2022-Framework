package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class Sprint2_TC22 extends Commands {

    By signInButtonHeaderLocator = By.xpath("//div[@id='gc-custom-header-nav-bar-acct-menu']//button[text()='Sign in']");
    By signUpItsFreeLocator = By.xpath("//a[text()='Sign up, it’s free']");
    By emailLocator = By.xpath("//input[@id='signupFormEmailInput']");
    By emailErrorTextLocator = By.xpath("//div[@id='signupFormEmailInput-error']");
    By firstNameLocator = By.xpath("//input[@id='signupFormFirstNameInput']");
    By firstNameErrorTextLocator = By.xpath("//div[@id='signupFormFirstNameInput-error']");
    By lastNameLocator = By.xpath("//input[@id='signupFormLastNameInput']");
    By lastNameErrorTextLocator = By.xpath("//div[@id='signupFormLastNameInput-error']");
    By passwordLocator = By.xpath("//input[@id='signupFormPasswordInput']");
    By keepSignInCheckBoxLocator = By.xpath("//input[@id='signUpFormRememberMeCheck']/following-sibling::span");
    By continueBtnLocator = By.xpath("//button[@id='signupFormSubmitButton']");




    public void clickSignIn () {
        clickIt(signInButtonHeaderLocator);
    }

    public void clickSignUpLink () {
        clickIt(signUpItsFreeLocator);
        Misc.pause(2);
    }

     public void typeEmail (String email) {
       type(emailLocator,email);
    }
    public boolean verifyErrorEmailDisplayed () {
        return isElementDisplayed(emailErrorTextLocator);
    }

     public void typeFirstName (String name) {
        type(firstNameLocator, name);
     }
    public boolean verifyErrorFirstNameDisplayed () {
        return isElementDisplayed(firstNameErrorTextLocator);
    }


    public void typeLastName (String name) {
        type(lastNameLocator, name);
     }
    public boolean verifyErrorLastNameDisplayed () {
        return isElementDisplayed(lastNameErrorTextLocator);
    }

     public void typePassword (String password) {

        type(passwordLocator, password);
        Misc.pause(2);
     }

    public boolean verifyKeepSignInBoxDisplayed () {
        scrollToBottom();
      return isElementDisplayed(keepSignInCheckBoxLocator);
    }
    public boolean verifyKeepSignInBoxEnabled () {
        return isElementEnabled(keepSignInCheckBoxLocator);
    }
    public boolean verifyContinueBtnDisplayed () {
        scrollToBottom();
      return isElementDisplayed(continueBtnLocator);
     }
    public boolean verifyContinueBtnNotEnabled () {
        return isElementEnabled(continueBtnLocator);
    }



}
