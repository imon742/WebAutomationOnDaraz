package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class All extends DriverSetup {
    @Test
    public void testScroll() throws InterruptedException {


        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(2000);

        //Scrool tp specific element

        WebElement hover = browser.findElement(By.xpath("//button[@id='mousehover']"));

        js.executeScript("arguments[0].scrollIntoView();", hover);


        Thread.sleep(2000);


    }
    @Test
    public void rokomariTrial() throws InterruptedException{

        browser.get("https://www.rokomari.com/");

        JavascriptExecutor js = (JavascriptExecutor) browser;

        Actions actions = new Actions(browser);

        //popup Add
        browser.findElement(By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']")).click();
        //bike add
        browser.findElement(By.xpath("//span[@aria-hidden='true']")).click();

        browser.findElement(By.xpath("//a[@id='js--authors']")).click();
        browser.findElement(By.xpath("//input[@id='authorsearch']")).sendKeys("হুমায়ূন আহমেদ");
        browser.findElement(By.xpath("//button[@class='btn btnSearchSubmit']//i[@class='fa fa-search']")).click();
        //clicking on humayen
        browser.findElement(By.xpath("//img[@alt='Humayun Ahmed books']")).click();
        Thread.sleep(3000);

        //bike add

        browser.findElement(By.xpath("//span[@aria-hidden='true']")).click();
        Thread.sleep(3000);
        //Click on filter

        WebElement scroll2instock = browser.findElement(By.xpath("//label[@for='instock']"));

        js.executeScript("arguments[0].scrollIntoView();", scroll2instock);
        Thread.sleep(2000);

        browser.findElement(By.xpath("//label[@for='rok-filter-categoryIds-677']")).click();
        Thread.sleep(3000);

//        WebElement scroll2হুমায়ূন_আহমেদ_এর_বই_সমূহ = browser.findElement(By.xpath("//h1[contains(text(),'হুমায়ূন আহমেদ এর বই সমূহ')]"));

//        js.executeScript("arguments[0].scrollIntoView();", scroll2হুমায়ূন_আহমেদ_এর_বই_সমূহ);
//        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)" );
        Thread.sleep(3000);


        //select "rochona"

        WebElement ClickRochona = browser.findElement(By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]"));
        ClickRochona.click();
        Thread.sleep(4000);

        //scroll down

        WebElement Find = browser.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[59]/div[1]/a[1]/div[1]/img[1]"));
        js.executeScript("arguments[0].scrollIntoView()", Find);
        Thread.sleep(4000);

        //goto next page

        WebElement ClickNextPage = browser.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[3]/a[1]"));
        ClickNextPage.click();
        Thread.sleep(4000);
//Add hover
//        actions.clickAndHold(browser.findElement(By.xpath("//div[@title='বাসর হুমায়ূন আহমেদ']//div[1]//div[3]"))).clickAndHold().build().perform();
//
//
//        Thread.sleep(5000);
//        browser.findElement(By.xpath("//div[@title='বাসর হুমায়ূন আহমেদ']//div[1]//div[3]//button[1]")).click();

        WebElement HoverBook = browser.findElement(By.xpath("//h4[contains(text(),'সাজঘর')]"));
        actions.moveToElement(HoverBook).perform();
        Thread.sleep(2000);

        //select add to cart

        WebElement ClickAddToCart = browser.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[3]/button[1]"));
        ClickAddToCart.click();
        Thread.sleep(4000);

        Thread.sleep(3000);
//Click on cart
        browser.findElement(By.xpath("//a[@id='js-cart-menu']//*[name()='svg']")).click();

        browser.findElement(By.xpath("//a[@id='js-cart-menu']//*[name()='svg']")).click();

        browser.findElement(By.xpath("//span[normalize-space()='Place Order']")).click();
        Thread.sleep(3000);

    }
    @Test
    public void rokomariTrial2() throws InterruptedException{

        browser.get("https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0");
      JavascriptExecutor js = (JavascriptExecutor) browser;

        //popup Add
        browser.findElement(By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']")).click();

        Thread.sleep(5000);
        //bike add
       browser.findElement(By.xpath("//span[@aria-hidden='true']")).click();


        WebElement scroll2instock = browser.findElement(By.xpath("//label[@for='instock']"));

        js.executeScript("arguments[0].scrollIntoView();", scroll2instock);
        Thread.sleep(9000);

        browser.findElement(By.xpath("//label[@for='rok-filter-categoryIds-677']")).click();
        Thread.sleep(3000);

        browser.get("https://www.rokomari.com/book#_=_");
        browser.manage().window().maximize();
        Thread.sleep(1000);

//        //login with Gmail account
//
//        WebElement SignIn = browser.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
//        SignIn.click();
//        Thread.sleep(2000);
//
//        WebElement ClickGoogle = browser.findElement(By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));
//        ClickGoogle.click();
//        Thread.sleep(2000);
//
//        WebElement EmailIn = browser.findElement(By.xpath("//input[@id='identifierId']"));
//        EmailIn.sendKeys("autoemon101@gmail.com");
//        Thread.sleep(2000);
//
//        WebElement ClickNext = browser.findElement(By.xpath("//span[contains(text(),'Next')]"));
//        ClickNext.click();
//        Thread.sleep(3000);
//
//        WebElement PassIn = browser.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
//        PassIn.sendKeys("123qwe!@#QWE");
//        Thread.sleep(3000);
//
//        WebElement ClickNext2 = browser.findElement(By.xpath("//span[contains(text(),'Next')]"));
//        ClickNext2.click();
//        Thread.sleep(3000);

        //hover "lekhok"
        Actions action = new Actions(browser);
        WebElement HoverLekhok = browser.findElement(By.xpath("//a[@id='js--authors']"));
        action.moveToElement(HoverLekhok).perform();
        Thread.sleep(4000);

        //select "Humayun ahmed"
        WebElement ClickHumayun = browser.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
        ClickHumayun.click();
        Thread.sleep(4000);

        //scroll down

       // JavascriptExecutor js = (JavascriptExecutor) browser;

        js.executeScript("window.scrollBy(0,500)" );
        Thread.sleep(3000);

        //select "somokalin uponnash"

        WebElement ClickShomokalin = browser.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]"));
        ClickShomokalin.click();
        Thread.sleep(4000);

        //scroll down

        js.executeScript("window.scrollBy(0,500)" );
        Thread.sleep(3000);


        //select "rochona"

        WebElement ClickRochona = browser.findElement(By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]"));
        ClickRochona.click();
        Thread.sleep(4000);

        //scroll down

        WebElement Find = browser.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[59]/div[1]/a[1]/div[1]/img[1]"));
        js.executeScript("arguments[0].scrollIntoView()", Find);
        Thread.sleep(4000);

        //goto next page

        WebElement ClickNextPage = browser.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[3]/a[1]"));
        ClickNextPage.click();
        Thread.sleep(4000);

        //scroll down

        js.executeScript("window.scrollBy(0,500)" );
        Thread.sleep(3000);

        //add a book to cart

        WebElement HoverBook = browser.findElement(By.xpath("//h4[contains(text(),'সাজঘর')]"));
        action.moveToElement(HoverBook).perform();
        Thread.sleep(2000);

        //select add to cart

        WebElement ClickAddToCart = browser.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[3]/button[1]"));
        ClickAddToCart.click();
        Thread.sleep(4000);

        //click cart icon
        WebElement ClickCart = browser.findElement(By.xpath("//body/div[7]/section[1]/div[1]/a[1]/div[1]/img[1]"));
        ClickCart.click();
        Thread.sleep(4000);

        //click place order
        WebElement ClickOrder = browser.findElement(By.xpath("//a[@id='js-continue-to-shipping']"));
        ClickOrder.click();
        Thread.sleep(4000);

        //add information
        //clear name field
        browser.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[1]/input[1]")).clear();
        Thread.sleep(2000);

        //input name

        WebElement NameIn = browser.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[1]/input[1]"));
        NameIn.sendKeys("Emon Ali");
        Thread.sleep(2000);

        //input number
        WebElement PhoneIn = browser.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[1]/input[1]"));
        PhoneIn.sendKeys("01123456789");
        Thread.sleep(2000);

        //select city

        WebElement CityIn = browser.findElement(By.xpath("//select[@id='js--city']"));
        CityIn.click();
        Thread.sleep(2000);

        WebElement CityIn2 = browser.findElement(By.xpath("//option[contains(text(),'ঢাকা')]"));
        CityIn2.click();
        Thread.sleep(2000);

        //select area
        WebElement AreaIn = browser.findElement(By.xpath("//select[@id='js--area']"));
        AreaIn.click();
        Thread.sleep(2000);

        WebElement AreaIn2 = browser.findElement(By.xpath("//option[contains(text(),'আদাবর')]"));
        AreaIn2.click();
        Thread.sleep(2000);

        //address input
        WebElement AddressIn = browser.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]"));
        AddressIn.click();
        Thread.sleep(3000);

        //scroll down
        js.executeScript("window.scrollBy(0,250)" );
        Thread.sleep(3000);


        WebElement AddressIn2 = browser.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]"));
        AddressIn2.sendKeys("PC Culture Housing, Shyamoli");
        Thread.sleep(2000);

        //scroll down
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
        Thread.sleep(3000);

        //sign out
        WebElement SignOut = browser.findElement(By.xpath("//a[@id='dropdownMenu2']"));
        SignOut.click();
        Thread.sleep(2000);

        WebElement SignOut2 = browser.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
        SignOut2.click();
        Thread.sleep(2000);


    }


}
