package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPAge {
    public HerokuappPAge(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Add/Remove Elements")
    public WebElement addRemoveButton;

    @FindBy(xpath = "//div[@class='example']")
    public WebElement addButton;

    @FindBy(xpath = "//div[@id='elements']")
    public WebElement deleteButton;
}
