package org.example.test_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"org/example/step_Definition"}
        , tags = "@RegistrationHappyPath"
        , plugin = {"pretty","html:target/report.html"}
        , dryRun = false  //dry run mode
)

public class Test_Runner {
}
