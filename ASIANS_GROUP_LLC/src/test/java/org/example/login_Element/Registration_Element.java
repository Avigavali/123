package org.example.login_Element;

import org.example.step_Definition.Common_Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Element {

    WebDriver driver;

    public Registration_Element(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    public WebElement RegisterLink;

    @FindBy(css = "input#email")
    public WebElement Email;

    @FindBy(css = "input#password")
    public WebElement Password;

    @FindBy(css = "input#password-confirm")
    public WebElement ConfirmPassword;

    @FindBy(css = "input[value=\"Register\"]")
    public WebElement  ClickOnRegisterButton;
}
