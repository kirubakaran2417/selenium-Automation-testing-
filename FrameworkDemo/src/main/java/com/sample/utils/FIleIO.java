package com.sample.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FIleIO {
private static Properties prop;
	

	/************** Get properties file ****************/
	public static Properties initProperties() {
		if (prop == null) {
			prop = new Properties();
			try {
				//D:\Workspaces\Techforum5\FrameworkDemo\src\test\resources\objectrepository\config.properties
				FileInputStream file = new FileInputStream(
						System.getProperty("user.dir")
								+ "/src/test/resources/objectrepository/config.properties");
				prop.load(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return prop;
	}
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
