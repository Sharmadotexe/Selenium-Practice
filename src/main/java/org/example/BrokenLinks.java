package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        SoftAssert a = new SoftAssert();
         List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

         for(WebElement link: links){
             String url =  link.getAttribute("href");
             HttpURLConnection connn = (HttpURLConnection) new URL(url).openConnection();
             connn.setRequestMethod("HEAD");
             connn.connect();
             int resCode = connn.getResponseCode();

             if(resCode>400){
                 System.out.println(link.getText());
                 a.assertTrue(false);
             }
         }
         a.assertAll();
    }
}

