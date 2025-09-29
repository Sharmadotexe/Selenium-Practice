package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Arrays;

public class locators {
    public static void main(String[] args) throws InterruptedException {
        String name = "vikas";
        WebDriver driver = new ChromeDriver();

        locators locator = new locators();
        locator.getPassword(driver);
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//
//        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("vikas");
//        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//        driver.findElement(By.id("chkboxOne")).click();
//        driver.findElement(By.id("chkboxTwo")).click();
//        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//
//
//        Thread.sleep(2000);
//
//        System.out.println(driver.findElement(By.tagName("p")).getText());
//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
//
//
//        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
//        driver.close();
    }



    public void getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.linkText("Forgot your password?")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        Thread.sleep(2000);
         String msgg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();

         String[] passArr = msgg.split("'");

         String password = passArr[1];
         System.out.println(password);

    }


}
