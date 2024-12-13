Feature: Hamburger Menu Feature

  Background:
    Given Navigate to Campus Website
    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |
    And Click on the Element in Login Page
      | loginButton |
    Then Login Message Should be Displayed

  Scenario: Managing the Messaging link
    When Click on the Element in Hamburger Menu
      | HamburgerMenu |
    And Hover over the "Messaging" link in he Hamburger Menu
    Then The following options should be visible
      | sendMessage |
      | inbox       |
      | outbox      |
      | trash       |
