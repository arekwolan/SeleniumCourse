package findElements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import taskcheckconfig.GenerateEmail;


public class Zad3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        //Thread.sleep(2000)

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("hide_xs")).click();

        WebElement email = driver.findElement(By.className("account_input"));
        email.sendKeys(GenerateEmail.withTimestamp());
        WebElement subButton = driver.findElement(By.xpath("//*[@id='SubmitCreate']/span"));
        subButton.click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Arek");
        driver.findElement(By.xpath("//*[@id=\'customer_lastname\']")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\'email\']")).clear();
        WebElement secEmail = driver.findElement(By.xpath("//*[@id=\'email\']"));
        secEmail.sendKeys(GenerateEmail.withTimestamp());
        driver.findElement(By.xpath("//*[@id=\'passwd\']")).sendKeys("Test123");

        WebElement regButton = driver.findElement(By.xpath("//*[@id=\'submitAccount\']/span"));
        regButton.click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(5) > a > span"));
        driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(4) > a > span"));















//        // zgadzamy się na cookie
//        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
//        agreeButton.click();

    }

}