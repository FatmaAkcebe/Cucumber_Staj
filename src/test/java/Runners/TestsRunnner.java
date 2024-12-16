package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeaturesFiles/_01_Login.feature",
                "src/test/java/FeaturesFiles/_02_Country.feature",
                "src/test/java/FeaturesFiles/_03_CitizenShip.feature",
                "src/test/java/FeaturesFiles/_04_CountryMultipleScenario.feature"
                //buraya feature files ın path i verilecek.
        },
        glue = {"StepDefinitions"}
)

public class TestsRunnner extends AbstractTestNGCucumberTests {

}
