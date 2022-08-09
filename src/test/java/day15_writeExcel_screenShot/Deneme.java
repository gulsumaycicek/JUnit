package day15_writeExcel_screenShot;

import org.apache.commons.io.FileUtils;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class Deneme extends TestBase {


    @Test
    public void test01() throws IOException {
        // 1- Url'in amazon icerdigini test edin
        driver.get("https://www.amazon.com");
        String arananKelime = "amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananKelime));

        TakesScreenshot ts= (TakesScreenshot) driver;

        File tumSayfaResim=new File("target/ekranGoruntuleri/tumSayfa.jpeg");

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        String arananResim="Nutella";
       // Assert.assertTrue(actualUrl.contains(arananResim));
        WebElement sonucYaziElementi= driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));


        File sonucYaziElementSS= new File("target/ekranGoruntuleri/sonucYazisiSS.jpeg");
        File temp=sonucYaziElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temp,sonucYaziElementSS);




    }
}
