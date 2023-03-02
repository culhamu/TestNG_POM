package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YoutubePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;

import static utilities.Driver.driver;

public class C02_Youtube {

    YoutubePage youtube=new YoutubePage();

    @Test(priority = 1)
    public void youtubeTitle(){

        //1) https://www.youtube.com adresine gidin
        //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        Driver.getDriver().get("https://www.youtube.com");

        String expectedTitle="YouTube";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Test(priority = 2)
    public void youtubeImage(){

        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement locate= driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-logo'])[1]"));
        ReusableMethods.getScreenshotPartialPage(locate, "youtubeIcon");
        Assert.assertTrue(youtube.imageYoutube.isDisplayed());

    }
    @Test(priority = 3)
    public void youtubeSearchBox(){

        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement locate= driver.findElement(By.xpath("//input[@id='search']"));
        ReusableMethods.getScreenshotPartialPage(locate, "youtubeSearchIcon");
        Assert.assertTrue(youtube.searchBox.isDisplayed());

    }
    @Test(priority = 4)
    public void youtubeWrongTitle() throws IOException {

        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
      String actualPageTitle= Driver.getDriver().getTitle();
      String expectedPageTile="youtube";


        ReusableMethods.getScreenshot("youtube");
      Assert.assertFalse(actualPageTitle.contains(expectedPageTile));
      Driver.closeDriver();

    }
}
