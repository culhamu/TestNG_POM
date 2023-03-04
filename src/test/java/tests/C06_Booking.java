package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.BookingPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_Booking {

    @Test
    public void bookingTest01(){
        BookingPage bookingPage=new BookingPage();
        Driver.getDriver().get(ConfigReader.getProperty("bookingUrl"));

        //bookingPage.popupCross.click();

        Driver.getDriver().navigate().refresh();

        bookingPage.turistikYerlerButon.click();

        bookingPage.placeBox.sendKeys(ConfigReader.getProperty("bookingAranacakKelime"));

        bookingPage.dateBox.click();

        bookingPage.dateDate.click();

        bookingPage.dateDate2.click();

        bookingPage.searchBox.sendKeys(Keys.ENTER);

    }
}
