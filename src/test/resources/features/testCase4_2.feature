Feature: Login functionality

  @case4
  Scenario: Login and Logout
    Given I am on the home page
    When I click on Signup  Login button
    Then I should see Login to your account page
    When I enter my email and password
    And I click on login button
    Then I should see Logged in as username message
    When I click on Logout button
    Then I should see the "Login to your account page