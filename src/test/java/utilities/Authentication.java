package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static void main(String[] args) {
        System.out.println(generateToken("team94admin","Batch44+"));

    }


    public static String generateToken(String username, String password) {

        Map <String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password",password);
        map.put("rememberme","true");

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response1 = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response1.jsonPath();

        return token.getString("id_token");
    }
}
