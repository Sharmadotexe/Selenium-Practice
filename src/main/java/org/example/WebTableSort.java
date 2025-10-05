package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.http.WebSocket;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class WebTableSort {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr//th[1]")).click();

        List<WebElement> li = driver.findElements(By.xpath("//tr//td[1]"));

//    List<String> list = li.stream().map(s -> s.getText()).collect(Collectors.toList());
//
//    List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
//
//        Assert.assertTrue(sortedList.equals(list));

        //scan the table and find Beans and return the price of the beans
        List<String> price;
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr//td[1]"));
             price = rows.stream().filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggie(s)).collect(Collectors.toList());

            price.stream().forEach(q -> System.out.println(q));

            if(price.size()<1){
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }while(price.size()<1);
    }
    private static String getPriceVeggie(WebElement s){
        String priceval = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        System.out.println(priceval);
        return priceval;
    }
}


