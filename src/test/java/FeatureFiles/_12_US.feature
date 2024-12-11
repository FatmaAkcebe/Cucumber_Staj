Feature: Hamburger Menu-Finance

  Background:
    Given Navigate to Campus Website

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |


  Scenario: The checkout page should be able to access the reporting option
    And the user follows the link "HamburgerMenu > Finance > MyFinance"
    When The student clicks on the three dot dropdown button on the payment page
    When Student chooses a report format (Excel or PDF) from the three-dot drop-down menu






