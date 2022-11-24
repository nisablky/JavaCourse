package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {

        /*
         en ilkel haliyle bir otomasyon yapmak için
         Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
         bunun için Java kütüphanesinden System.setProperty() methodu kullanırız
         method 2 parametre istemektedir
         ilki kullanacağımız driver : webdriver.chrome.driver
         ikincisi ise bu driverin fiziki yolu :

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");

        Thread.sleep(2000);
        driver.close();
        //

    }
}
