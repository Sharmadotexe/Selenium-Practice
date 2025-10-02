package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class Assignment3 {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");


            driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
            driver.findElement(By.id("password")).sendKeys("learning");


            driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();


            driver.findElement(By.id("okayBtn")).click();


            WebElement element = driver.findElement(By.xpath("//select[@class='form-control']"));
            Select dd = new Select(element);
            dd.selectByIndex(2);


            driver.findElement(By.id("terms")).click();
            driver.findElement(By.id("signInBtn")).click();


            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));





            List<WebElement> btns = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
            System.out.println(btns.size());
            for(int i = 0; i< btns.size(); i++){
                driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
            }




            driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();



















        }
}
