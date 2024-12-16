Feature: Home Feature

  Background:
    Given Navigate to Campus Website
    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |
    And Click on the Element in Login Page
      | loginButton |
    Then Login Message Should be Displayed


  Scenario: Home Page
    And Click on the Element in Login Pages
      | Logo |

    Then Techno Study Website Should be Displayed






