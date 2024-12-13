Feature: Login Feature

  Background:
    Given Navigate to Campus Website

  Scenario: Login

    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

   When Click on the Element in homePage
       | logo |
   Then The page URL should be correct after clicking on the logo






