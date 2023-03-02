package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_Kiwi {
    KiwiPage kiwiPage;

    @Test
    public void kiwiUcusAra(){
        kiwiPage=new KiwiPage();

        Driver.getDriver().get(ConfigReader.getProperty("kiwiUrl"));
        kiwiPage.CookieLocate.click();
        kiwiPage.cookieSettingsLocate.click();
        kiwiPage.roundTripButton.click();
        kiwiPage.oneWayButton.click();
        kiwiPage.arriveDestination.sendKeys(ConfigReader.getProperty("kiwiGidisYeri")+ Keys.ENTER);
        kiwiPage.searchButton.click();
        ReusableMethods.switchToWindow(ConfigReader.getProperty("kiwiIkinciSayfaTitle"));
        kiwiPage.reservationButton.click();
        kiwiPage.crossButton.click();
        System.out.println(kiwiPage.resultText.getText());
        Driver.quitDriver();

    }
}
