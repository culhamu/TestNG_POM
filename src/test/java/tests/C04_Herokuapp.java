package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuappPAge;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.Duration;

public class C04_Herokuapp extends TestBaseRapor {
    @Test
    public void test01(){
        HerokuappPAge herokuappPAge=new HerokuappPAge();
        //Yeni bir test methodu olusturalim
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("herokuappUrl"));


        //1) “Add Element” butona basin
        herokuappPAge.addButton.click();

        //2) “Delete” butonu gorunur oluncaya kadar bekleyin
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(herokuappPAge.deleteButton));

        //3) “Delete” butonunun gorunur oldugunu test edin
        Assert.assertTrue(herokuappPAge.deleteButton.isDisplayed());

        //4) Delete butonuna basarak butonu silin
        herokuappPAge.deleteButton.click();

        //5) Delete butonunun gorunmedigini test edin
        Assert.assertFalse(herokuappPAge.deleteButton.isDisplayed());
    }
}
