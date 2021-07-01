package RestTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.internal.ws.processor.model.Response;

import SD.SeDeSe;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SOD {
	
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	/*
	public static void main(String[] args) throws JsonProcessingException {
		
		SeDeSe sd = new SeDeSe();
		sd.setId(4);
		sd.setTital("Thomson");
		sd.setAuthor("four");
		
		
		String url = "http://localhost:3000/BPost";
		
		String json = MAPPER.writeValueAsString(sd);
		
		Response response = RestAssured.given().contentType("application/json")
							.log().all(true).body(json).post(url).andReturn();
		
		assertEquals(response.getSatusCode(), 201);
		
	}
	*/
	
	@Test
	public void se() throws JsonProcessingException {
		
		SeDeSe sd = new SeDeSe();
		sd.setId(5);
		sd.setTital("Thomson");
		sd.setAuthor("four");
		
		
		String url = "http://localhost:3000/BPost";
		
		String json = MAPPER.writeValueAsString(sd);
		
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).header("Content-Type","application/json").
			body(json).
		when().
			post(url).
		then().
			statusCode(201).log().all();
	}
	


}
