

Feature: Profile Feature Management

  Scenario: User updates the profile picture and theme
    When the user clicks on the Profile icon
    And the user clicks on the Settings option
    Then the user should see the Profile Picture
    When the user clicks on the Upload button
    And the user clicks on the Default Theme option
    And the user selects a Theme from the options
    Then the user clicks on the Save button
    Then the success message should be displayed