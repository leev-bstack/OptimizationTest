package org.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Optimized
{
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod

    public void startDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void test(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        fillsForm();
        fillsForm();
        fillsForm();
        fillsForm();
        fillsForm();
    }
    public void fillsForm(){
        //go to site
        driver.get("https://www.123formbuilder.com/free-form-templates/School-Donation-Form-3715720/");
        //input
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id=\"text-00000008\"]")).sendKeys( "BrowserStack University");
        driver.findElement(By.xpath("//*[.=\"Principal\"]/../div/input[@placeholder=\"First\"]")).sendKeys( "Big");
        driver.findElement(By.xpath("//*[.=\"Principal\"]/../div/input[@placeholder=\"Last\"]")).sendKeys("Boss");
        driver.findElement(By.xpath("//*[.=\"Teacher-in-charge\"]/../div/input[@placeholder=\"First\"]")).sendKeys("Little");
        driver.findElement(By.xpath("//*[.=\"Teacher-in-charge\"]/../div/input[@placeholder=\"Last\"]")).sendKeys("Boss");
        driver.findElement(By.xpath("//input[@id=\"text-0000000e\"]")).sendKeys("Teacher");
        driver.findElement(By.xpath("//input[@id=\"text-00000010\"]")).sendKeys("Computer Science");
        driver.findElement(By.xpath("//input[@placeholder=\"Street Address\"]")).sendKeys("123 Some Street");
        driver.findElement(By.xpath("//input[@placeholder=\"Street Address Line 2\"]")).sendKeys("Apt. ABC");
        driver.findElement(By.xpath("//input[@placeholder=\"City\"]")).sendKeys("Any Town");
        driver.findElement(By.xpath("//input[@placeholder=\"Region\"]")).sendKeys("South");
        driver.findElement(By.xpath("//input[@placeholder=\"Postal / Zip Code\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder=\"### ### #### \"]")).sendKeys("1234567890");
        driver.findElement(By.xpath("//label[.=\"Email\"]/..//input[@type=\"email\"]")).sendKeys("tester@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Postal / Zip Code\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id=\"text-00000018\"]")).sendKeys("Selling cookies");
        driver.findElement(By.xpath("//input[@id=\"text-0000001a\"]")).sendKeys("3rd grade - 10 participants");
        driver.findElement(By.xpath("//input[@id=\"text-0000001c\"]")).sendKeys("Lots of money");
        driver.findElement(By.xpath("//input[@id=\"0000001e_0\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"0000001e_1\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"0000001e_2\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"0000001e_3\"]")).click();
;
        //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Thank you')]")));
    }

    @AfterMethod
    public void teardown() {
       driver.quit();
    }

}


