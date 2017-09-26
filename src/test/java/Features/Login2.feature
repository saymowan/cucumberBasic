Feature: LoginFeature
  This feature deals with a login functionality to the app

  Scenario: Login with a correct username and password
    Given I navigate to the login page
    And I enter the username as "admin" and password as "adminpassword"
    And I click login button
    Then I should see the userform page