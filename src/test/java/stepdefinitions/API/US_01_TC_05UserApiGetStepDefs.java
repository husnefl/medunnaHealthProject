package stepdefinitions.API;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US_01MedunnaUsersPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_01_TC_05UserApiGetStepDefs {


        Response response;
        US_01MedunnaUsersPojo expectedData;

        Faker faker = new Faker();
        String url;

        RequestSpecification spec;


        @Given("users set the url {string}")
        public void userSetTheUrl(String URL) {
           url=URL;
    }


        @Given("Call the Pojos to create expected data")
        public void call_the_pojo_to_create_expected_data() {

            expectedData=new US_01MedunnaUsersPojo("doctorcruise","Tom","Cruise","481-15-3553","cruise@gmail.com","Tom20");
            // System.out.println("expectedData =  "+expectedData);
        }


    @And("user sends a request to get all registrant data")
    public void userSendsARequestToGetAllUsersRegistrantData() {


            response = given().headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
                    when().get(url);
            response.prettyPrint();

        }
        @Then("HTTP status code should be {int}")
        public void httpStatusCodeShouldBe(int status) {

            Assert.assertEquals(status,response.statusCode());
        }

        @Then("Verify Response Contenttype is {string}")
        public void verifyResponseContentTypeIs(String contenttype) {
            assertEquals(contenttype,   response.contentType());

        }

        @Then("Verify expected values , actual values should be same")
        public void verifyExpectedValueAndActualValueShouldBeSame() {
            US_01MedunnaUsersPojo actualData = response.as(US_01MedunnaUsersPojo.class);
            System.out.println("actualData  =  " + actualData);

            assertEquals(expectedData.getLogin(),actualData.getLogin());
            assertEquals(expectedData.getFirstName(),actualData.getFirstName());
            assertEquals(expectedData.getLastName(),actualData.getLastName());
            assertEquals(expectedData.getSsn(),actualData.getSsn());
            assertEquals(expectedData.getEmail(),actualData.getEmail());

        }
<<<<<<< HEAD
=======
        @Then("close the applicationmb")
        public void closeTheApplicationmb() {
            Driver.closeDriver();
>>>>>>> 13069ee32ed1b28d4559dbb944287b0831c9a5ca




}
