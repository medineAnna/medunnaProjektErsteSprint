package stepdefinitions.API_StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static org.hamcrest.Matchers.matchesPattern;
import static utilities.ApiUtils.getRequest;
import static utilities.Authentication.generateToken;

public class US_002 {

    Response response;

    //-----------------------TC02-------------------------------

    @When("kullanici pathparams ve bearer token ayarlamasini yapar")
    public void kullanici_pathparams_ve_bearer_token_ayarlamasini_yapar() {
        response=getRequest(generateToken("casper","Casper200"), ConfigReader.getProperty("medunnaAccount"));
    }

    @Then("kullanici adini dogrular")
    public void kullanici_adini_dogrular() {
        response.then().assertThat().body("login",matchesPattern("casper"));
    }


    //----------------------TC05----------------------------------
    @Then("emaili api ile dogrular")
    public void emaili_api_ile_dogrular() {
        response.then().assertThat().body("email",matchesPattern("casper@mail.com"));
    }
}
