package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstagramPage {

    public InstagramPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@class='_aa4b _add6 _ac4d'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@class='_acan _acap _acas _aj1-'])[1]")
    public WebElement loginButton;
}
