package org.example.step_Definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.login_Action.Registration_Action;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;

public class Registration_Steps {


    WebDriver driver;

    Registration_Action registration_action;

    public Registration_Steps(Common_Steps common_steps, Registration_Action registration_action) {
        this.driver = common_steps.getDriver();
        this.registration_action = registration_action;
    }


    @Given("I open login URL  in the  browser")
    public void i_open_login_url_in_the_browser() {

        driver.get("https://console.uat.asians.group/#/domain/list");
    }
    @Given("I navigate to Register web element")
    public void i_navigate_to_register_web_element() {
        registration_action.ClickOnRegisterLink();

    }
    @When("I fill registration form")
    public void i_fill_registration_form(DataTable dataTable) {
        registration_action.EnterEmail(dataTable.cell(1,0));
        registration_action.EnterPassword(dataTable.cell(1,1));
        registration_action.EnterConfirmPassword(dataTable.cell(1,2));

//             |    Column0                    |   Column1     |  Column2      |
//    Row 0    |Email                          |Password       |ConformPassword|
//    Row 1    |avinashgavali123@gmail.com     |Avi@2115       |Avi@2115       |

    }
    @When("I click on register button")
    public void i_click_on_register_button() {

        registration_action.ClickOnRegisterButton();
    }
    @Then("The message should be displayed")
    public void the_message_should_be_displayed() {

        System.out.println("Registration has been successfully");

    }
}
