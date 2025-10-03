package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");

        JavascriptExecutor ex = (JavascriptExecutor)driver;

        ex.executeScript("window.scrollBy(0,500)");

        Thread.sleep(2000);

        ex.executeScript("document.querySelector('.tableFixHead').scrollTop=50");

       List<WebElement> dat= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

        int sum = 0;
        for(int i = 0; i < dat.size(); i++){
           sum = sum + Integer.parseInt(dat.get(i).getText());
        }
        System.out.println("The Total sum is: "+sum);

        String getText = driver.findElement(By.cssSelector("div.totalAmount")).getText();

        int value = Integer.parseInt(getText.split(":")[1].trim());
        System.out.println("The Total value is: "+value);
        Assert.assertEquals(sum,value);
    }
}
