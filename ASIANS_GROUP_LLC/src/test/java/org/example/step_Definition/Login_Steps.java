package org.example.step_Definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.login_Action.Login_Action;
import org.openqa.selenium.WebDriver;

public class Login_Steps {

    Login_Action login_action;

    WebDriver driver;

    public Login_Steps(Login_Action login_action, Common_Steps common_steps) {
        this.login_action = login_action;
        this.driver = common_steps.getDriver();
    }

    @Given("I open application url  in browser")
    public void i_open_application_url_in_browser() {

    driver.get("https://console.uat.asians.group/#/domain/list");

    }
    @Given("I enter email and password")
    public void i_enter_email_and_password() {

    login_action.EnterEmail("avinashgavali123@gmail.com");
    login_action.EnterPassword("Avi@2115");


    }
    @When("I click on login button")
    public void i_click_on_login_button() {

        login_action.clickOnSignInButton();

    }
    @Then("Login should be successful")
    public void login_should_be_successful() {

        System.out.println("Logged in Successfully ");

    }


}
