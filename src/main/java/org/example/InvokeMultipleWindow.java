package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class InvokeMultipleWindow {
    public static void main(String[] args) throws IOException {
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
        WebElement ele = driver.findElement(By.name("name"));
        ele.sendKeys(abcd);

//        File file =  ele.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File("logo.png"));


        //getting height and width
        System.out.println(ele.getRect().getDimension().getHeight());
        System.out.println(ele.getRect().getDimension().getWidth());
    }
}
