Feature: Verify error message when attempting to sign up with an existing email address

  Sign up with existing email address.
  As a user, when I am on the home page and when I Click on 'Signup / Login' button,
  I should be able to see  'New User Signup!' is visible. When I enter my name and
  already registered email address and click on 'Signup' button, I should see the
  error message 'Email Address already exist!' is visible.


  Scenario: Sign up with an existing email address
    Given I am on the homepage of the Automation Exercise website
    When I click on the Signup  Login button
    Then I should see the New User Signup! message
    When I enter my name and an already registered email address
    And I click the Signup button
    Then I should see the error message Email Address already exist!