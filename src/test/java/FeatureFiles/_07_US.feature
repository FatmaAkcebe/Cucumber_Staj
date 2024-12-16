


Feature: Messaging Trash Management
  As a student
  I want to view, restore, and permanently delete messages in the trash
  So that I can manage my deleted messages effectively when needed

  Background:
    Given Navigate to Campus Website

  Scenario: Login
    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |


  Scenario: Viewing deleted messages in Trash
    When the student navigates to the Trash link in the Messaging section
    Then the student should see the list of deleted messages


  Scenario: Deleting a message permanently
    Given the student navigates to the Trash link in the Messaging section
    When the student sees the Delete icon for a message and clicks on it
    Then a confirmation window should appear when the student clicks the Delete icon for permanent deletion
    And a Success message should appear after confirming permanent deletion


  Scenario: Restoring a deleted message
    Given the student navigates to the Trash link in the Messaging section
    When the student sees the Restore icon for a message and clicks on it
    Then a Success message should appear after restoring the message