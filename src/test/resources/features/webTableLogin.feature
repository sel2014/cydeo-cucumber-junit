Feature: User should be able to login with correct credentials

  Scenario: Positive login scenario
    Given  user is on the login page of the app
    When  user enters  "username"
    And  user enters "password"
    And  user clicks to login button
    Then user should see url contains orders
