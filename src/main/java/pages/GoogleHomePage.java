package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver){
        super(driver);
    }

    public WebElement googleInput(){
        return findByXpath("//*[@name='q']");
    }

}
