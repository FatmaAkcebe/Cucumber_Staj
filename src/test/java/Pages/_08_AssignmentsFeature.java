package Pages;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class _08_AssignmentsFeature extends Parent {

    public _08_AssignmentsFeature() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(css = "[id='assignments-link']")
    public WebElement assignmentsLink;

    @FindBy(css = "[class='assignment-list']")
    public WebElement assignmentList;

    @FindBy(css = "[id='create-assignment']")
    public WebElement createAssignmentButton;

    @FindBy(css = "[id='assignment-title']")
    public WebElement assignmentTitleInput;

    @FindBy(css = "[id='submit-assignment']")
    public WebElement submitAssignmentButton;



    public void clickAssignmentsLink() {
        assignmentsLink.click();
    }

    public void createNewAssignment(String title) {
        createAssignmentButton.click();
        assignmentTitleInput.sendKeys(title);
        submitAssignmentButton.click();
    }
}





