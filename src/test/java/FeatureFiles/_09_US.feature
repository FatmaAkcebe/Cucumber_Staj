Feature: Hamburger Menu/Finance


  Background:
    Given Navigate to Campus Website

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

  Scenario: The Student sees the installment details on the finance page

    When The student click on the "Finance" link in the Hamburger menu
    And The student click on my name to view my payment details
    Then The student should be redirected to the payment page
    And The student should see the "Fee/Balance Detail" button
    When The student click on the "Fee/Balance Detail" button
    Then The student should see the installment details table




