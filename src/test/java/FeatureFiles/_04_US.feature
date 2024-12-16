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
      | Message |
      | Inbox   |
      | Outbox  |
      | Trash   |

    When The user clicks on the "Message" button
    Then The "Courses" page should be displayed

    When The user clicks on the "Inbox" button
    Then The "Inbox" page should be displayed

    When The user clicks on the "Outbox" button
    Then The "Outbox" page should be displayed

    When The user clicks on the "Trash" button
    Then The "Trash" page should be displayed

