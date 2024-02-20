package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiffrentWait extends DriverSetup{

    @Test
    public void testDiffrentWait() throws InterruptedException {

        browser.get("https://qavbox.github.io/demo/alerts/");

        //heard sleep to stop java execution for fixed amount of time

        Thread.sleep(10000); //Static wait for stop execution(Fixed wait of java not selenium )


        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//This is an implicit wait (Dynamic wait. Driver e ekbar manage kore dile jdi kuno exception pay seita solve hoy kina tar jnno wait korbe upto jotokhon ami bolbo)-> No such elements exception dbe.  


        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.findElement(By.id("delayalert")).click();

        //heard sleep to stop java execution for fixed amount of time

        Thread.sleep(10000);



        //Switching to alert and accept it  

        Alert alert = browser.switchTo().alert();
        alert.accept();

    }
}
