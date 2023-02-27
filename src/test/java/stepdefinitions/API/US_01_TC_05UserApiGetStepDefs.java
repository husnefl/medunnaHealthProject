package stepdefinitions.API;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.MedunnaUsersPojo;
import utilities.Driver;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_01_TC_05UserApiGetStepDefs {






        Response response;
        MedunnaUsersPojo expectedData;

        Faker faker = new Faker();
        String url;

        RequestSpecification spec;




        @Given("user set the url {string}")
        public void userSetTheUrl(String URL) {

            url=URL;
            // String url="https://medunna.com/api/user?ssn=481-15-3553";
            //MedunnaBaseUrl.medunnaSetUp();
            // spec.pathParams("first","api","second","users", "third", "481-15-3553");



        }


        @Given("Call the Pojo to create expected data")
        public void call_the_pojo_to_create_expected_data() {

            expectedData=new MedunnaUsersPojo("doctorcruise","Tom","Cruise","481-15-3553","cruise@gmail.com","Tom20");
            // System.out.println("expectedData =  "+expectedData);
        }
        @Given("sends a get-request to get all registrant data")
        public void sends_a_get_request_to_get_all_registrants_data() {

            response = given().headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
                    when().get(url);
            response.prettyPrint();


        }
        @Then("HTTP Status Code should be {int}")
        public void httpStatusCodeShouldBe(int status) {

            Assert.assertEquals(status,response.statusCode());
        }


        @Then("Verify response content type is {string}")
        public void verifyResponseContentTypeIs(String contenttype) {
            assertEquals(contenttype,   response.contentType());

        }

        @Then("Verify expected values and actual values should be same")
        public void verifyExpectedValueAndActualValueShouldBeSame() {
            MedunnaUsersPojo actualData = response.as(MedunnaUsersPojo.class);
            System.out.println("actualData  =  " + actualData);

            assertEquals(expectedData.getLogin(),actualData.getLogin());
            assertEquals(expectedData.getFirstName(),actualData.getFirstName());
            assertEquals(expectedData.getLastName(),actualData.getLastName());
            assertEquals(expectedData.getSsn(),actualData.getSsn());
            assertEquals(expectedData.getEmail(),actualData.getEmail());

        }


        @Then("close the application")
        public void closeTheApplication() {
            Driver.closeDriver();

        }






}