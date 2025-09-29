package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class VegetablePractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);


       List<WebElement> elements =  driver.findElements(By.cssSelector("h4.product-name"));
       String[] namesArr = {"Cucumber","Brinjal","Tomato"};
       int j=0;
       //convert array into arrayList

        for (int i = 0; i < elements.size(); i++) {
            String[] name = elements.get(i).getText().split("-");
            String formattedName = name[0].trim();
            List namesList = Arrays.asList(namesArr);

            if(namesList.contains(formattedName)){
                driver.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(i).click();
            }

            if(j==namesList.size()){
                break;
            }
        }

    }
}
