package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='GOI']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click();


        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        if(driver.findElement(By.id ("marketDate_2")).getDomAttribute("style").contains("0.5")){
            System.out.println("It is disabled");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("It is enabled");
        }


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        WebElement el = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Thread.sleep(1000);
        Select passangerDD = new Select(el);
        passangerDD.selectByIndex(0);



        WebElement element = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(1);
        System.out.println(dropdown.getFirstSelectedOption().getText());



        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();

    }
    }

