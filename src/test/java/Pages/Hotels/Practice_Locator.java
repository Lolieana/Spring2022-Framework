package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class Practice_Locator extends Commands {


    By hotelRewardsLocator = By.xpath("//a[@target='_self']//div[text()='Hotels.com® Rewards']");
    By headerAllLinksLocator = By.xpath("//nav[@class='header-secondary-nav']//a");
    //nav[@class='header-secondary-nav']//a[text()='Deals']
    //nav[@class='header-secondary-nav']//a[text()='Vacation rentals']
    //nav[@class='header-secondary-nav']//a[text()='Car Rental']
    By loyaltyRewardsAllLinks = By.xpath("//ul[@class='nav-level-1 cont']//a");
    //ul[@class='nav-level-1 cont']//a[text()='Overview']
    By joinNowRewardPageLocator = By.xpath("//a[text()='Join Now']");
    By signInRewardPageLocator = By.xpath("//a[text()='Sign In']");

    //By getawayAllLinksLocator = By.xpath("(//div[@class='uitk-layout-grid uitk-layout-grid-columns-3 GridContainer']//a)[4]");


    //h3[@class='uitk-error-summary-heading']
    //h3[contains(text(),'Try again.')]

    // By emailLocator = By.xpath("//input[@id='signupFormEmailInput']");
    //  By firstNameLocator = By.xpath("//input[@id='signupFormFirstNameInput']");
    // By lastNameLocator = By.xpath("//input[@id='signupFormLastNameInput']");
    //  By passwordLocator = By.xpath("//input[@id='signupFormPasswordInput']");
    //  By showPasswordLocator = By.xpath("//button[@type='button']//following::span[@class='is-visually-hidden' and text()='Show password']/parent::button");
    // By keepSignInCheckBoxLocator = By.xpath("//input[@id='signUpFormRememberMeCheck']");
    // By continueBtnLocator = By.xpath("//button[@id='signupFormSubmitButton']");


    By covidBannerLocator = By.xpath("//span[contains(text(),'ffected by the Coronavirus (COVID-19) situation?')]");
    By covidBannerFindOutLink = By.xpath("//a[text()='Find out more']");
    By starRating_1 = By.xpath("//input[@id='page-rating-1']/parent::div");
    By enterYourCommentsLocator = By.xpath("//textarea[@placeholder='Please enter your comments about this page']");
    By willYouReturnDropDown = By.xpath("//select[@id='will-you-return']"); //*[@id='will-you-return']
    By priorToThisVisitYESBtn = By.xpath("//input[@id='booked-here-before-yes']/parent::div");
    By didYouAccomplishYESBtn = By.xpath("//input[@id='were-you-successful-yes']/parent::div");
    By emailFeedbackLocator = By.xpath("//input[@id='email_address']");
    By pleaseChooseOneLocator = By.xpath("//select[@id='will-you-return']");
    By orContinueWithLocator = By.xpath("//div[text()='or continue with']");
    By appleLocator = By.xpath("//button[@id='social-auth-provider-apple-web']");
    By facebookLocator = By.xpath("//button[@id='social-auth-provider-facebook-web']");




    public void clickHotelRewards () {
        clickIt(hotelRewardsLocator);
    }

    // public void typeEmail (String email) {
    //   type(emailLocator,email);
    //}

    // public void typeFirstName (String name) {
    //    type(firstNameLocator, name);
    // }

    // public void typeLastName (String name) {
    //    type(lastNameLocator, name);
    // }

    // public void typePassword (String password) {
    //    type(passwordLocator, password);
    // }
    // public void clickShowPassword () {
    //   // scrollToBottom();
    //    clickIt(showPasswordLocator);
    //}
    //public void clickKeepSignInBox () {
    //    clickIt(keepSignInCheckBoxLocator);
    //}
    //public void clickContinueBtn () {
    //   clickIt(continueBtnLocator);
    // }




    // public void clickStarOne() {
    // switchToSecondWindow();
    //   clickIt(starRating_1);

    // }




}
