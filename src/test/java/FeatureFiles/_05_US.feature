Feature: Messaging Through Hamburger Menu
  As a student,
  I want to send messages via the Hamburger Menu,
  So that I can directly communicate with my teachers and mentors.

  Background:
    Given the system has 11 students and 7 teachers registered
    And student names start with "Student..."
    And teacher names start with "Teacher..."
    And the user is logged in as a student

  Scenario: Student sends a message successfully
    When the user clicks on the "Hamburger Menu"
    And the user selects "Messaging > New Message"
    And the user clicks the "Add Receiver" button
    And the user selects a receiver whose name contains at least 3 characters
    And the user enters "Hello, this is a test message!" in the text editor
    And the user clicks the "Send" button
    Then the user should see a "Success" message
    And the sent message should appear in the "Outbox" list

  Scenario: Student attaches a file to the message
    When the user clicks on the "Hamburger Menu"
    And the user selects "Messaging > New Message"
    And the user clicks the "Add Receiver" button
    And the user selects a receiver whose name contains at least 3 characters
    And the user clicks the "Attach Files" button
    And the user selects a file named "assignment.pdf"
    Then the file should be attached to the message
    And the user clicks the "Send" button
    Then the user should see a "Success" message
    And the sent message with the attachment should appear in the "Outbox" list

  Scenario: Student pastes formatted text into the editor
    When the user clicks on the "Hamburger Menu"
    And the user selects "Messaging > New Message"
    And the user pastes formatted text into the editor
    Then the formatted text should retain its formatting