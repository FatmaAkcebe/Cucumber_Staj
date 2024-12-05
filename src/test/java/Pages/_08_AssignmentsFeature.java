package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _08_AssignmentsFeature extends Parent {

    public _08_AssignmentsFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
