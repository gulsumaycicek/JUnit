package Pratik02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {

     /*
   ...Exercise1...
   BeforeClass ile driver ı olusturun ve class icinde static yapin
   Maximize edin, 15 sn bekletin
   http://www.google.com adresine gidin
   arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
   arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
   arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
   AfterClass ile kapatın

*/
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @Before
    public void testtenOnce(){
        driver.get("https://www.google.com");

    }
    @Test
    public void test1(){
        WebElement aramaKutusu= driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("Green Mile");
        aramaKutusu.submit();

    }

    @Test
    public void test02() {

        WebElement aranmaKutusu = driver.findElement(By.name("q"));
        aranmaKutusu.sendKeys("Premonition" + Keys.ENTER);


    }
    @Test
    public void test03(){
        WebElement aramaKutusu= driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("The Curious Case of Benjamin Button"+Keys.ENTER);
    }
    @After
    public void testtenSonra(){
        WebElement sonucyazısıElementi= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("sonucyazısıElementi.getText:"+ sonucyazısıElementi.getText());



    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
