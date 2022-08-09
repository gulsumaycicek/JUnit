package day13_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Deneme extends TestBase {

    @Test
    public void test01() {

        //1. "https://www.saucedemo.com" Adresine gidin

        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna "standard_user" yazdirin

       driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user"+ Keys.ENTER);

        //3. Password kutusuna "secret_sauce" yazdirin

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"+Keys.ENTER);
        //4. Login tusuna basin

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrunİsmi=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        ilkUrunİsmi.click();
        String ilkUrununİsmi="Sauce Labs BackPack";


        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        //7. Alisveris sepetine tiklayin
       driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin

      WebElement urunSepeti=  driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
      Assert.assertTrue(urunSepeti.isDisplayed());

        //9. Sayfayi kapatin

        driver.close();

    }
}
