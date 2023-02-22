package Testler;

import Sayfalar.AnaSayfa;
import Sayfalar.AramaSayfasi;
import Sayfalar.GirisSayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisSayfasi girisSayfasi;
    private AramaSayfasi aramaSayfasi;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        aramaSayfasi = new AramaSayfasi(driver);
        girisSayfasi = new GirisSayfasi(driver);

        driver.get("https://www.trendyol.com");
    }

    @Test
    void trendyolTest(){

        anaSayfa.elementGozukeneKadarBekle(anaSayfa.cookie);
        anaSayfa.tusaBas(anaSayfa.cookie);

        anaSayfa.elementGozukeneKadarBekleXpatc(anaSayfa.giris);
        anaSayfa.tusaBasxpath(anaSayfa.giris);


        girisSayfasi.elementGozukeneKadarBekle(girisSayfasi.emailAlani);
        girisSayfasi.emailYaz(girisSayfasi.emailAlani,"asdasd@hotmail.com");

        girisSayfasi.elementGozukeneKadarBekle(girisSayfasi.sifreAlani);
        girisSayfasi.sifreYaz(girisSayfasi.sifreAlani,"şifre");

        girisSayfasi.tusaBasxpath(girisSayfasi.kullaniciGirisiYap);




    }

    @AfterEach
    void kapatma(){
        driver.close();
    }


}
