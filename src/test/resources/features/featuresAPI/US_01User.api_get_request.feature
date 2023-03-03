@MedunnaApiGetTest
Feature:Api_Feature

  @Api
  @GetRegistrantRequirement
  Scenario:US_TC05_GetRequest
      Given users set the url "https://medunna.com/api/user?ssn=481-15-3553"
      And Call the Pojos to create expected data
      And user sends a request to get all registrant data
      Then HTTP status code should be 200
      Then  Verify Response Contenttype is "application/json"
      Then Verify expected values , actual values should be same
      Then close the application1








