package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Test_IFrameElement extends DriverSetup{

    @Test
    public void testIFrameIteams() throws InterruptedException {

        browser.get("https://ebl.com.bd/onlineapply");
/*
        Actions actions = new Actions(browser);

        actions.scrollToElement(browser.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")));
        Thread.sleep(2000);
        actions.scrollByAmount(0, 1000);
        Thread.sleep(2000);

 */

        JavascriptExecutor js = (JavascriptExecutor) browser;

        WebElement scroll = browser.findElement(By.xpath("//h4[normalize-space()='Information on']"));

        js.executeScript("arguments[0].scrollIntoView();", scroll);


        browser.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();

        Thread.sleep(5000);



    }
}
