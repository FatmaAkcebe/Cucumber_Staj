package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _01_LoginPage extends Parent {

    public _01_LoginPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
