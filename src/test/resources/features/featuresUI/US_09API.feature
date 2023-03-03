@passwordconfirmation
  Feature: password confirmation
  Scenario: TC_09_Get_Request
    Given user sends GET request to the "//https://medunna.com/api/users"

    Then HTTP Status Code should be 200

