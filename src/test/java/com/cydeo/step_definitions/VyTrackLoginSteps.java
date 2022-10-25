package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLogin;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VyTrackLoginSteps {

    VyTrackLogin vyTrackLogin = new VyTrackLogin();
    WebDriver driver = Driver.getDriver();
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
       driver.get("https://qa2.vytrack.com/user/login");
    }

    @When("the user enters username {string}")
    public void theUserEntersUsername(String arg0)
    {
     vyTrackLogin.usrNameField.sendKeys(arg0);
    }

    @And("the user enters password {string}")
    public void theUserEntersPassword(String arg0) {
        vyTrackLogin.pswdField.sendKeys(arg0);
        vyTrackLogin.submitBtn.click();
        BrowserUtils.implicitWait(3);
    }

    @Then("the user should see dashboard")
    public void theUserShouldSeeDashboard() {
        BrowserUtils.waitExplicit(vyTrackLogin.helpIcon, 10);
        Assert.assertTrue(vyTrackLogin.helpIcon.isDisplayed());
        Driver.closeDriver();
    }
    }


