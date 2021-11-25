package Mav_Mav.Data_Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;


public class Read {
	

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\target\\Book1.xlsx");
		
		FileInputStream fis =new FileInputStream(f);
		Workbook wb =new XSSFWorkbook(fis);
		
Sheet sheetAt = wb.getSheetAt(0);

for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
	
	Row row = sheetAt.getRow(i);


	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		
		
		System.out.println(cell);
			
		}
	
}			
		}
		
				

	
		
		{
			
		}
		
		
	
}
		
	


