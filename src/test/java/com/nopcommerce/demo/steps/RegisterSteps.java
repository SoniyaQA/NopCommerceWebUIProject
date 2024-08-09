package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class RegisterSteps {
    @Given("User is on homepage")
    public void userIsOnHomepage() {
    }

    @When("User click on I am Human")
    public void userClickOnIAmHuman() {

        new RegisterPage().clickOnIAmHuman();

    }

    @When("User click on register button")
    public void userClickOnRegisterButton() {
        new RegisterPage().clickOnRegister();
    }

    @Then("User should be able to verify the Register Text")
    public void userShouldBeAbleToVerifyTheRegisterText() {
        Assert.assertEquals(new RegisterPage().verifyRegisterText(),"Register","Register Text is not verified");
    }


}
