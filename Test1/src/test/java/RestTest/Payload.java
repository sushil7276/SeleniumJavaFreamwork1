package RestTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Payload {

	public static String body() {
		
		return "{\r\n" + 
				"	\"firstName\": \"Sushil\",\r\n" + 
				"	\"lastName\": \"Testing\"\r\n" + 
				
				"}";
	}

}
