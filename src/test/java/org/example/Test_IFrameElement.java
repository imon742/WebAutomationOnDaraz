package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Test_IFrameElement extends DriverSetup{

    @Test
    public void testIFrameIteams() throws InterruptedException {

      //  browser.get("https://ebl.com.bd/onlineapply");
/*
        Actions actions = new Actions(browser);

        actions.scrollToElement(browser.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")));
        Thread.sleep(2000);
        actions.scrollByAmount(0, 1000);
        Thread.sleep(2000);

 */

        /*

        //There is a small Error finding Iframe and clicking it

        JavascriptExecutor js = (JavascriptExecutor) browser;

        WebElement scroll = browser.findElement(By.xpath("//h4[normalize-space()='Information on']"));

        js.executeScript("arguments[0].scrollIntoView();", scroll);
        Thread.sleep(5000);


        browser.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();



        browser.get("https://www.ebl.com.bd/onlineapply");
      JavascriptExecutor js = (JavascriptExecutor) browser;
        WebElement recaptcha_text = browser.findElement(By.xpath("//label[normalize-space()='Google Recaptcha']"));
        js.executeScript("arguments[0].scrollIntoView();", recaptcha_text);
        Thread.sleep(2000);
        browser.switchTo().frame(0);
        browser.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
       Thread.sleep(5000);

       */


        //Finding I-frame and interacting with it

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) browser;
        WebElement hoverButton = browser.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();", hoverButton);

        //Switching to Iframe
        browser.switchTo().frame(0);
        Thread.sleep(5000);

        //ei type er xpath diye 3 ta iframe er vitore e 1st ta select kora hoise.
        System.out.println(browser.findElement(By.xpath("(//a[@href=\"https://courses.rahulshettyacademy.com/sign_up\"])[1]")).getText());

        //Frame e dhukle kaj ses korei bar hoye aste hbe.

        browser.switchTo().defaultContent();
        System.out.println(hoverButton.getText());

        //Switching to frame with different method without index

        browser.switchTo().frame("courses-iframe");
        System.out.println(browser.findElement(By.xpath("(//a[@href=\"https://courses.rahulshettyacademy.com/sign_up\"])[1]")).getText());



        Thread.sleep(5000);



    }
}
