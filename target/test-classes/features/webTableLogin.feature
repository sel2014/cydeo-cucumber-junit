Feature: User should be able to login with correct credentials

  @wip
  Scenario: Positive login scenario
    Given  user is on the login page of the app
    When  user enters  username "Test"
    And  user enters password "Tester"
    And  user clicks to login button
    Then user should see url contains orders
