package wyszukiwanie;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Zad3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");


        // zgadzamy się na cookie
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();


        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("selenium webdriver");
        element.submit();
        //driver.quit();
    }

}