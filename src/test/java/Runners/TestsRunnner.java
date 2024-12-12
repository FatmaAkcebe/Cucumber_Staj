package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"", //buraya feature files ın path i verilecek.
        },
        glue = {"StepDefinitions"}
)

public class TestsRunnner extends AbstractTestNGCucumberTests {

}
