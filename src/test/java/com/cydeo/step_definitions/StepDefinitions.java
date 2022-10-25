package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    WebDriver driver = Driver.getDriver();
    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
      driver.get("http://etsy.com");

    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String search) throws Throwable {
      driver.findElement(By.cssSelector("[id*='search-query']")).sendKeys(search + Keys.ENTER);
    }

    @Then("^I should see the results$")
    public void i_should_see_the_results() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("search"));
    }

    @Then("^I should see more results$")
    public void i_should_see_more_results() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("search"));
        Driver.closeDriver();
    }
}
