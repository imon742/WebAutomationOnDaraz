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
        Thread.sleep(200);

        //firstNameInputBox.clear();

        WebElement lastNameInputBox = browser.findElement(By.xpath("//input[@id='lname']"));

        lastNameInputBox.sendKeys("Now going to click on male");

        Thread.sleep(200);

        //Getting value of the attribute

        String value1 = browser.findElement(By.xpath("//input[@id='male']")).getAttribute("value");
        System.out.println(value1);

        String fvalue1 = browser.findElement(By.xpath("//input[@id='female']")).getAttribute("value");
        System.out.println(fvalue1);

        String oValueType1 = browser.findElement(By.xpath("//input[@id='other']")).getAttribute("type");
        System.out.println(oValueType1);


//clicking on male female and Other
        browser.findElement(By.xpath("//input[@id='male']")).click();

        lastNameInputBox.clear();
        Thread.sleep(200);
        lastNameInputBox.sendKeys("Now Female");
        Thread.sleep(200);

        browser.findElement(By.xpath("//label[normalize-space()='Female']")).click();

        lastNameInputBox.clear();
        Thread.sleep(200);
        lastNameInputBox.sendKeys("Now Other");
        Thread.sleep(200);

        browser.findElement(By.xpath("//label[normalize-space()='Other']")).click();



        //Getting value of the attribute. attribute newyar somoy input type na nile null ase

       String value = browser.findElement(By.xpath("//input[@id='male']")).getAttribute("value");
        System.out.println(value);

        String fvalue = browser.findElement(By.xpath("//label[normalize-space()='Female']")).getAttribute("value");
        System.out.println(fvalue);

        String oValueType = browser.findElement(By.xpath("//label[normalize-space()='Other']")).getAttribute("type");
        System.out.println(oValueType);

        //Getting CSS properties

        String cssvalue = browser.findElement(By.xpath("//input[@id='male']")).getCssValue("color");
        System.out.println(cssvalue);
        String cssvalueFS = browser.findElement(By.xpath("//input[@id='male']")).getCssValue("font-size");
        System.out.println(cssvalueFS);


        //Checking text visiable or not in boolean ( CSS properties)

        Boolean isMaleDisplayed = browser.findElement(By.xpath("//input[@id='male']")).isDisplayed();
        System.out.println(isMaleDisplayed);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        Boolean displayed = browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("Before Clicking Hide: "+displayed);

        browser.findElement(By.xpath("//input[@id='hide-textbox']")).click();

        //Using same displayed variable twice to take value of same filed

        displayed = browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("After  Clicking Hide: "+displayed);

        //Checking Enable or not

        Boolean enableCheck = browser.findElement(By.xpath("//input[@id='displayed-text']")).isEnabled();

        System.out.println("Checking Enable or Not : "+ enableCheck);


        // Checking Is selected or not


        Boolean select = browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("Before selecting:"+ select);

        browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

        Thread.sleep(100);

        select = browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("After selecting:"+ select);


        Thread.sleep(5000);




    }


}
