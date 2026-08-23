package LocatorsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPage2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.easycalculation.com/");

        driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");

        driver.findElement(By.xpath("//button[@class='search_button']")).click();

        System.out.println("Page Title: " + driver.getTitle());

        String pageSource = driver.getPageSource();

        System.out.println("Page Source Length: " + pageSource.length());

        driver.quit();
    }
}