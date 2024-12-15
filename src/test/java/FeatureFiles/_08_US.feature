Feature: Hamburger Menu Finance Access
  As a student
  I want to access the Finance section from the Hamburger Menu
  So that I can make my payments online more conveniently

  Background:
    Given Navigate to Campus Website

  Scenario: Login
    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

  Scenario: Student clicks on Finance link in the Hamburger Menu
    When the student opens the Hamburger Menu
    And the student clicks on the "Finance" link
    Then the student should be redirected to the Finance page

  Scenario: Finance page is displayed correctly
    Given the student has clicked on the "Finance" link in the Hamburger Menu
    Then the Finance page should be displayed
    And the Finance page title should be "Finance"