Feature: Attendance Feature

  Background:
    Given Navigate to Campus Website

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

  Scenario:  Reporting an attendance excuse

    When the student click on the button
      | Attandance |
    When the student click on the buttonn
    When the student click on the buttonnnn
    When the student select a day
    When the student writes a message in the message field
    When the student attaches a file from local
    And the student select the file
    When the student click on the send button

