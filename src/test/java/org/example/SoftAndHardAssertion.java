package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertion extends DriverSetup {

    @Test

    public void testDifferentAssertion() throws InterruptedException {

        // Hard assert false hole execution off hye jabe.
        System.out.println("Print A");
        Assert.assertEquals(1,1); //example of hard assertion(assert. diye thakbe)
        //hard assertion e fail korle porer gula run kore na
        System.out.println("Print B");
        System.out.println("Print C");
        System.out.println("Print D");

        //softAssert. Fail holew baki code er part run hobe.

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Print A");
        softAssert.assertEquals(1,2);
        System.out.println("Print B");
        System.out.println("Print C");
        softAssert.assertTrue(false);
        System.out.println("Print D");


        softAssert.assertAll(); //assert all na dile report e asbe na but sob kisu normally run hobe,


    }
}
