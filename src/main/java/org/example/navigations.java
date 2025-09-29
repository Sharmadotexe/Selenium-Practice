package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigations {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/?zx=1758642213389&no_sw_cr=1");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
        driver.navigate().back();
        driver.navigate().forward();


//        driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
    }
}
