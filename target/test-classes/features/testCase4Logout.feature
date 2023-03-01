Feature: Automation practice test case 4 logout functionality
  User Story:
  As a user,  when I navigate Automation Exercise page I should be able to see
  that home page is displayed.

  As a user, when I click 'Signup / Login button', I should be able to see 'Login to
  your account' is displayed

  As a user, when I enter correct email address and password and click 'login' button,
  I should be able to see  'Logged in as username' is visible

  As a user, when I click  'Logout' button, I am navigated back to login page.



  @testcase4
  Scenario: Home page display verification
    When  user navigates to Automation Exercise page
    Then  user should see that home page is displayed

  @testcase4
  Scenario: Login to your account message verification
    When user clicks Signup  Login button,
    Then user should see Login to your account is displayed

  @testcase4
  Scenario: Logged in as username verification
    When  user enters correct email and password
    Then user should see Logged in as username is displayed

  @testcase4
  Scenario: Navigate back to login page verification
    When user clicks to logout button
    Then user is navigated back to login page


