package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class C01_Amazon {




    AmazonPage amazonPage=new AmazonPage();
    @Test(priority = 1)
    public void amazonHomePage(){

        //● https://www.amazon.com/ adresine gidin.
        //1. Test : Amazon ana sayfaya gittiginizi test edin

        Driver.getDriver().get("https://www.amazon.com");

        String expectedIcerik="amazon";
        String actualIcerik=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }
    @Test(priority = 2,dependsOnMethods = "amazonHomePage")
    public void amazonSearchBox(){

        //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        //ve aramanizin gerceklestigini Test edin
        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);

        WebElement locate=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        ReusableMethods.getScreenshotPartialPage(locate,"amazonAramaSonuc");

        String expectedSonuc="Nutella";
        Assert.assertTrue(locate.getText().contains(expectedSonuc));


    }
    @Test(priority = 3,dependsOnMethods = "amazonSearchBox")
    public void amazonIlkUrun(){

        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.90
        //oldugunu test edin

        amazonPage.seventhProduct.click();
        String expectedPrice="$16.90";
        String actualPrice=amazonPage.productPrice.getText();

        ReusableMethods.getScreenshot("amazonNutellaTumSayfa");

        Assert.assertTrue(actualPrice.equals(expectedPrice));

        Driver.closeDriver();
    }

}
