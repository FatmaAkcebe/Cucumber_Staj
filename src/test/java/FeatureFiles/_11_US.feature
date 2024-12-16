Feature: Hamburger Menu-Finance

  Background:
    Given Navigate to Campus Website

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

  Scenario: Paying the student's course debt installment
    And the user follows the link "HamburgerMenu > Finance > MyFinance"
    When the student clicks on the option
      | student fees |
    When the student clicks on the button
      | scripte |
    When the student clicks on the button
      | pay in full |
    When the student clicks on the button
      | pay |
    When the student enters the amount he will pay
      | amount | 1 |
    When the student clicks on the button twice
      | amount pay |

    When the student enters the amount he will paay
    When the student clicks on the button
      | payment |
    When clickSaveOnWindowsDialog select
    Then the student should see "successfully" message.

