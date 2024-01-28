package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup {
    @Test
    public void testInteractionOfwebElements() throws InterruptedException {

        browser.get("https://trytestingthis.netlify.app");
        WebElement firstNameInputBox = browser.findElement(By.xpath("//input[@id='fname']"));
        firstNameInputBox.sendKeys("Hello World");
        Thread.sleep(5000);

        firstNameInputBox.clear();
        Thread.sleep(5000);

        firstNameInputBox.sendKeys("Now going to click on male");

        Thread.sleep(5000);




    }


}
