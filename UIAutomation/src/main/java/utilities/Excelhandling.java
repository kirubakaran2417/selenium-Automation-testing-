package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandling {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\Workspaces\\Techforum5\\POMdemo\\testdata\\testdata.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		System.out.println(sheet.getRow(0).getCell(0));
		
	}
}
