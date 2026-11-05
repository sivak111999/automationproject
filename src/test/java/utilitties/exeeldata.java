package utilitties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exeeldata {

	public static void getcelldata() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testdata.xlsx");

		Workbook workbook = new XSSFWorkbook(file);

		Sheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println("numberof rows"+ totalRows);
		System.out.println("numberof rows"+ totalCells);
		for(int r=0;r<totalRows;r++) {
			XSSFRow currentRow= (XSSFRow) sheet.getRow(r) ;
		
		for(int c=0;c<totalCells;c++) {
			XSSFCell cell = currentRow.getCell(c);
			System.out.println(cell.toString());
		}
		
		}
		workbook.close();
		file.close();
		
	}

}
