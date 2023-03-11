package stepdefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_28APIpojo;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_28ApiPostStepDef {

    US_28APIpojo actualData;
   Response response;
    US_28APIpojo expectedData;



    //https://medunna.com/api/c-messages
    @Given("user set the urlmedunna")
    public void userSetTheUrlmedunna() {
        spec.pathParams("first","api","second","c-messages");
    }

    @Given("Call the Pojo to create expected dataul")
    public void call_the_pojo_to_create_expected_dataul() {
    expectedData=new US_28APIpojo("Hasan","hasan@gmail.com","hello","how are you");
    }

    @And("post a request to create new message")
    public void postARequestToCreateNewMessage() {
        response=given().spec(spec).headers("Authorization","Bearer " + generateToken(),"Content-Type",
                ContentType.JSON,"Accept", ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();
    }
    @Given("user should validate creating messages")
    public void user_should_validate_creating_messages() {


        actualData = response.as(US_28APIpojo.class);

        assertEquals(expectedData.getName(),actualData.getName());
        assertEquals(expectedData.getEmail(),actualData.getEmail());
        assertEquals(expectedData.getSubject(),actualData.getSubject());
        assertEquals(expectedData.getMessage(),actualData.getMessage());

    }
}
