package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Calender {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        //clicking on the top deals link
        driver.findElement(By.linkText("Top Deals")).click();

        //creating a set that contains window handle id of both the windows
        Set<String> st = driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parentID = it.next();
        String childID = it.next();

        //switching to the top deals window
        driver.switchTo().window(childID);


        //declaring the dd/mm/yyyy
        String dd = "3";
        String mm = "10";
        String yyyy = "2025";
        String[] fulldates = {mm,dd,yyyy};


        driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();

        driver.findElement(By.xpath("//button[text()='"+yyyy+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__tile.react-calendar__year-view__months__month")).get(Integer.parseInt(mm)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+dd+"']")).click();


        List<WebElement> datess = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i = 0; i < datess.size(); i++){
            System.out.println(datess.get(i).getAttribute("value"));
            Assert.assertEquals(datess.get(i).getAttribute("value"), fulldates[i]);
        }

        driver.close();
    }
}
