package day06_radioButton_checBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Deneme {

    WebDriver driver;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }



    @Test
                public void test1(){

        driver.get("https://www.trendyol.com");
        driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("kalem"+ Keys.ENTER);
      String urunSayısı=  driver.findElement(By.xpath("//div[@class='dscrptn']")).getText().replaceAll("\\D","");
      int toplamUrunSayısı=Integer.parseInt(urunSayısı);
            System.out.println("trendyol toplam urun:"+toplamUrunSayısı);



            driver.switchTo().newWindow(WindowType.TAB).get("https://www.hepsiburada.com");
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kol saat"+Keys.ENTER);

           String urunadeti= driver.findElement(By.xpath("//b[@class='searchResultSummaryBar-bold']")).getText().replaceAll("\\D","");
           int  hepsiBuradatoplam=Integer.parseInt(urunadeti);
            System.out.println("hepsiburada toplam urun:"+hepsiBuradatoplam );









        }

}
