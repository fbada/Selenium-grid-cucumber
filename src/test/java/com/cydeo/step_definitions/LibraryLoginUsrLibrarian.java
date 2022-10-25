package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginUsrLibrarian {

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        Driver.getDriver().get("");
        System.out.println("I am on the login page. In the Given.");
    }

    @When("user enters username {string}")
    public void userEntersUsername(String arg0) {
        System.out.println("I enter user name:" + arg0+" in the username field. In the WHEN.");
    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg0) {
        System.out.println("I enter password" + arg0+" in the password field. In the AND.");
    }

    @Then("user should see dashboard")
    public void userShouldSeeDashboard() {
        System.out.println("I am logged in. I see the dashboard. I am in the THEN.");
    }
}



