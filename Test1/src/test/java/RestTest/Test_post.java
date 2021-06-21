package RestTest;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_post {

	
	 
	 //post test
	@Test
	public void Test01_post() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "sushil");
		map.put("job", "Testing");
		
		System.out.println(map);
		
		JSONObject requset = new JSONObject();
		
		requset.put("name", "sushil");
		requset.put("job", "tetsing");
		
		System.out.println(requset);
		System.out.println(requset.toJSONString());
		
		given().
		header("content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
		body(requset.toJSONString())
			.when().
		post("https://reqres.in/api/users").
			then().
			statusCode(201);
		
	}
	
	//put test
	@Test
	public void TestPut() {
		
		JSONObject requset = new JSONObject();
		
		requset.put("name", "sushil");
		requset.put("job", "tetsing");
		
		System.out.println(requset);
		System.out.println(requset.toJSONString());
		
		given().
			header("content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(requset.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();
		
	}
	
	
	//patch test
	@Test
	public void testPatch() {
		
		JSONObject requset = new JSONObject();
		
		requset.put("name", "sushil");
		requset.put("job", "tetsing");
		
		System.out.println(requset);
		System.out.println(requset.toJSONString());
		
		given().
			header("content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(requset.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();
		
	}
	
	
	
	//delete test
	@Test
	public void TestDelete() {
		
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).log().all();
		
	}
	
}
