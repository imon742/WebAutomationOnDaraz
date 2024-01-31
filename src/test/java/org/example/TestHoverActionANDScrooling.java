package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestHoverActionANDScrooling extends DriverSetup {

    @Test

    public void testHover() throws InterruptedException {

        browser.get("https://demoqa.com/menu");
        WebElement menu2 = browser.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));

        //Calling Action class of Selenium Which have hover function

        Actions actions = new Actions(browser);
        //Click and hold holo hover and action cls er je kuno kisu korar pore Build() Perform() use korte hoy
        actions.clickAndHold(menu2).build().perform();

        Thread.sleep(2000);

        // Veriable e na raikha sub function hover kora

        actions.clickAndHold(browser.findElement(By.linkText("SUB SUB LIST »"))).clickAndHold().build().perform();

        Thread.sleep(2000);


    }

    @Test


    public void testScroolAndHover() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(browser);

        actions.scrollToElement(browser.findElement(By.xpath("//legend[normalize-space()='iFrame Example']")));

        WebElement hoverButton = browser.findElement(By.xpath("//button[@id='mousehover']"));
        actions.clickAndHold(hoverButton).build().perform();
        Thread.sleep(3000);
        actions.click(browser.findElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();
        //browser.findElement(By.xpath("//a[normalize-space()='Top']")).click();
        Thread.sleep(5000);

        actions.scrollByAmount(0, 1000);
        actions.clickAndHold(hoverButton).build().perform();
        Thread.sleep(3000);
        actions.click(browser.findElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();
        Thread.sleep(5000);

        //hover and click

        actions.scrollByAmount(0, 1000);
        actions.clickAndHold(hoverButton).click(browser.findElement(By.xpath("//a[normalize-space()='Reload']"))).build().perform();





        Thread.sleep(5000);


    }

}
