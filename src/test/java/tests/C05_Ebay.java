package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.EbayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C05_Ebay extends TestBaseRapor {

    @Test
    public void ebayTest(){
        EbayPage ebayPage=new EbayPage();

        Driver.getDriver().get(ConfigReader.getProperty("ebayUrl"));
        ReusableMethods.moveToElement(ebayPage.electronicsMoveToElement);

        ebayPage.computers.click();

        ReusableMethods.scrollToElement(ebayPage.macbook);

        ebayPage.macbook.click();

        ebayPage.macbookProduct.click();


        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(ebayPage.resultText.isDisplayed());

        softAssert.assertAll();

    }
}
