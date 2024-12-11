package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class _26_HOOKS {
    @After
    public void after(Scenario senaryo)
    {
        GWD.quitDriver();
    }
}
