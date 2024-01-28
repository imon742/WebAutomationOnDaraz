package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElements extends DriverSetup  {
    @Test
    public void TestAdvanceElements() throws InterruptedException{


        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioButton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        WebElement text = browser.findElement(By.cssSelector(".ui-autocomplete-input"));
        text.sendKeys("Locate using css selector");
        Thread.sleep(500);

        browser.get("https://trytestingthis.netlify.app");
        System.out.println(browser.findElement(By.xpath("//h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("h1")).getText());

        WebElement firstName = browser.findElement(By.xpath("//*[@id='fname']"));
        firstName.sendKeys("Hello World xpath");
        Thread.sleep(500);
        firstName.clear();
        firstName = browser.findElement(By.cssSelector("#fname"));
        firstName.sendKeys("Hello World cssSelector");
        Thread.sleep(500);

        browser.get("https://trytestingthis.netlify.app/");

        //With xpath locating parent with // then child with /
        WebElement header = browser.findElement(By.xpath("//div /h1"));
        System.out.println(header.getText());

        System.out.println(browser.findElement(By.xpath("//div /h1")).getText());

        //With CSS selector locating parent with // then child with /

        WebElement header1 = browser.findElement(By.cssSelector("div > h1"));
        System.out.println(header1.getText());

        System.out.println(browser.findElement(By.cssSelector("div > h1")).getText());

        /* With multiple attribute using xpath connectiong them with and */

        WebElement home = browser.findElement(By.xpath("//a[@class=\"button bar-item\" and @href=\"/\"]"));
        System.out.println(home.getText());

        /* With multiple attribute using css selector connectiong them with and */

        System.out.println(browser.findElement(By.cssSelector("a[class=\"button bar-item\"][href=\"/\"]")).getText());

        System.out.println(browser.findElement(By.cssSelector("a[class=\"button bar-item\"][href=\"/contact\"]")).getText());

        /* With fix starting sub-string using xpath
         */
        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick,\" window.open('http://google.com',\")]")).getText());



        /* With fix starting sub-string using css selector
         */
        System.out.println(browser.findElement(By.cssSelector("button[onclick^=\" window.open('http://google.com',\"]")).getText());




        /* With any sub-string using css selector
         */

        System.out.println(browser.findElement(By.cssSelector("button[onclick*=\" window.open('http://google.com','_blank')\"]")).getText());

        /* With any sub-string using xpath

         */

        System.out.println(browser.findElement(By.xpath("//button[contains(@onclick,\" window.open('http://google.com','_blank')\")]")).getText());

        /* parent with multiple child . Finding them using 1,2,3 last() while  using xpath
         */
        System.out.println(browser.findElement(By.xpath("//tr /th[1]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[2]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[3]")).getText());

        System.out.println(browser.findElement(By.xpath("//tr /th[last()]")).getText());



        /* parent with multiple child . Finding them using 1,2,3 last() while  using css selector
         */
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(1)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(2)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(3)")).getText());

        System.out.println(browser.findElement(By.cssSelector("tr > th:last-child")).getText());


        // locating with visible text on website
        System.out.println(browser.findElement(By.xpath("//td[text()='Geller']")).getText());

        // locating with visible sub text from website which can be change time to time

        System.out.println(browser.findElement(By.xpath("//td[text()='Personal Shopper']")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'ersonal Sh')]")).getText());


        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /preceding-sibling::td")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /following-sibling::td[last()]")).getText());
    }


    /*
    @Test
    public void testEX() throws InterruptedException {
        browser.get("https://www.ebl.com.bd/");
        Thread.sleep(5000);
        browser.findElement(By.xpath("//i[@class='fa fa-times']")).click();
        browser.findElement(By.xpath("//a[normalize-space()='Career']")).click();
        Thread.sleep(5000);

    }

     */


}
