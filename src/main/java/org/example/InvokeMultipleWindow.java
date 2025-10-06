package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class InvokeMultipleWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //new window is opened
        driver.switchTo().newWindow(WindowType.TAB);

        //getting the windowID of the child window
        Set<String> st = driver.getWindowHandles();
        Iterator<String> it = st.iterator();

        String parentID = it.next();
        String childID = it.next();

        driver.switchTo().window(childID);

        driver.get("https://rahulshettyacademy.com/");
        String abcd =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        System.out.println(abcd);
        driver.switchTo().window(parentID);
        driver.findElement(By.name("name")).sendKeys(abcd);





    }
}
