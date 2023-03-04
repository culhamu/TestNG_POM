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
        EbayPage ebayPage=new EbayPage();

        Driver.getDriver().get(ConfigReader.getProperty("ebayUrl"));
        ReusableMethods.moveToElement(ebayPage.electronicsMoveToElement);

        ebayPage.computers.click();

        ReusableMethods.scrollToElement(ebayPage.macbook);

        ebayPage.macbook.click();

        String ilkWHD=Driver.getDriver().getWindowHandle();
        ebayPage.macbookProduct.click();
        String ikinciWHD ="";
        Set<String> tumWHD=Driver.getDriver().getWindowHandles();
        for (String each:tumWHD) {
            if (!each.equals(ilkWHD)){
                ikinciWHD=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWHD);
        Assert.assertTrue(ebayPage.resultText.isDisplayed());

        Driver.quitDriver();
    }
}
