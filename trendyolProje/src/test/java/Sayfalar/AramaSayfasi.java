package Sayfalar;

import org.openqa.selenium.WebDriver;

public class AramaSayfasi extends Sayfa{

    public final String aratmaKutusu = "[placeholder='Aradığınız ürün, kategori veya markayı yazınız']";

    public AramaSayfasi(WebDriver driver) {
        super(driver);
    }
}
