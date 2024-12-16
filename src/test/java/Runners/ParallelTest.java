package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeaturesFiles/_01_Login.feature",
                "src/test/java/FeaturesFiles/_02_Country.feature",
                "src/test/java/FeaturesFiles/_03_CitizenShip.feature",
                "src/test/java/FeaturesFiles/_04_CountryMultipleScenario.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class ParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserTipi) {
        // Browser ismi thread e set ediliyor
        GWD.threadBrowserName.set(browserTipi); // Bu satır her testin farklı thread için tarayıcı adını ayarlayacak
    }
}

