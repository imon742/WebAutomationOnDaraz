package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class All extends DriverSetup {
    @Test
    public void testScroll() throws InterruptedException {


        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(2000);

        //Scrool tp specific element

        WebElement hover = browser.findElement(By.xpath("//button[@id='mousehover']"));

        js.executeScript("arguments[0].scrollIntoView();", hover);


        Thread.sleep(2000);


    }
    @Test
    public void rokomariTrial() throws InterruptedException{

        browser.get("https://www.rokomari.com/");
        //popup Add
        browser.findElement(By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']")).click();
        //bike add
        browser.findElement(By.xpath("//span[@aria-hidden='true']")).click();
        browser.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]")).click();
        browser.findElement(By.xpath("//a[@id='js--authors']")).click();
        browser.findElement(By.xpath(""))



        Thread.sleep(3000);






    }

}
