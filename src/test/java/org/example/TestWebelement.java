package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

public class TestWebelement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException{
        browser.get("https://trytestingthis.netlify.app/");


        WebElement header = browser.findElement(By.tagName("h1"));
        System.out.println(header.getText());

        WebElement uname = browser.findElement(By.id("uname"));
        uname.sendKeys("Hello World");
         Thread.sleep(200);

        WebElement firstname = browser.findElement(By.id("fname"));
        firstname.sendKeys("Nazmul");
        Thread.sleep(200);

        WebElement lastname = browser.findElement(By.name("lname"));
        lastname.sendKeys("Islam");
        Thread.sleep(200);

        //finding by class name
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement text = browser.findElement(By.className("ui-autocomplete-input"));
        text.sendKeys("Locate Using class name");
        Thread.sleep(1000);

        WebElement pertialLinktext = browser.findElement(By.partialLinkText("Free Access to InterviewQues/"));
        System.out.println(pertialLinktext.getText());
        Thread.sleep(500);

        /*

        WebElement openTab = browser.findElement(By.linkText("Open Tab"));
        openTab.click();
        Thread.sleep(1000);

         */


        WebElement radioButton1 = browser.findElement(By.cssSelector("input[value=\"radio1\"]"));
        radioButton1.click();
        Thread.sleep( 5000);

        WebElement xpath = browser.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
        xpath.click();
        Thread.sleep( 5000);


    }

}
