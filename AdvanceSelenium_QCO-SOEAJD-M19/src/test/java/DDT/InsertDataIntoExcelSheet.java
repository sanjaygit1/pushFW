package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataIntoExcelSheet {

	public static void main(String[] args) throws Throwable {

		//Step1:-get the connection of physical file
	     FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\TestData7am.xlsx");
		
	     //step2:- open workbook in read mode
	    Workbook book = WorkbookFactory.create(fis);
		
	    //step3:-get control of the Sheet
	    Sheet sheet = book.getSheet("Sheet1");
		
	    //step4:-get control of the row
	    Row row = sheet.createRow(3);
		
	    //step5:-get control of the cell
	    Cell cel = row.createCell(3);
	    
	    cel.setCellValue("Shobha");
	    
	    FileOutputStream fes = new FileOutputStream("C:\\Users\\Shobha\\Downloads\\TestData7am.xlsx");
	    book.write(fes);
	    book.close();

	}

}
