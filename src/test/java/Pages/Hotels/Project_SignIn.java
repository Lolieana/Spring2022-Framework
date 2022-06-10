package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class Project_SignIn extends Commands {


    By signInButtonHeaderLocator = By.xpath("//div[@id='gc-custom-header-nav-bar-acct-menu']//button[text()='Sign in']");
    By signInButtonLocator = By.xpath("//a[@data-stid='link-header-account-signin']");
    By emailAddressLocator = By.xpath("//input[@id='loginFormEmailInput']");
    By passwordLocator = By.xpath("//input[@id='loginFormPasswordInput']");
    By logInButton = By.xpath("//button[@id='loginFormSubmitButton']");
    By errorMsgLocator = By.xpath("//h3[contains(text(),'Try again.')]");



    public void clickSignIn () {
        clickIt(signInButtonHeaderLocator);
    }
    public void clickSecondSignIn () {
        clickIt(signInButtonLocator);
    }
    public void typeEmailAddress(String email) {
        type(emailAddressLocator,email);
    }
     public void typePassword (String password) {
       type(passwordLocator, password);
    }
    public void clickLogin () {
        clickIt(logInButton);
    }
    public boolean verifyErrorMsgIsDisplayed () {
        return isElementDisplayed(errorMsgLocator);

    }



    }












