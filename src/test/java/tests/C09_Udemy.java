package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyPage;
import pages.UdemyHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C09_Udemy {




    // ucretsiz egitimlerden herhangi birini alir
    // kimlik dogrulama islemlerini girer
    // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar
    // Kullanici profil kismindan dersi basarili bir sekilde kaydedildigini test ede
UdemyHomePage udemyHomePage=new UdemyHomePage();
LoginPage loginPage=new LoginPage();
MyPage myPage=new MyPage();
    @Test
    public void test01(){
        // Kullanici https://www.iienstitu.com/en sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("udemyUrl"));

        // Login butonuna tiklar
        udemyHomePage.loginButtonHomePage.click();

        // Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
        loginPage.loginEmailBox.sendKeys(ConfigReader.getProperty("udemyKullaniciMail"));

        loginPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("udemyKullaniciSifre"));

        loginPage.submitButton.click();

        Assert.assertTrue(myPage.loggedCheckControl.isDisplayed());

        // headers da bulunan egitimler kismina tiklar
        myPage.egitimlerOnHeaders.click();

        // acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer


    }
}
