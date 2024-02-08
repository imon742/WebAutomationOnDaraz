package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DiffrentWait extends DriverSetup{

    @Test
    public void testDiffrentWait() throws InterruptedException {

        browser.get("https://qavbox.github.io/demo/alerts/");
        browser.findElement(By.id("delayalert")).click();

        //heard sleep to stop java execution for fixed amount of time

        Thread.sleep(10000);

        //Switching to alert and accept it  

        Alert alert = browser.switchTo().alert();
        alert.accept();

    }
}
