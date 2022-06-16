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

    By covidBannerLocator = By.xpath("//span[contains(text(),'ffected by the Coronavirus (COVID-19) situation?')]");
    By covidBannerFindOutLink = By.xpath("//a[text()='Find out more']");
    By emailFeedbackLocator = By.xpath("//input[@id='email_address']");
    By pleaseChooseOneLocator = By.xpath("//select[@id='will-you-return']");
    By orContinueWithLocator = By.xpath("//div[text()='or continue with']");
    By appleLocator = By.xpath("//button[@id='social-auth-provider-apple-web']");
    By facebookLocator = By.xpath("//button[@id='social-auth-provider-facebook-web']");

    public void clickHotelRewards () {
        clickIt(hotelRewardsLocator);
    }





}
