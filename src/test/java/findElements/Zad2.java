package findElements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Zad2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.name("hotel_location")).sendKeys("Warsaw");
        driver.findElement(By.name("search_room_submit"));
        driver.findElement(By.name("email")).sendKeys(" test6454377@test.com");
        driver.findElement(By.name("submitNewsletter"));




        // zgadzamy się na cookie
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

    }

}