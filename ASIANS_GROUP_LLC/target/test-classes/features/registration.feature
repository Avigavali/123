@Registration
Feature: Registration feature
  @RegistrationHappyPath
  Scenario: Register new user
    Given I open login URL  in the  browser
    And I navigate to Register web element
    When I fill registration form
      |Email                          |Password       |ConformPassword|
      |avinashgavali123@gmail.com     |Avi@2115       |Avi@2115       |
    And I click on register button
    Then The message should be displayed
