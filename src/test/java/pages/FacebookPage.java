package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='E-posta veya Telefon Numarası']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@placeholder='Şifre']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@role='button'])[2]")
    public WebElement newAccountCreate;
}
