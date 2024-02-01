package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScrollWebpage extends DriverSetup {
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

        Actions actions = new Actions(browser);

        actions.scrollToElement(browser.findElement(By.xpath("//a[@class='blinkingText']")));
        Thread.sleep(2000);
        actions.scrollByAmount(0, 1000);
        Thread.sleep(2000);


    }

}
