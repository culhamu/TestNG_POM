package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C09_Udemy extends TestBaseRapor {


UdemyHomePage udemyHomePage=new UdemyHomePage();
LoginPage loginPage=new LoginPage();
MyPage myPage=new MyPage();
OnlineEgitimlerPage onlineEgitimlerPage=new OnlineEgitimlerPage();
KimlikDogrulamaPage kimlikDogrulamaPage=new KimlikDogrulamaPage();
PaymentPage paymentPage=new PaymentPage();
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
        Select select=new Select(onlineEgitimlerPage.onlineSiralamaDdm);

        select.selectByValue("price_ASC");

        // ucretsiz egitimlerden herhangi birini alir
        onlineEgitimlerPage.lessonStresTonetimiEgitimi.click();
        onlineEgitimlerPage.hemenBaslaButton.click();

        // kimlik dogrulama islemlerini girer
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(kimlikDogrulamaPage.emailKutusu,ConfigReader.getProperty("udemyKullaniciMail"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("nevzat")
                .sendKeys(Keys.TAB)
                .sendKeys("tarhan")
                .sendKeys(Keys.TAB)
                .sendKeys("varsova")
                .sendKeys(Keys.TAB)
                .sendKeys("15600")
                .sendKeys(Keys.TAB)
                .sendKeys("varsova")
                .sendKeys(Keys.TAB)
                .sendKeys("1111111111").perform();
        kimlikDogrulamaPage.odemeButon.click();

        // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar
        Assert.assertTrue(paymentPage.ucretsizEgitimControl.isDisplayed());

        paymentPage.siparisiTamamlaButton.click();

        // Kullanici profil kismindan dersi basarili bir sekilde kaydedildigini test ede


    }
    @Test(dependsOnMethods = "test01")
    public void stresYonetimiControl(){

        // Kullanici profil kismindan dersi basarili bir sekilde kaydedildigini test eder

        Assert.assertTrue(paymentPage.siparisDersText.isDisplayed());
    }
}
