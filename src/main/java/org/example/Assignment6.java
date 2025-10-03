package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        driver.findElement(By.id("checkBoxOption3")).click();
        String mainTxt = driver.findElement(By.cssSelector("label[for='honda']")).getText();
        WebElement dd = driver.findElement(By.id("dropdown-class-example"));

        Select dropdwn  = new Select(dd);
        dropdwn.selectByVisibleText(mainTxt);

        driver.findElement(By.id("name")).sendKeys(mainTxt);
        driver.findElement(By.id("alertbtn")).click();
        String alertTxt = driver.switchTo().alert().getText();

        String finalTxt = alertTxt.split(" ")[1].trim().split(",")[0];
        System.out.println(finalTxt);
        driver.switchTo().alert().accept();
    }
}
