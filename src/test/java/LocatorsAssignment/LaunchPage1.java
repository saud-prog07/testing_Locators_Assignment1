package LocatorsAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchPage1 {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");

        driver.findElement(By.id("log_email")).sendKeys("Saud");
        driver.findElement(By.id("log_password")).sendKeys("Saud@gmail.com");

        System.out.println("Page Title: " + driver.getTitle());

        String pageSource = driver.getPageSource();

        System.out.println("Page Source Length: " + pageSource.length());

        driver.quit();
    }
}
