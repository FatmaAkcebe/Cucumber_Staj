package StepDefinitions;

import Pages._01_LoginPage;
import Pages._02_HomePage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _02_US_Steps {

    _02_HomePage hp=new _02_HomePage();

    @Then("Techno Study Website Should be Displayed")
    public void technoStudyWebsiteShouldBeDisplayed() {
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(),"https://techno.study/");

    }



}
