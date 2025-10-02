package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {


        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
            Actions a = new Actions(driver);
            WebElement move = driver.findElement(By.id("nav-link-accountList"));

            a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("laptop").doubleClick().build().perform();

            //Moves to specific element
            a.moveToElement(move).contextClick().build().perform();
    }
}
