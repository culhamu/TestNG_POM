package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyPage;
import pages.UdemyHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C09_Udemy {
    // Kullanici https://www.iienstitu.com/en sayfasina gider
    // Login butonuna tiklar
    // Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
    // headers da bulunan egitimler kismina tiklar
    // acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
    // ucretsiz egitimlerden herhangi birini alir
    // kimlik dogrulama islemlerini girer
    // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar
    // Kullanici profil kismindan dersi basarili bir sekilde kaydedildigini test ede
UdemyHomePage udemyHomePage=new UdemyHomePage();
LoginPage loginPage=new LoginPage();
MyPage myPage=new MyPage();
    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("udemyUrl"));

        udemyHomePage.loginButtonHomePage.click();

        loginPage.loginEmailBox.sendKeys(ConfigReader.getProperty("udemyKullaniciMail"));

        loginPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("udemyKullaniciSifre"));

        loginPage.submitButton.click();

        Assert.assertTrue(myPage.loggedCheckControl.isDisplayed());




    }
}
