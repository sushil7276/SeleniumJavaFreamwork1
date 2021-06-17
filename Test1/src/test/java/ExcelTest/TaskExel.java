package ExcelTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TaskExel {
	
	HSSFWorkbook wb;
	HSSFSheet sheet1;
	
	public TaskExel(String excelPath) {
		
		try {
		
			File src = new File(excelPath);
			FileInputStream input = new FileInputStream(src);
			
			wb = new HSSFWorkbook(input);
			
			
		
		}
		catch (Exception e) {
		
			System.out.println(e.getMessage());
		
		}
		
	}
	
	public String getData(int sNo, int row, int column) {
		
		sheet1 = wb.getSheetAt(sNo);
		
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}

	public int getRowCount(int si) {
		
		int row = wb.getSheetAt(si).getLastRowNum();
		
		row = row + 1;
		
		return row;
	}
}
