Feature: Finance
  Background:
    Given Navigate to Campus Website

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |
    Scenario: : Updating balance after successful payment

      Given The student Total FeeIs
      Given  The student Has A Balance Of
      When The student selects the course
      And The student enters the card number "4242 4242 4242 4242"
      And The student enters a random expiration date and CVV code
      And The student confirms the payment of 50
      Then The student should see the updated balance of 50