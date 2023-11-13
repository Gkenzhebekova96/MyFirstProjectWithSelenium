Feature:OrangeHRM login and log out feature verifications

  @positiveLoginOHRM
  Scenario Outline: As a admin user I should be able to login using authenticated test data
    When User is on OrangeHRM login page
    And User enters correct  username2
    And User enters correct password
    And User clicks to login button

    Examples:
    |   password      |
    # hello changes

