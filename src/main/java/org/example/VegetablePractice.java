package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VegetablePractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        String[] namesArr = {"Cucumber","Brinjal","Tomato"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        addToCart(driver,namesArr);

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        //wait until the page loads
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='action-block']/button")));

        driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));


        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());




    }

    public static  void addToCart(WebDriver driver, String[] namesArr){

        List<WebElement> elements =  driver.findElements(By.cssSelector("h4.product-name"));
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
