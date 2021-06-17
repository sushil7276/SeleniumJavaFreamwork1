package ExcelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead {

	static Properties prop = new Properties();
	private static HSSFWorkbook wb;
	
	public static void main(String[] args) throws Exception {
		InputStream input = new FileInputStream("C:\\Users\\sushils\\eclipse-workspace\\Test1\\src\\test\\java\\config\\config.properties");
		prop.load(input);
	
		File file = new File(prop.getProperty("exelurl"));
		FileInputStream input1 = new FileInputStream(file);
		
		wb = new HSSFWorkbook(input1);
		
		HSSFSheet sheet1 = wb.getSheetAt(0);
		
//		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("Data from Excel is "+data0);
//		
//		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
//		System.out.println("Data from Excel is "+data1);
		
		int rowCount = sheet1.getLastRowNum();
//		System.out.println("total row is "+rowCount);
		int column = sheet1.getRow(1).getLastCellNum();
//		System.out.println("total colum is "+column);
		
		for(int r=0; r<rowCount; r++) {
		
			HSSFRow row = sheet1.getRow(r);
			
			for(int c=0; c<column; c++) {
				
				HSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType()) {
				
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				
				}
				System.out.print(" | ");
			}
			System.out.println();
			
		}
		
	}
	
}
