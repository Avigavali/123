package org.example.step_Definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Common_Steps {
    private WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
