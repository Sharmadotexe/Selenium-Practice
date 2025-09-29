package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //invoking browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\FF612ZH\\OneDrive - EY\\Documents\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //firstly we are trying to enter wrong password
        driver.findElement(By.id("inputUsername")).sendKeys("abcd");
        driver.findElement(By.name("inputPassword")).sendKeys("pass");
        driver.findElement(By.className("signInBtn")).click();
//
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//

        driver.findElement(By.linkText("Forgot your password?")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vikas");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vikas.sh0812@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9999999999");

        //input[type='text']:nth-child(4)
        driver.findElement(By.className("reset-pwd-btn")).click();

        driver.findElement(By.className("go-to-login-btn")).click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("vikas");
    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
    driver.findElement(By.id("chkboxOne")).click();
    driver.findElement(By.id("chkboxTwo")).click();
    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();













    }
}