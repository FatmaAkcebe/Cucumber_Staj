package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _05_AttendanceFeature extends Parent {

    public _05_AttendanceFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
