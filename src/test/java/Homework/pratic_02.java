package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class pratic_02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //youtube sayfasına gidin
         driver.get("https://www.youtube.com");
         //basligin "yotube" olup olmadigini kontrol edin, degilse acual basligi yazdirin
        String actualsayfaBasligi = driver.getTitle();
        String arananKelime = "youtube";

        if (actualsayfaBasligi.contains(arananKelime)){
            System.out.println("sayfa basligi  youtube testi PASSED");
        }else{
            System.out.println("sayfa basligi youtube testi FAILED " + actualsayfaBasligi + " yoktur");
        }

        //Url'nin "youtube icerip icermedigini kontrol edin, icermiyorsa actual Url'yi yazdirin
        String actualUrl = driver.getCurrentUrl();
        String arananKelimeUrl = "youtube";

        if (actualUrl.contains(arananKelimeUrl)){
            System.out.println("yotube url testi PASSED");
        }else{
            System.out.println("youtube url testi FAILED " + actualUrl + "yoktur");
        }


        //amazon sayfasina gidin
        driver.get("https://www.amazon.com/");

        //youtube sayfasina geri donun
        driver.navigate().back();
        //sayfayi yenileyin
        driver.navigate().refresh();

        //amazon sayfasina donun
        driver.navigate().forward();
        //sayfayi tam sayfa yapin
        driver.manage().window().maximize();

        //amazon sayfa basligi "Amazon" icerip icermedigini dogrulayın, icermiyorsa actual title'i yazdir
        String actualTitle = driver.getTitle();
        String arananKelimeTitle = "Amazon";

        if (actualTitle.contains(arananKelimeTitle)){
            System.out.println("Title testi amazon PASSED");
        }else{
            System.out.println("Title testi amazon FAILED " + actualTitle + "yoktur");
        }

        //amazon Url'sinin https://www.amazon.com/ olup olmadigini kontol edin, degilse actual Url'yi yazdirin
        String actualUrlAmazon = driver.getCurrentUrl();
        String arananUrlAmazon ="https://www.amazon.com/";

        if (actualUrlAmazon.contains(arananUrlAmazon)){
            System.out.println("amazon url testi PASSED");
        }else{
            System.out.println("amazon url testi FAILED " + actualUrlAmazon + "yoktur");
        }

       // sayfayi kapat
        driver.close();
    }
}
