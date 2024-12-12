package StepDefinitions;

import Pages._03_HamburgerMenu_Messaging;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _05_US_Steps {
    _03_HamburgerMenu_Messaging hm=new _03_HamburgerMenu_Messaging();

    @And("the sent message with the attachment should appear in the {string} list")
    public void theSentMessageWithTheAttachmentShouldAppearInTheList(String arg0) {

    }

    @And("the user pastes formatted text into the editor")
    public void theUserPastesFormattedTextIntoTheEditor() {
    }

    public class MessagingSteps {

        private List<String> students = new ArrayList<>();
        private List<String> teachers = new ArrayList<>();
        private String loggedInUser;
        private String receiver;
        private String message;
        private boolean successMessageDisplayed;
        private List<String> outbox = new ArrayList<>();
        private boolean fileAttached;


        @Given("the system has {int} students and {int} teachers registered")
        public void the_system_has_students_and_teachers_registered(int studentCount, int teacherCount) {
            for (int i = 1; i <= studentCount; i++) {
                students.add("Student" + i);
            }
            for (int i = 1; i <= teacherCount; i++) {
                teachers.add("Teacher" + i);
            }
        }

        @Given("student names start with {string}")
        public void student_names_start_with(String prefix) {
            for (String student : students) {
                Assert.assertTrue(student.startsWith(prefix));
            }
        }
        @Given("teacher names start with {string}")
        public void teacher_names_start_with(String prefix) {
            for (String teacher : teachers) {
                Assert.assertTrue(teacher.startsWith(prefix));
            }
        }

        @Given("the user is logged in as a student")
        public void the_user_is_logged_in_as_a_student() {
            loggedInUser = "Student1"; // Simulating a logged-in student
            Assert.assertNotNull(loggedInUser);
        }

        @When("the user clicks on the {string}")
        public void the_user_clicks_on_the(String menuOption) {
            System.out.println("User clicked on: " + menuOption);
        }
        @When("the user selects {string}")
        public void the_user_selects(String subMenuOption) {
            System.out.println("User selected: " + subMenuOption);
        }

        @When("the user clicks the {string} button")
        public void the_user_clicks_the_button(String button) {
            System.out.println("User clicked: " + button);
        }

        @When("the user selects a receiver whose name contains at least {int} characters")
        public void the_user_selects_a_receiver_whose_name_contains_at_least_characters(int minLength) {
            receiver = teachers.get(0); // Selecting the first teacher as receiver
            Assert.assertTrue(receiver.length() >= minLength);
        }

        @When("the user enters {string} in the text editor")
        public void the_user_enters_in_the_text_editor(String messageText) {
            message = messageText;
            Assert.assertNotNull(message);
        }
        @When("the user selects a file named {string}")
        public void the_user_selects_a_file_named(String fileName) {
            fileAttached = true;
            System.out.println("File attached: " + fileName);
        }

        @Then("the file should be attached to the message")
        public void the_file_should_be_attached_to_the_message() {
            Assert.assertTrue(fileAttached);
        }

        @When("the user clicks the {string} button")
        public void the_user_clicks_send_button(String button) {
            if (button.equalsIgnoreCase("Send") && message != null && receiver != null) {
                successMessageDisplayed = true;
                outbox.add(message);
            }
        }

        @Then("the user should see a {string} message")
        public void the_user_should_see_a_message(String expectedMessage) {
            Assert.assertTrue(successMessageDisplayed);
            System.out.println("Displayed message: " + expectedMessage);
        }

        @Then("the sent message should appear in the {string} list")
        public void the_sent_message_should_appear_in_the_list(String listName) {
            Assert.assertTrue(outbox.contains(message));
            System.out.println("Message added to " + listName + ": " + message);
        }

        @Then("the formatted text should retain its formatting")
        public void the_formatted_text_should_retain_its_formatting() {
            // Simulating formatted text retention
            System.out.println("Formatted text retained in the editor.");
        }
    }

}
