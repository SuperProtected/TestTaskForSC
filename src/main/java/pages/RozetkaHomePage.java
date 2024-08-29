package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {

    public RozetkaHomePage(WebDriver driver){
        super(driver);
    }

    public WebElement rozetkaLink(){
        return findByXpath("//span[@data-dtld='rozetka.com.ua']");
    }

    public WebElement popUpAboutAdult(){
        return findByXpath("//p[@data-test='popup18-description']");
    }

    public WebElement confirmPopUpAboutAdultBtn(){
        return findByXpath("//input[@data-test='popup18-button']");
    }

    public WebElement catalogBtn(){
        return findByXpath("//button[@id='fat-menu']");
    }

    public WebElement categoryPetProducts(){
        return findByXpath("//a[@href='https://rozetka.com.ua/ua/zootovary/c3520929/']");
    }

    public WebElement meansAgainstParasitesLink(){
        return findByXpath("//a[@href='https://rozetka.com.ua/ua/vetpreparati-dlya-domashnih-givotnih/c4674741/']");
    }

    public WebElement rozetkaPlusCatalog(){
        return findByXpath("//a[@data-id='Rozetka +']");
    }

    public WebElement dogsCatalog(){
        return findByXpath("//a[@href='/ua/vetpreparati-dlya-domashnih-givotnih/c4674741/seller=rozetka;64063=216901/']");
    }

    public WebElement destinationSearch(){
        return findByXpath("(//input[@type='search'])[2]");
    }

    public WebElement againstInsectsCheckbox(){
        return findByXpath("//a[@href='/ua/vetpreparati-dlya-domashnih-givotnih/c4674741/seller=rozetka;64063=216901;64077=486445/']");
    }

    public WebElement dropDownElement(){
        return findByXpath("//select[@class='select-css ng-pristine ng-valid ng-star-inserted ng-touched']");
    }

}
