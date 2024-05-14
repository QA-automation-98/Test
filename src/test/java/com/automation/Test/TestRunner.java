package com.automation.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRunner {
	
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmandeepSingh\\eclipse-workspace\\Test\\src\\test\\java\\com\\automation\\Test\\chromedriver.exe");
        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void launchBrowser() {
        // Open a website
        driver.get("https://www.google.com");
        // You can add your test steps here
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}
