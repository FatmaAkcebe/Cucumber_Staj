package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _09_CalendarFeature extends Parent {

    public _09_CalendarFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
