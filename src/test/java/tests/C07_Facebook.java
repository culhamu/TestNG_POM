package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C07_Facebook {

    @Test
    public void facebookTest() {
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();

        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));


        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());


        facebookPage.passwordBox.sendKeys(faker.internet().password());


        facebookPage.loginButton.click();

    }

}
