package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // setting up the web driver manager
        WebDriver driver = new ChromeDriver();  // create the instance of Chrome browser driver
        driver.get("https://www.google.com"); // test if driver and browser and working as expected
    }
}
