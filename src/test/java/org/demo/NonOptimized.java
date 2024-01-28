package org.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.time.Duration;

public class NonOptimized
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
        inputText("//input[@id=\"text-00000008\"]", "BrowserStack University");
        inputText("//*[.=\"Principal\"]/../div/input[@placeholder=\"First\"]", "Big");
        inputText("//*[.=\"Principal\"]/../div/input[@placeholder=\"Last\"]", "Boss");
        inputText("//*[.=\"Teacher-in-charge\"]/../div/input[@placeholder=\"First\"]", "Little");
        inputText("//*[.=\"Teacher-in-charge\"]/../div/input[@placeholder=\"Last\"]", "Boss");
        inputText("//input[@id=\"text-0000000e\"]", "Teacher");
        inputText("//input[@id=\"text-00000010\"]", "Computer Science");
        inputText("//input[@placeholder=\"Street Address\"]", "123 Some Street");
        inputText("//input[@placeholder=\"Street Address Line 2\"]", "Apt. ABC");
        inputText("//input[@placeholder=\"City\"]", "Any Town");
        inputText("//input[@placeholder=\"Region\"]", "South");
        inputText("//input[@placeholder=\"Postal / Zip Code\"]", "12345");
        inputText("//input[@placeholder=\"### ### #### \"]", "1234567890");
        inputText("//label[.=\"Email\"]/..//input[@type=\"email\"]", "tester@gmail.com");
        inputText("//input[@placeholder=\"Postal / Zip Code\"]", "12345");
        inputText("//input[@id=\"text-00000018\"]", "Selling cookies");
        inputText("//input[@id=\"text-0000001a\"]", "3rd grade - 10 participants");
        inputText("//input[@id=\"text-0000001c\"]", "Lots of money");
        clickElement("//input[@id=\"0000001e_0\"]");
        clickElement("//input[@id=\"0000001e_1\"]");
        clickElement("//input[@id=\"0000001e_2\"]");
        clickElement("//input[@id=\"0000001e_3\"]");
;
        //clickElement("//button[@type=\"submit\"]");
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Thank you')]")));
    }

    @AfterMethod
    public void teardown() {
       driver.quit();
    }

    public void clickElement(String xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).isEnabled();
        driver.findElement(By.xpath(xpath)).click();
    }
    public void inputText(String xpath, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).isEnabled();
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

}


