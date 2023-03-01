package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {
    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@id='button'])[5]")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//yt-icon[@class='guide-icon style-scope ytd-guide-entry-renderer'])[1]")
    public WebElement homePageButton;

    @FindBy(xpath = "(//div[@class='yt-spec-touch-feedback-shape__fill'])[4]")
    public  WebElement loginButton;

    @FindBy(xpath = "(//yt-icon[@class='style-scope ytd-logo'])[1]")
    public WebElement imageYoutube;
}
