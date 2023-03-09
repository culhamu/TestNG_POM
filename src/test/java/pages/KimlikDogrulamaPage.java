package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KimlikDogrulamaPage {
    public KimlikDogrulamaPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement odemeButon;
}
