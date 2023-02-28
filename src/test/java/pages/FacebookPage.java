package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage {

    @FindBy(xpath = "(//div[@class='_6lux'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//div[@class='_6lux'])[2]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@role='button'])[2]")
    public WebElement newAccountCreate;
}
