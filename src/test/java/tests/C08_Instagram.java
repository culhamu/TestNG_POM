package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.InstagramPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C08_Instagram extends TestBaseRapor {

    @Test
    public void instagramTest(){

        InstagramPage instagramPage=new InstagramPage();
        Faker faker=new Faker();

        Driver.getDriver().get(ConfigReader.getProperty("instagramUrl"));

        instagramPage.emailBox.sendKeys(faker.internet().emailAddress());

        instagramPage.passwordBox.sendKeys(faker.internet().password());

        instagramPage.loginButton.click();
    }
}
