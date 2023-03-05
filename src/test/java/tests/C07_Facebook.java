package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C07_Facebook extends TestBaseRapor {

    @Test
    public void facebookTest() {

        extentTest=extentReports.createTest("Negatif Facebook testi","Gecersiz email ve password ile giris yapılamadıgı test edildi");
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();


        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        extentTest.info("Facebook anasayfasına gidildi");

        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        extentTest.info("email kutusuna geçersiz e mail yazıldı");


        facebookPage.passwordBox.sendKeys(faker.internet().password());
        extentTest.info("password kutusuna geçersiz şifre yazıldı");

        facebookPage.loginButton.click();
        extentTest.info("login butonuna basıldı");

        Assert.assertTrue(facebookPage.loginButton.isDisplayed());
        extentTest.pass("geçersiz mail ve password ile giriş yapılamadığı test edildi");

    }

}
