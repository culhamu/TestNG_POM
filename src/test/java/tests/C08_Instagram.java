package tests;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InstagramPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C08_Instagram extends TestBaseRapor {

    @Test
    public void instagramTest(){
        extentTest=extentReports.createTest("Negatif Instagram testi ","Gecersiz bilgilerle giris yapılamamalı");

        InstagramPage instagramPage=new InstagramPage();
        Faker faker=new Faker();

        Driver.getDriver().get(ConfigReader.getProperty("instagramUrl"));
        extentTest.info("Instagram anasayfasına gidildi");

        instagramPage.emailBox.sendKeys(faker.internet().emailAddress());
        extentTest.info("email kutusuna geçersiz mail adresi girildi");

        instagramPage.passwordBox.sendKeys(faker.internet().password());
        extentTest.info("password kutusunu geçersiz password girildi");

        instagramPage.loginButton.click();
        extentTest.info("login butonuna basıldı");

        Assert.assertTrue(instagramPage.loginButton.isDisplayed());
        extentTest.pass("Gecersiz mail ve password ile giris yapılamadıgı test edildi ");


    }
}
