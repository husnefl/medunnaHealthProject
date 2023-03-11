@US29_DB_Testing
Feature:DB_Country_Validation
  Scenario: TC_06 Verify Country information
    Given user connects to the databaseYA
    When user sends the query to getYA "name" column from "country" table
    #And user getYA all column data
    Then user verifyYA in "country" table "name" column contains "Belgium"
    #Then user verifyYA in "country" table "id" column contains "7787"
    Then close the connectionYA