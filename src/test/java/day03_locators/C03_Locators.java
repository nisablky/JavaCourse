package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
        /*
        a. http://a.testaddressbook.com adresine gidiniz
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) butonuna tıklayın..
            i. Usename : testtechproed@gmail.com
            ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com olduğunu doğrulayin(verify).
        f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini (displayed) doğrulayın(verify)
        3. Sayfada kaç tane link olduğunu bulun

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signInButonu = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) butonuna tıklayın..
        //  i. Usename : testtechproed@gmail.com
        //  ii. Password : Test1234!
       emailTextBox.sendKeys("testtechproed@gmail.com");
       passwordTextBox.sendKeys("Test1234!");
       signInButonu.click();

        // e. Expected user id nin testtechproed@gmail.com olduğunu doğrulayin(verify).
        WebElement actualKullaniciAdiElementi = driver.findElement(By.className("navbar-text"));
        //bir weElementin üzerinde ne yazdığını görmek istersek webElementIsmi.getText() kullanırız
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedUserMail ="testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println("Expected kullanıcı testi PASSED");
        }else{
            System.out.println("Expected kullanıcı testi FAİLED");
        }


        // f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini (displayed) doğrulayın(verify)
        WebElement adressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi = driver.findElement(By.linkText("Sign out"));
        if(adressesElementi.isDisplayed()){
            System.out.println("adresses testi PASSED");
        }else{
            System.out.println("adresses testi FAILED");
        }

        if(signOutElementi.isDisplayed()){
            System.out.println("signOut testi PASSED");
        }else{
            System.out.println("signOut testi FAILED");
        }

        // 3. Sayfada kaç tane link olduğunu bulun

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayısı : " + linklerListesi.size());

        //linkleri yazdıralım
        //Listemiz webelemenlerden oluştuğu için direk yazdıramayız direk yazdırırsak referansları yazdırırız
        //onun yerine for-each loop yapıp her bir link webelementinin uzerindeki yazıyı yazdırmalıyız
        for (WebElement each: linklerListesi
             ) {
            System.out.println(each.getText());

        }

        driver.close();




    }
}
