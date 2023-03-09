package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {
    public PaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//p[@class='_1x52f9s1 _1fragema3 _1x52f9sm _1fragem1i _1fragema6']")
    public WebElement ucretsizEgitimControl;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement siparisiTamamlaButton;

    @FindBy(xpath = "//span[@class='product__description__name order-summary__emphasis']")
    public WebElement siparisDersText;
}
