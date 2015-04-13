package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Mr_Faton on 02.04.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver(true);
//        WebDriver driver = new FirefoxDriver();
        driver.get("http://prospero.ru/");
//
        System.out.println(driver.getTitle());
//        WebElement query = driver.findElement(By.name("login"));
//        query.sendKeys("Mr_Faton");
//        query = driver.findElement(By.name("pass"));
//        query.sendKeys("123");
//        query.submit();
////        WebElement query = driver.findElement(By.className("authorized-button"));
////        query.click();
//
//        System.out.println(driver.getTitle());
    }
}
/*
можно эмулировать разные браузеры
 */