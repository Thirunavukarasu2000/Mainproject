package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcelFilePractice
{
	public static void main(String[] args) throws Exception
	{
//		FileInputStream fis = new FileInputStream("C:\\Users\\VISHAL\\Desktop\\Selenium sec3\\Animal.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");          //here we will pass the sheet name
////		Row r = sh.createRow(3);
////		Cell c = r.getCell(3);
////		c.setCellValue("hello");
//		
//		Row row = sh.createRow(3);
//		Cell c = row.createCell(3);
//		c.setCellValue("lotus");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\VISHAL\\Desktop\\Selenium sec3\\Animal.xlsx");
//		wb.write(fos);
		
		ExcelUtility eUtil = new ExcelUtility();
		eUtil.writeDataToExcelFile("Leads", 10, 1, "hello");
    }

}
