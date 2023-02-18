package org.example.login_Action;

import org.example.login_Element.Login_Element;
import org.example.step_Definition.Common_Steps;
import org.openqa.selenium.WebDriver;

public class Login_Action {

    WebDriver driver;

        Login_Element login_element;

    public Login_Action(Common_Steps common_steps, Login_Element login_element) {
        this.driver = common_steps.getDriver();
        this.login_element = login_element;
    }

    public void EnterEmail(String email){
    login_element.Email.sendKeys(email);
    }

    public void EnterPassword(String password){
        login_element.Password.sendKeys(password);
    }

    public void clickOnSignInButton(){
        login_element.SignInButton.click();
    }


}
