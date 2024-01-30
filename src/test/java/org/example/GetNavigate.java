package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GetNavigate extends DriverSetup{

    @Test
    public void testGetVav() throws InterruptedException {

        //Printing Title with get method
        browser.get("https://trytestingthis.netlify.app/");
        System.out.println(browser.getTitle());
        Thread.sleep(2000);

        //Navigating forward and backward amd Printing Title with Navigate method

        browser.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());
        Thread.sleep(2000);
        browser.navigate().back();
        System.out.println(browser.getTitle());
        browser.navigate().forward();
        System.out.println(browser.getTitle());
        Thread.sleep(4000);
        browser.navigate().back();
        browser.navigate().refresh();
        Thread.sleep(4000);
        System.out.println(browser.getTitle());

         //chcecking refresh................................................
        browser.get("https://youtube.com");
        browser.navigate().refresh();
        Thread.sleep(4000);
        System.out.println(browser.getTitle());

        Thread.sleep(4000);


    }

    @Test
    public void testBrowserWindowTabCreation () throws InterruptedException {

        browser.get("https://trytestingthis.netlify.app/");
        System.out.println(browser.getTitle());
        Thread.sleep(200);

        browser.switchTo().newWindow(WindowType.TAB);
        browser.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());
        //Minimizing , Maximizing , Full-Screen

        browser.manage().window().maximize();
        Thread.sleep(2000);

        browser.manage().window().maximize();
        Thread.sleep(2000);

        browser.manage().window().fullscreen();
        Thread.sleep(2000);


        browser.switchTo().newWindow(WindowType.WINDOW);
        browser.navigate().to("https://youtube.com");
        System.out.println(browser.getTitle());

        //Minimizing , Maximizing , Full-Screen

        browser.manage().window().maximize();
        Thread.sleep(2000);

        browser.manage().window().maximize();
        Thread.sleep(2000);

        browser.manage().window().fullscreen();
        Thread.sleep(2000);

        //Getting current URL

        System.out.println("This is current URL: "+browser.getCurrentUrl());


        browser.close();



        Thread.sleep(4000);

    }


    //Managing driver after creating a new tab or windoe
    @Test

    public void manageDriver() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());

        Thread.sleep(3000);

        //Clicking on new window and taking title to check the driver position

        browser.findElement(By.id("openwindow")).click();
        System.out.println(browser.getTitle());

        //Clicking on new TAB and taking title to check the driver position

        browser.findElement(By.xpath("//a[@id='opentab']")).click();
        System.out.println(browser.getTitle());
        Thread.sleep(3000);

        System.out.println("Printing Current Window handle: "+ browser.getWindowHandle());
        System.out.println("Printing other Window Handles: " + browser.getWindowHandles());

        //Storing all the Window-handles to manage the driver

        List<String> browserWindowHandles = new ArrayList<>(browser.getWindowHandles());
        System.out.println("Browser in position 0: "+ browserWindowHandles.get(0));
        System.out.println("Browser in position 1: "+ browserWindowHandles.get(1));
        System.out.println("Browser in position 2: "+ browserWindowHandles.get(2));

        // Now switching the Driver in the desire window using Window Handles

        browser.switchTo().window(browserWindowHandles.get(1));

        System.out.println("Printing Current Window title: " + browser.getTitle());

        //Now returning to the Tab

        browser.switchTo().window(browserWindowHandles.get(2));
        browser.navigate().refresh();
        Thread.sleep(2000);
        System.out.println("Printing Current Window title: " + browser.getTitle());









        Thread.sleep(3000);

    }



}
