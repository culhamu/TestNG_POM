package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(css = "#searchDropdownBox")
    public WebElement dropdownBox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement resultText;

    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement firstProduct;

    @FindBy(id = "productTitle")
    public WebElement firstProductElement;

    @FindBy(xpath = "(//img[@class='s-image'])[7]")
    public WebElement seventhProduct;

    @FindBy(xpath = "(//span[@class='a-offscreen'])[1]")
    public WebElement productPrice;

}
