package stepdefinitions.DB_StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

import static utilities.DBUtils.createConnection;


public class US_002 {

    //---------------------------------TC06-----------------------------------------
    @When("kullanici tablodan gerekli sutunu alir")
    public void kullanici_tablodan_gerekli_sutunu_alir() {
        createConnection();
        DBUtils.executeQuery("Select * from jhi_user where first_name = 'casper' ");

    }

    @Then("email dogrulamasini yapar")
    public void email_dogrulamasini_yapar() throws SQLException {
        DBUtils.getResultset().next();
        Object columnData = DBUtils.getResultset().getObject("email");
        String actualData= (String) columnData;
        String expectedData="casper@mail.com";
        Assert.assertEquals(expectedData,actualData);
        DBUtils.closeConnection();
    }

}
