@register
Feature: User should able to register successfully,
  so that he can use all user feature from our website
  Scenario: User should able to register
    Given user is on register page
    When user enter all registration details
    Then user should able to register successfully