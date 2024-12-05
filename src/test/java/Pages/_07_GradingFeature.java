package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _07_GradingFeature extends Parent {

    public _07_GradingFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
