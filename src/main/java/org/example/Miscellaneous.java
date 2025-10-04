package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.FileChooserUI;
import java.io.File;
import java.io.IOException;

public class Miscellaneous {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //deleting cookies
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("cookiename");


        driver.get("https://rahulshettyacademy.com/AutomationPractice");

        //taking Screenshot
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("C:\\Users\\FF612ZH\\OneDrive - EY\\Pictures\\SS\\screen.png"));

    }
}
