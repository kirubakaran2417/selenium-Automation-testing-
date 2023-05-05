package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandling {

	public static String[][] datahandling(String sheetname) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\Workspaces\\Techforum5\\POMdemo\\testdata\\testdata.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetname);
		int rowcount=sheet.getPhysicalNumberOfRows();
		Row row=sheet.getRow(0);
		int colcount=row.getPhysicalNumberOfCells();
		String testdata[][]=new String [rowcount][colcount];
		DataFormatter formatter=new DataFormatter();
		for (int i = 0; i < rowcount; i++) {
			for(int j=0;j<colcount;j++) {
				testdata[i][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return testdata;
	}
}
