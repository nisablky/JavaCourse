package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amaazon.com");

        /*
        ilerde wait konusunu daha geniş ele alacağız
        bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre
        bir yuklenme suresine ihtiyac vardir
        veya bir web elementinin kullanılabilmesi için zamana ihtiyaç olabilir
        implicitlyWait bize sayfanın yuklenmesi ve sayfadaki elementlere ulasim için beklenecek
        MAXIMUM sureyi belirleme olanağı tanır

         */


        driver.close();
    }
}
