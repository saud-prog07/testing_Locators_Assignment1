package LocatorsAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchPage3 {

    @Test
    public void automationPracticeTest() {

    	 WebDriver driver = new ChromeDriver();
    	 
        driver.get("http://automationpractice.com/index.php");

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        System.out.println("Title Length: " + title.length());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("Current URL: " + currentUrl);

        Assert.assertTrue(
                currentUrl.contains("automationpractice"),
                "URL is not the expected page"
        );

        System.out.println("URL Verification: Passed");

        String pageSource = driver.getPageSource();

        System.out.println("Page Source Length: " + pageSource.length());

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Number of Links: " + links.size());

        System.out.println("---------- ALL LINKS ----------");

        for (WebElement link : links) {

            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");

            System.out.println("Text: " + linkText + " URL: " + linkUrl);
        }

        driver.quit();
    }
}