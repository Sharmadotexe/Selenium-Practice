package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class newDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");



        //Firstly it will stay disabled so

        driver.findElement(By.id("custom_date_picker_id_2")).click();
//        Thread.sleep(2000);
        if(driver.findElement(By.id ("marketDate_2")).getDomAttribute("style").contains("0.5")){
            System.out.println("It is disabled");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("It is enabled");
        }

//        driver.findElement(By.id("divpaxinfo")).click();
//        Thread.sleep(2000);
//        for(int i=0; i<3; i++){
//        driver.findElement(By.id("hrefIncAdt")).click();
//        }
//
//        driver.findElement(By.id("btnclosepaxoption")).click();
//
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//        driver.manage().window().maximize();


//        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
//
//        driver.findElement(By.xpath("//a[@value='GOI']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click();
//
//
//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
    }

}
