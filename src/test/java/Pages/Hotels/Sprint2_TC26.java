package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class Sprint2_TC26 extends Commands {

    By moreTravelBtnLocator = By.xpath("//div[text()='More travel']");
    By firstSelectLocator = By.xpath(" //a[@href='/hotel-deals/']");

    // manage your booking link locators
    By manageYourBookingLocator = By.xpath("(//div[@class='resp-row resp-section ']//a)[1]");
    By searchBookAndSaveTitleLocator = By.xpath("//h1[text()='Search, book, and save on the go!']");

    // stay flexible link locators
    By stayFlexibleLocator = By.xpath("(//div[@class='resp-row resp-section ']//a)[2]");
    By amazingDealsTitleLocator = By.xpath("//h1[text()='Amazing deals with free cancellation']");

    // save on your next trip link locators
    By saveOnYourNextTripLocator = By.xpath("(//div[@class='resp-row resp-section ']//a)[3]");
    By greatOutdoorsTitleLocator = By.xpath("//h1[text()='Save on your next trip to the great outdoors']");





    public void clickOnMoreTravelBox () {
        clickIt(moreTravelBtnLocator);
    }
    public void clickOnDeals () {
        clickIt(firstSelectLocator);
        Misc.pause(2);
    }
    public boolean checkManageYourBookingDisplayed () {
        return isElementDisplayed(manageYourBookingLocator);
    }
    public boolean checkManageYourBookingEnabled () {
        return isElementEnabled(manageYourBookingLocator);
    }
    public void clickManageYourBooking () {
        clickIt(manageYourBookingLocator);
    }
    public boolean verifySearchBookAndSaveTitleDisplayed () {
        return isElementDisplayed(searchBookAndSaveTitleLocator);
    }
    public boolean checkStayFlexibleDisplayed () {
        return isElementDisplayed(stayFlexibleLocator);
    }
    public boolean checkStayFlexibleEnabled () {
        return isElementEnabled(stayFlexibleLocator);
    }
    public void clickStayFlexible () {
        clickIt(stayFlexibleLocator);
    }
    public boolean verifyAmazingDealsTitleDisplayed () {
        return isElementDisplayed(amazingDealsTitleLocator);
    }
    public boolean checkSaveOnYourNextTripDisplayed () {
        return isElementDisplayed(saveOnYourNextTripLocator);
    }
    public boolean checkSaveOnYourNextTripEnabled () {
        return isElementEnabled(saveOnYourNextTripLocator);
    }
    public void clickSaveOnYourNextTrip () {
        clickIt(saveOnYourNextTripLocator);
    }
    public boolean verifySaveOnYourNextTripGreatTitleDisplayed () {
        return isElementDisplayed(greatOutdoorsTitleLocator);
    }





}
