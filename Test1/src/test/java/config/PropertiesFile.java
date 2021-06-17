package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import project.Selenium1Test;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		
		readProperties();
		writeProperties();
	}
	
	public static void readProperties() {
		
		
		try {
		
			InputStream input = new FileInputStream("C:\\Users\\sushils\\eclipse-workspace\\Test1\\src\\test\\java\\config\\config.properties");
			
			prop.load(input);
			Selenium1Test.browser = prop.getProperty("browser");
			System.out.println(Selenium1Test.browser);
			
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeProperties() {
		
		try {
		
		OutputStream output = new FileOutputStream("C:\\Users\\sushils\\eclipse-workspace\\Test1\\src\\test\\java\\config\\config.properties");
	
		prop.setProperty("browser", "Chrome");
		prop.store(output, null);
		
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
