package RestTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Example {
	
	/*
	@Test
	public void Test_git() {
		
		baseURI	= "http://localhost:3000";
		
		given().
			param("name","Automation").
			get("/subjects").
		then().
			statusCode(200).log().all();
	}

	*/

	@Test
	public void test_post() {
		
//		JSONObject request = new JSONObject();
//		
//		request.put("firstName","Tom");
//		request.put("lastName", "Cooper");
//		request.put("subjectId", 1);
		
		baseURI = "http://localhost:3000/";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).header("Content-Type","application/json").
			body(Payload.body()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();
	}
	
	/*
	@Test
	public void Patch() {
		
		JSONObject request = new JSONObject();
		
		request.put("lastName", "Shapperd");
		
		baseURI = "http://localhost:3000/";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).log().all();
	}
	*/
	
//	@Test
//	public void delete() {
//		
//		baseURI = "http://localhost:3000/";
//		
//		when().
//			delete("/users/5").
//		then().
//			statusCode(200).log().all();
//
//	}
	
}
