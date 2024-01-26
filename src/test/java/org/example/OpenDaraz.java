package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenDaraz extends DriverSetup {
    public static void main(String[] args) {

    }
    @Test
    public void openDarazHPandTitleCheck() throws InterruptedException{
       // WebDriver browser = new EdgeDriver();
        browser.get("https://www.daraz.com.bd/");
        Assert.assertEquals(browser.getTitle(),"Online Shopping in Bangladesh: Order Now from Daraz.com.bd");
        WebElement xpath = browser.findElement(By.xpath("//a[@data-spm=\"dhome\"]"));
        xpath.click();
        Thread.sleep( 5000);

    }

    @Test
    public void openProductpage(){
        // WebDriver browser = new EdgeDriver();
        browser.get("https://www.daraz.com.bd/catalog/?spm=a2a0e.searchlist.search.1.77257926wlD7RR&q=realme&_keyori=ss&clickTrackInfo=textId--8795233196416677782__abId--None__pvid--ba5e2845-80ba-4e5c-99ed-64cca596ad81__matchType--1__abGroup--None__srcQuery--realme__spellQuery--realme__ntType--nt-common&from=suggest_normal&sugg=realme_0_1");
        Assert.assertEquals(browser.getTitle(),"realme - Buy realme at Best Price in Bangladesh | www.daraz.com.bd");
    }
}

