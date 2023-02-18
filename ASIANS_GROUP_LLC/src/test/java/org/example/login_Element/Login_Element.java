package org.example.login_Element;

import org.example.step_Definition.Common_Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Element {

    WebDriver driver;

    public Login_Element(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#username")
    public WebElement Email;

    @FindBy(css = "input#password")
    public WebElement Password;

    @FindBy(css = "input#kc-login")
    public WebElement SignInButton;

}
