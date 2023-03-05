package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EbayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import java.util.Set;

public class C05_Ebay extends TestBaseRapor {

    @Test
    public void ebayTest(){
        extentTest=extentReports.createTest("Ebay macbook bilgisayar özellikleri belirleme","istenen özelliklere sahip macbook alma testi");
        EbayPage ebayPage=new EbayPage();

        Driver.getDriver().get(ConfigReader.getProperty("ebayUrl"));
        extentTest.info("ebay anasayfaya gidildi");

        ReusableMethods.moveToElement(ebayPage.electronicsMoveToElement);
        extentTest.info("Mouse electronics sekmesinin üzerine getirildi");

        ebayPage.computers.click();
        extentTest.info("Computers seçeneği seçildi");

        ReusableMethods.scrollToElement(ebayPage.macbook);
        extentTest.info("Macbook'a kadar sayfa aşağı indirildi");


        ebayPage.macbook.click();
        extentTest.info("Macbook seçildi");

        String ilkWHD=Driver.getDriver().getWindowHandle();
        ebayPage.macbookProduct.click();
        extentTest.info("Uygun macbook ürünü seçildi");

        String ikinciWHD ="";
        Set<String> tumWHD=Driver.getDriver().getWindowHandles();
        for (String each:tumWHD) {
            if (!each.equals(ilkWHD)){
                ikinciWHD=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWHD);
        extentTest.info("ikinci sayafaya geçildi");

        Assert.assertTrue(ebayPage.resultText.isDisplayed());
        extentTest.pass("sonuç yazısının görünürlüğü test edildi");
    }
}
