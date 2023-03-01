package com.cydeo.step_definitions;

import com.cydeo.pages.AutomationPracticePage;
import com.cydeo.pages.AutomationPracticePage2;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestCase4_StepDefinitions {

    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    AutomationPracticePage2 automationPracticePage2 = new AutomationPracticePage2();

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {

        Driver.getDriver().get("https://www.automationexercise.com");

    }

    @When("I click on Signup  Login button")
    public void i_click_on_signup_login_button() {

        automationPracticePage.signupLoginButton.click();

    }

    @Then("I should see Login to your account page")
    public void i_should_see_login_to_your_account_page() {
        Assert.assertTrue(automationPracticePage.loginToYourAccountText.isDisplayed());

    }

    @When("I enter my email and password")
    public void i_enter_my_email_and_password() {

        automationPracticePage.loginEmailBox.sendKeys("my11@email.com");
        automationPracticePage.loginPassword.sendKeys("password");



    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        automationPracticePage.loginButton.click();

    }

    @Then("I should see Logged in as username message")
    public void i_should_see_logged_in_as_username_message() {

        automationPracticePage.loggedInAsUserNameText.isDisplayed();

    }

    @When("I click on Logout button")
    public void i_click_on_logout_button() {
        automationPracticePage2.logoutButton.click();

    }

    @Then("I should see the \"Login to your account page")
    public void i_should_see_the_login_to_your_account_page() {

        Assert.assertTrue(automationPracticePage.loginToYourAccountText.isDisplayed());

    }
}
