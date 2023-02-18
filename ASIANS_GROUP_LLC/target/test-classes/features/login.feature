@Login
Feature: Login feature
  @LoginHappyPath
  Scenario: Login with valid credentials
    Given I open application url  in browser
    And   I enter email and password
    When  I click on login button
    Then  Login should be successful


