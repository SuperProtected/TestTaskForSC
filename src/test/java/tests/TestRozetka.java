package tests;

import helpers.Testinit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.RozetkaHomePage;

public class TestRozetka extends Testinit {
// !!! This is a test task, the test is specially made in a non-optimal way !!!
    @Test
    public void testRozetka() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        Actions actions = new Actions(driver);

        rozetkaHomePage.navigate("https://www.google.com/");
        googleHomePage.googleInput().sendKeys("rozetka.com.ua\n");
        rozetkaHomePage.rozetkaLink().click();
        try {
            if (rozetkaHomePage.popUpAboutAdult().isDisplayed()) {
                rozetkaHomePage.confirmPopUpAboutAdultBtn().click();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        rozetkaHomePage.catalogBtn().click();
        actions.moveToElement(rozetkaHomePage.categoryPetProducts()).perform();
        rozetkaHomePage.meansAgainstParasitesLink().click();
        rozetkaHomePage.rozetkaPlusCatalog().click();
        rozetkaHomePage.dogsCatalog().click();
        rozetkaHomePage.destinationSearch().sendKeys("проти");
        rozetkaHomePage.againstInsectsCheckbox().click();

        Select dropdown = new Select(rozetkaHomePage.dropDownElement());
        dropdown.selectByVisibleText("Option Text");
    }
}
