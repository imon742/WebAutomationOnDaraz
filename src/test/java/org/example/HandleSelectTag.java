package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleSelectTag extends DriverSetup{

    @Test
    public void testDropDow() throws InterruptedException {

        browser.get("https://trytestingthis.netlify.app/");


        //Storing all the option in a single variable

        WebElement dropdown = browser.findElement(By.id("option"));
        System.out.println(dropdown.getText());
        dropdown.click();
        Thread.sleep(2000);

        //Selecting By Up - Down Arrow.
        dropdown.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dropdown.sendKeys(Keys.ENTER);
        Thread.sleep(2000);


        //Creating a object in selenium select class
        Select select = new Select(dropdown);




        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        //Selecting By VALUE

        select.selectByValue("option 3");
        System.out.println("Option 3 : " + select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        //Selecting By visibleText

        select.selectByVisibleText("Option 1");
        System.out.println(" Option 1 : " + select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
















        Thread.sleep(5000);







    }


}
