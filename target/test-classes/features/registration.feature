Feature: Registration feature

  @first
  Scenario: User should able to register successfully.

    Given user is on homepage
    When user click on register button
    And user enter all registration details
    And user click on register-submit button
    Then user should able to register successfully