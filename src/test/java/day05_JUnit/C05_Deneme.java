package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_Deneme {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();
        String arananKelime = "Google";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title " + arananKelime + "'yi icermiyor, title testi FAILED");
        }
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@name='q']"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //div[@id='result-stats']


        List<WebElement> istenenElementListesi = driver.findElements(By.xpath(" //div[@id='result-stats']"));
        WebElement sonucYazisiElementi = istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());

        //    7. sonuc sayisinin 10 milyon’dan fazla oldugunu test edin



    }
}
