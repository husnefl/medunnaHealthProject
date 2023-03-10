@US_28APIPost

Feature:Api_Feature

  @Api
  @PostMessageCreating
  Scenario:US_TC03_Post_Request
    Given user set the urlmedunna
    When Call the Pojo to create expected dataul
    And post a request to create new message
    Then user should validate creating messages
    And get a get-request to validate messages
    Then user should validate expected value actual value

