package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

     int rowSize = driver.findElements(By.cssSelector(".table-display tr")).size();
        System.out.println("Total Number of Rows in table are: "+rowSize);


        int colSize = driver.findElements(By.cssSelector(".table-display th")).size();
        System.out.println("Total Number of cols in table are: "+colSize);

        System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());

    }
}
