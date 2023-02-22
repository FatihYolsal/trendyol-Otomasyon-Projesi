package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {

    WebDriver driver;

    public Sayfa(WebDriver driver){
        this.driver = driver;
    }

    public void elementGozukeneKadarBekle(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void elementGozukeneKadarBekleXpatc(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
    }

    public void elementGozukeneKadarBeklexpatcCss(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }

    public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
    }

    public void tusaBasxpath(String tusId){
        driver.findElement(By.xpath(tusId)).click();
    }
    public void tusaBascss(String tusId){
        driver.findElement(By.cssSelector(tusId)).click();
    }

    public void emailYaz (String elementId, String emailAdresi){
        driver.findElement(By.id(elementId)).sendKeys(emailAdresi);
    }
    public void sifreYaz (String elementId, String sifreId){
        driver.findElement(By.id(elementId)).sendKeys(sifreId);
    }

    public void alanaYaziYaz (String elementId, String Arama){
        driver.findElement(By.id(elementId)).sendKeys(Arama);
    }
    public void alanaYaziYazCss (String elementId, String Arama){
        driver.findElement(By.cssSelector(elementId)).sendKeys(Arama);
    }

    public void klavyeTusuaBas (String elementId, Keys klavyeTusu){
        driver.findElement(By.id(elementId)).sendKeys(klavyeTusu);
    }


}
