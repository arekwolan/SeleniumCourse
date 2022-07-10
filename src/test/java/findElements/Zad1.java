package findElements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Zad1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.id("hotel_location")).sendKeys("Warsaw");
        driver.findElement(By.id("search_room_submit"));
        driver.findElement(By.id("newsletter-input")).sendKeys(" test6454377@test.com");



        // zgadzamy się na cookie
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

    }

}