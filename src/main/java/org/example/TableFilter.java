package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class TableFilter {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Rice");

        List<WebElement> ele = driver.findElements(By.xpath("//tr//td[1]"));

        List<WebElement>filterted = ele.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());

        //Assertion
        Assert.assertEquals(ele.size(), filterted.size());
    }
}
