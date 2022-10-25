package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BrowserUtils {
    //Methods are static. Because we do not want to create an object to call those methods.
    // We just want to call those methods with class name. That is why they are static type


    /**
     * This method is used to pause the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     * @param seconds
     */
    public static void sleep(int seconds){
        // 1 second = 1000 millis
        // millis = seconds*1000
        try {
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }


    public static void verifyTitle( String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public static void implicitWait(int sec){
        Driver.getDriver().manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }
public static void doubleClick(WebElement element){
    Actions action = new Actions(Driver.getDriver());
    action.doubleClick(element).perform();
}

public static void waitExplicit(WebElement element, int sec){
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),sec);
    wait.until(ExpectedConditions.visibilityOf(element));
}
}