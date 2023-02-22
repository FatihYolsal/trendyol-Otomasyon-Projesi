package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisSayfasi extends Sayfa{

    public final String emailAlani = "login-email";
    public final String sifreAlani = "login-password-input";
    public final String kullaniciGirisiYap = "//button[@class='q-primary q-fluid q-button-medium q-button submit']/span[.='Giriş Yap']";


    public GirisSayfasi(WebDriver driver) {
        super(driver);
    }
}
