Feature: Profile

  Background:
    Given Navigate to Campus Website

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

    When the student clicks on the "Profile > Settings" link

  Scenario: Student changes the theme in Profile settings
    When the student clicks on the "Default Theme" dropdown
    When the student selects a theme from the dropdown
    When the student clicks on the "Save" button
    Then the student should see a "Success" message