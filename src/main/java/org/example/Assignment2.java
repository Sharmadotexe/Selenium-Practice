package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Vikas");

        driver.findElement(By.xpath("//div[@class='form-group']/input[@name='email']")).sendKeys("vikas@gmail.com");
        driver.findElement(By.xpath("//div[@class='form-group']/input[@type='password']")).sendKeys("pass123");


        driver.findElement(By.id("exampleCheck1")).click();


        WebElement element = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dd = new Select(element);

        dd.selectByIndex(0);


        driver.findElement(By.xpath("//div[@class='form-group']/input[@name='bday']")).sendKeys("08-12-2002 ");


        driver.findElement(By.cssSelector(".btn.btn-success")).click();

        Thread.sleep(2000);

        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
    }
}

