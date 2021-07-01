package RestTest;

import org.objectweb.asm.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;

import SD.SeDeSe;
import io.restassured.RestAssured;

public class DO {

	
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	public static void main(String[] args) {
		
	
		
		String url = "http://localhost:3000/BPost/4";
		
		SeDeSe se4 = RestAssured.given().get(url).as(SeDeSe.class);
		
		System.out.println("return objecy 4"+se4.toString());
		
		String url2 = "http://localhost:3000/BPost";
		
		//Deserialization
		
//		Type type = new TypeReference<List<SeDeSe>>() {}.getType();
//		List<SeDeSe> bpost = RestAssured.get(url2).as(type);
//		
//		System.out.println("return objecy 4"+bpost.toString());
		
		SeDeSe se2[] = RestAssured.given().get(url2).as(SeDeSe[].class);
		System.out.println("all post "+se2.toString());
		
		
	}
}
