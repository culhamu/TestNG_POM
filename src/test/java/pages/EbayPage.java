package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPage {
    public EbayPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='gh-control']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//select[@aria-label='Select a category for search']")
    public WebElement selectMenu;

    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']")
    public WebElement listMenu;

    @FindBy(xpath = "(//li[@class='hl-cat-nav__js-tab'])[1]")
    public WebElement electronicsMoveToElement;

    @FindBy(xpath = "(//a[@class='hl-cat-nav__js-link'])[3]")
    public WebElement computers;

    @FindBy(xpath = "(//div[@class='b-visualnav__title'])[2]")
    public WebElement macbook;

    @FindBy(xpath = "(//h3[@class='s-item__title'])[19]")
    public WebElement macbookProduct;

    @FindBy(xpath = "//h1[@class='product-title']")
    public WebElement resultText;
}
