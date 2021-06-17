package ExcelTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadExcelData {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) throws Exception {
		
		InputStream input = new FileInputStream("C:\\Users\\sushils\\eclipse-workspace\\Test1\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		
		TaskExel excel = new TaskExel(prop.getProperty("exelurl"));
		
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
		
		System.out.println(excel.getData(0, 1, 0));
		System.out.println(excel.getData(0, 1, 1));
	}	
	
}
