@US_28APIGET

Feature:Api_Feature

  @Api
  @GetMessage
  Scenario:US_TC03_Get_Request
    Given user set the urlmedunna to get request
    And get a get-request to validate messages
    Then user should validate expected value actual value