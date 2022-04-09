package stepdefinitions.DB_StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class US_001 {

    //-------------------TC07----------------------------
    @Then("ssn dogrulamasini yapar")
    public void ssn_dogrulamasini_yapar() throws SQLException {
        DBUtils.getResultset().next();
        Object columnData = DBUtils.getResultset().getObject("ssn");
        String actualData= (String) columnData;
        String expectedData="356-58-9632";
        Assert.assertEquals(expectedData,actualData);
        DBUtils.closeConnection();
    }
}
