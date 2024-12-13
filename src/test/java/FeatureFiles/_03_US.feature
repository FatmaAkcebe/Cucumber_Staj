Feature: Top Nav Feature

  Background:
    Given Navigate to Campus Website
    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |
    And Click on the Element in Login Page
      | loginButton |
    Then Login Message Should be Displayed


  Scenario: Verify the Top Navigation buttons and their actions
    Then The user should see the following menu items:
      | Courses       |
      | Calendar      |
      | Attendance    |
      | Assignments   |
      | Grading       |
#      | HamburgerMenu |
#      | Messages      |
#      | Profile       |

    When The user clicks on the "Courses" button
    Then The "Courses" page should be displayed

    When The user clicks on the "Calendar" button
    Then The "Calendar" page should be displayed






