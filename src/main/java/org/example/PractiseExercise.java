package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class PractiseExercise {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement ele = driver.findElement(By.id("gf-BIG"));

        System.out.println(ele.findElements(By.tagName("a")).size());

        WebElement coldriver = ele.findElement(By.xpath("//table/tbody/tr/td[1][ul]"));

        int count = coldriver.findElements(By.tagName("a")).size();
        System.out.println(count);

        for (int i = 1; i < count; i++) {
            String keyctrl = Keys.chord(Keys.CONTROL, Keys.ENTER);
            coldriver.findElements(By.tagName("a")).get(i).sendKeys(keyctrl);

            Thread.sleep(3000);
        }

            Set<String> st = driver.getWindowHandles();
            Iterator<String> it = st.iterator();

            while(it.hasNext()){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }
    }
}
