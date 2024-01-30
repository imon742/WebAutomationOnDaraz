package org.example;

import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleAlert extends DriverSetup {

    @Test


    public void test_different_Alert() throws InterruptedException {


        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        browser.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(3000);


        //Switiching to the Alert tab to click confirm or Cancel
        Alert alert = browser.switchTo().alert();
        System.out.println("First Alert Message : "+alert.getText());
        alert.accept();


        //Matching with the result that was shown in the site


        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(),"You successfully clicked an alert");

        //Now clicking and checking those other button in the site.

        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = browser.switchTo().alert();
        System.out.println("Second Alert Message : "+alert.getText());

        alert.accept();

        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(),"You clicked: Ok");

        //Now Clicking Cancel {put the 3 button in 3 web element}

        WebElement jS_Button2 = browser.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        System.out.println(jS_Button2.getText());

        jS_Button2.click();

        alert = browser.switchTo().alert();
        System.out.println("Second Alert Message 2nd time: "+alert.getText());
        alert.dismiss();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(),"You clicked: Cancel");

        WebElement jS_Button3 = browser.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        System.out.println(jS_Button3.getText());

        jS_Button3.click();

        alert = browser.switchTo().alert();
        System.out.println("3rd Alert Message 1st time: "+alert.getText());

        alert.dismiss();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(),"You entered: null");



        jS_Button3.click();
        alert = browser.switchTo().alert();
        System.out.println("3rd Alert Message 2st time: "+alert.getText());
        alert.accept();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(),"You entered:");


        jS_Button3.click();
        alert = browser.switchTo().alert();
        System.out.println("3rd Alert Message 3rd time: "+alert.getText());
        alert.sendKeys("Hi.This is 3rd time");
        alert.accept();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(),"You entered: Hi.This is 3rd time");









        Thread.sleep(3000);

    }



}
