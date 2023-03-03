@MedunnaApiGetTest
Feature:Api_Feature

  @Api
  @GetRegistrantRequirement
<<<<<<< HEAD
  Scenario:US_TC05_GetRequest
      Given users set the url "https://medunna.com/api/user?ssn=481-15-3553"
      And Call the Pojos to create expected data
      And user sends a request to get all registrant data
      Then HTTP status code should be 200
      Then  Verify Response Contenttype is "application/json"
      Then Verify expected values , actual values should be same
      Then close the application1
=======
  Scenario:US_TC05_Get_Request
      Given user set the url "https://medunna.com/api/user?ssn=481-15-3553"
      And Call the Pojo to create expected data
      And sends a get-request to get all registrant data
      Then HTTP Status Code should be 200
      Then  Verify response content type is "application/json"
      Then Verify expected values and actual values should be same
      Then close the applicationmb
>>>>>>> 13069ee32ed1b28d4559dbb944287b0831c9a5ca








