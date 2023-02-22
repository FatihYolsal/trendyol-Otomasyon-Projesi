package Sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa{

    public final String cookie = "onetrust-accept-btn-handler";
    public final String giris = "//p[.='Giriş Yap']";

    public final String girisYap = ".login-button";


    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
