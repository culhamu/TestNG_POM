package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {
    public KiwiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//button[@class='ButtonPrimitive__StyledButtonPrimitive-sc-j8pavp-0 hXJpFI'])[1]")
    public WebElement CookieLocate;

    @FindBy(xpath = "(//p[@class='Text__StyledText-sc-1dj99rd-0 kzltRH'])[1]")
    public WebElement cookieSettingsLocate;

    @FindBy(xpath = "(//input[@data-test='SearchField-input'])[2]")
    public WebElement arriveDestination;

    @FindBy(xpath = "(//div[@class='ButtonWrapsstyled__ButtonTabletWrap-sc-zf781k-0 jRIGJM'])[1]")
    public WebElement roundTripButton;

    @FindBy(xpath = "(//div[@class='ModesPopupOptionstyled__Content-sc-17rbqun-2 bhOXQ'])[2]")
    public WebElement oneWayButton;

    @FindBy(xpath = "(//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 HJizW'])[4]")
    public WebElement searchButton;

    @FindBy(xpath = "(//input[@class='SearchFieldstyled__SearchFieldInput-sc-1f3jsso-5 ewuZzw'])[3]")
    public WebElement dateBox;

    @FindBy(xpath = "//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 HJizW']")
    public WebElement reservationButton;

    @FindBy(xpath = "//div[@class='ButtonPrimitiveIconContainer__StyledButtonPrimitiveIconContainer-sc-1bqiptv-0 cUaWLp']")
    public WebElement crossButton;

    @FindBy(xpath = "(//div[@class='ResultCardstyled__ResultCardInner-sc-vsw8q3-9 hlQpUC'])[1]")
    public WebElement resultText;

}
