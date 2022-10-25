package com.cydeo.step_definitions;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class doubleClickSteps  {
    DoubleClickPage doubleClickPage = new DoubleClickPage();
    WebDriver driver = Driver.getDriver();
    @Given("I am on the specified page")
    public void iAmOnTheSpecifiedPage() {

       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

    }
    @When("I double click the text")
    public void iDoubleClickTheText() {
       driver.switchTo().frame(doubleClickPage.iframe);
        BrowserUtils.implicitWait(3);
        BrowserUtils.doubleClick(doubleClickPage.demoText);
        BrowserUtils.implicitWait(3);

    }

    @Then("the text will turn red")
    public void theTextWillTurnRed() {
        String exp = "color: red;";
        String act = doubleClickPage.demoText.getAttribute("style");
        Assert.assertTrue(act.equals(exp));
        System.out.println(act);
        Driver.closeDriver();
    }

}
