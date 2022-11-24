package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class pratic_01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        //facebook sayfasina gidin ve basligin "facebook" oldugunu dogrulayin, degilse actual baslıgı yazdırın
        String actualTitle = driver.getTitle();
        String arananKelime = "facebook";

        if (actualTitle.contains(arananKelime)){
            System.out.println("Title facebook testi PASSED");
        }else{
            System.out.println("Title facebook testi FAILED " + actualTitle + " icermiyor");
        }

        //sayfa Url'inin "facebook" kelimesi icerdigini dogrulayin
        String actualUrl =driver.getCurrentUrl();
        String arananUrl ="facebook";

        if (actualUrl.contains(arananUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url testi FAILED");
        }

        //https://www.walmart.com/ sayfasina gidin
        driver.get("https://www.walmart.com/");

        //sayfa basligin "Walmart.com" icerdigini dogrulayin
        String actualTitle1 = driver.getTitle();
        String arananKelime1 = "Walmart.com";

        if (actualTitle1.contains(arananKelime1)){
            System.out.println("Title walmart testi PASSED");
        }else{
            System.out.println("Title walmart testi FAILED");
        }

        //tekrar "facebook" sayfasina dönun
        driver.navigate().back();
        //sayfayi yenile
        driver.navigate().refresh();
        //sayfayi tam sayfa yapın
        driver.manage().window().maximize();

        //Browser'i kapatin
        driver.close();
    }
}
