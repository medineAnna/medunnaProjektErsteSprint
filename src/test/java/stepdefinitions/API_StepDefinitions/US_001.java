package stepdefinitions.API_StepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojo.Registrant;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantApiData;

public class US_001 {

    Registrant registrant = new Registrant();
    Faker faker = new Faker();
    Response response;
    RequestSpecification spec;

    @When("kullanici pathparams ayarlamasini yapar")
    public void kullanici_pathparams_ayarlamasini_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "user","third","ssn=356-58-9632");
        /*
        *
        *  {
    "id": 44173,
    "login": "casper",
    "firstName": "casper",
    "lastName": "casper",
    "ssn": "356-58-9632",
    "email": "casper@mail.com"}
    *
    * */
    }

    @Then("accountlarin bilgilerini alir")
    public void accountlarin_bilgilerini_alir() {

        response = given().spec(spec).contentType(ContentType.JSON)
                .header("Authorization","Bearer "+generateToken("team94admin","Batch44+"))
                .when()
                .get("/{first}/{second}/"+"?"+"{third}");
        System.out.println(response.asString());
    }

    @Then("alinan bilgilerin dogrulamasini yapar")
    public void alinan_bilgilerin_dogrulamasini_yapar() {
        response.then().assertThat().statusCode(200);
        HashMap<String,Object> expectedData= new HashMap<>();
        expectedData.put("id","44173");
        expectedData.put("login","casper");
        expectedData.put("firstName","casper");
        expectedData.put("lastName","casper");
        expectedData.put("ssn","356-58-9632");
        expectedData.put("email","casper@mail.com");

        Map<String,Object> actualData= response.as(HashMap.class);

        Assert.assertEquals(expectedData.get("id"),actualData.get("id").toString());
        Assert.assertEquals(expectedData.get("login"),actualData.get("login"));
        Assert.assertEquals(expectedData.get("firstName"),actualData.get("firstName"));
        Assert.assertEquals(expectedData.get("lastName"),actualData.get("lastName"));
        Assert.assertEquals(expectedData.get("ssn"),actualData.get("ssn"));
        Assert.assertEquals(expectedData.get("email"),actualData.get("email"));





    }

   // --------------------//tc06-----------------------------------------//

    @When("kullanici gerekli path params ayarlar")
    public void kullanici_gerekli_path_params_ayarlar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "register");
    }

    @Then("expected datalari girer")
    public void expected_datalari_girer() {
    String    firstname = faker.name().firstName();
    String    lastname = faker.name().lastName();
    String    ssn = faker.idNumber().ssnValid();
    String    email = faker.internet().emailAddress();
    String    username = faker.name().username();
    String    password = faker.internet().password(8,10,true, true);
    String    langkey="Eng";
    
        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);
        registrant.setSsn(ssn);
        registrant.setEmail(email);
        registrant.setLogin(username);
        registrant.setPassword(password);
        registrant.setLangKey(langkey);
    }

    @Then("kullanici request gonderir ve response alir")
    public void kullanici_request_gonderir_ve_response_alir() {
        response = given().spec(spec).contentType(ContentType.JSON)
                .body(registrant)
                .when()
                .post("/{first}/{second}");
    }

    @Then("kullamici api kayitlarini dosyaya kaydeder")
    public void kullamici_api_kayitlarini_dosyaya_kaydeder() {
        saveRegistrantApiData(registrant);
    }

    @Then("kullanici api kayitlarini dogrular")
    public void kullanici_api_kayitlarini_dogrular() throws JsonProcessingException {
        response.then().statusCode(201);
        response.prettyPrint();

        ObjectMapper obj = new ObjectMapper();

        Registrant actualRegistrant = obj.readValue(response.asString(), Registrant.class);

        System.out.println("Actual Data: " + actualRegistrant);

        Assert.assertEquals(registrant.getFirstName(), actualRegistrant.getFirstName());
        Assert.assertEquals(registrant.getLastName(), actualRegistrant.getLastName());
        Assert.assertEquals(registrant.getSsn(), actualRegistrant.getSsn());
        Assert.assertEquals(registrant.getEmail(), actualRegistrant.getEmail());
        Assert.assertEquals(registrant.getLogin(), actualRegistrant.getLogin());
    }


}
