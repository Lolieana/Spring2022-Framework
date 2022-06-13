package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

public class Project_SignUp extends Commands {

    By signInButtonHeaderLocator = By.xpath("//div[@id='gc-custom-header-nav-bar-acct-menu']//button[text()='Sign in']");
    By signUpItsFreeLocator = By.xpath("//a[text()='Sign up, it’s free']");
    By termsAndConditionsLocator = By.xpath("//a[text()='Terms and Conditions']");
    By privacyStatementLocator = By.xpath("//a[text()='Privacy Statement']");
    By termsAndCondHeaderLocator = By.xpath("//h1[text()='Terms and Conditions']");
    By privacyHeaderLocator = By.xpath("//h2[text()='Privacy Statement']");




    public void clickSignIn () {
        clickIt(signInButtonHeaderLocator);
    }

    public String clickSignUpLink () {
     clickIt(signUpItsFreeLocator);
        Misc.pause(2);
        return getCurrentWindowHandle();
     }
     public String clickTermsAndCondLink () {
        clickIt(termsAndConditionsLocator);
        switchToSecondWindow();
        return getCurrentWindowHandle();
     }

    public String clickPrivacyStatLink () {
        clickIt(privacyStatementLocator);
        switchToSecondWindow();
        return getCurrentWindowHandle();
    }
    public boolean termsAndCondHeaderExist () {
        return isElementExist(termsAndCondHeaderLocator);
    }

    public boolean privacyHeaderExist () {
        return isElementExist(privacyHeaderLocator);
    }





}
