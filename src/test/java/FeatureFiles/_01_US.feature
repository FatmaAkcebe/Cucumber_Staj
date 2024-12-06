Feature: Login Feature

  Background:
    Given Navigate to Campus Website

  Scenario: Login
    When User sending keys in Login Page
      | username | Student_5 |
      | password | S12345    |

    And Click on the Element in Login Page
      | loginButton |

    Then Login Message Should be Displayed
      | successmessage |

  Scenario: Negative Login
    When User sending keys in Login Page
      | username | Student_005 |
      | password | S12345      |

    And Click on the Element in Login Page
      | loginButton |

    Then Error Message should be Dislayed
      | errormessage |


