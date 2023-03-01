package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class ReusableMethods {
    static WebDriver driver;

    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }

    }

    public static void getScreenshotAllPage(TakesScreenshot tss,String isim){

        File allPageScreenshot=new File("src/test/java/pageScreenshot/"+isim+".png");

        File temporaryPicture=tss.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(temporaryPicture,allPageScreenshot);
        } catch (IOException e) {

        }

    }
    public static void getScreenshotPartialPage(WebElement locate,String isim){
        File parialElementScreenshot=new File("src/test/java/pageScreenshot/"+isim+".png");
        File temporaryPicture=locate.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(temporaryPicture,parialElementScreenshot);
        } catch (IOException e) {

        }

    }
}
