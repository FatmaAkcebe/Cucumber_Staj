package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _02_HomePage extends Parent {

    public _02_HomePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


}
