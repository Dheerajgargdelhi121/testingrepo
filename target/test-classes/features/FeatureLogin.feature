@Social-imprints
Feature: Login

  @Social-imprints-login
  Scenario: In order to verify login
    Given user navigates to marin https://staging.dev.socialimprints.com/admin/sign_in
    When user clicks on the Sign in google
    Then user entered username "demouser1@socialimprints.com"
    And user entered password "qq11WW@@"
    Then user logged successfully
