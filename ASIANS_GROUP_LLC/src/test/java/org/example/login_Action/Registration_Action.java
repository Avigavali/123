package org.example.login_Action;

import org.example.login_Element.Login_Element;
import org.example.login_Element.Registration_Element;
import org.example.step_Definition.Common_Steps;
import org.openqa.selenium.WebDriver;

public class Registration_Action {

    WebDriver driver;

    Registration_Element registration_element;

    public Registration_Action(Common_Steps common_steps, Registration_Element registration_element) {
        this.driver = common_steps.getDriver();
        this.registration_element = registration_element;
    }

    public void ClickOnRegisterLink(){
        registration_element.RegisterLink.click();
    }

    public void EnterEmail(String Email){
        registration_element.Email.sendKeys(Email);
    }

    public void EnterPassword(String Password){
        registration_element.Password.sendKeys(Password);
    }

    public void EnterConfirmPassword(String ConfirmPassword){
        registration_element.ConfirmPassword.sendKeys(ConfirmPassword);
    }

    public void ClickOnRegisterButton(){
        registration_element.ClickOnRegisterButton.click();
    }
}
