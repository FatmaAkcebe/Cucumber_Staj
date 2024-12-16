Feature: Profile

  Background:
    Given Navigate to Campus Website

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

  Scenario: Profile Settings and Image Upload
    When the student clicks on the "Profile > Settings" link
    When the student clicks on the button profile picture
    And the student selects the file
    When the student click on the button uploud
    When the student click on the button send
    Then the student should see a "successfully" message.

