package stepdefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_01JdbcDataStepDefinitions {

    List<Integer> idsList = new ArrayList<>();

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {

        DBUtils.createConnection();
    }

    @Given("user gets the column {string} from table {string}")
    public void user_gets_the_column_from_table(String id, String physician) {
     //   String query = query = "SELECT  * FROM   physician where id=1318";

       String query = "SELECT "+id+"  FROM  "+physician;
       DBUtils.executeQuery(query);

    }



    @Then("user reads all the  column data")
    public void userReadsAllTheColumnData() throws SQLException {


        while (DBUtils.getResultset().next()){

            idsList.add(DBUtils.getResultset().getInt(1));   }
    }

    @Then("verify that {int} should be in physician list")
    public void verifyThatShouldBeInPhysicianList(int arg0) {
        System.out.println("idsList :"+idsList);
        Assert.assertTrue(idsList.contains(1319));
    }
}



