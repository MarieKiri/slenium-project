package com.cydeo.tests.day06_alerts_ifrmaes_windows;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dropdowns_T6_T7_T8 extends TestBase {
    @Test
    public void dropdown_task6() {

       /* //setup chrome session
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        */


        //select Dropdown menu with name year by xpath and visible text
        driver.get("https://practice.cydeo.com/dropdown");

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1933");

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("11");

        Select dateDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dateDropdown.selectByIndex(0);






    }

    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select Illinois
    //4. Select Virginia
    //5. Select California
    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)

    @Test
    public void selectStateDropdown (){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/dropdown");

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");
        String expectedState = "Illinois";
        String actualState = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualState.equalsIgnoreCase(expectedState));

        //4. Select Virginia
        stateDropdown.selectByValue("VA");
        String expectedState2 = "Virginia";
        String actualState2 = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualState2.equalsIgnoreCase(expectedState2));


        //5. Select California
        stateDropdown.selectByIndex(5);
        String expectedState3 = "California";
        String actualState3 = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualState3.equalsIgnoreCase(expectedState3));



    }

}
