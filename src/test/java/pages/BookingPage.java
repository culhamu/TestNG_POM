package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BookingPage {

    public BookingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='b6dc9a9e69 e25355d3ee'])[9]")
    public WebElement popupCross;

    @FindBy(id = "attractions")
    public WebElement turistikYerlerButon;

    @FindBy(xpath = "//input[@name='query']")
    public WebElement placeBox;

    @FindBy(xpath = "//div[@class='css-ck8kih']")
    public WebElement dateBox;

    @FindBy(xpath = "//span[@data-date='2023-03-17']")
    public WebElement dateDate;

    @FindBy(xpath = "//span[@data-date='2023-04-17']")
    public WebElement dateDate2;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBox;
}
