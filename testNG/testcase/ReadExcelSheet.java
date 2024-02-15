package testNG.testcase;

import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static String[][] readExcel(String filename) throws IOException {
		// TODO Auto-generated method stub
		//Step:1 Identify the workbook/excel book -->set the path for the workbook
        //Create a folder under project  -->rightclick -->new-->folder-->data-->paste the excelfile under the folder
        XSSFWorkbook book=new XSSFWorkbook("./Data/" +filename+".xlsx");
        
        //step:2 Identify the sheet in the book 
        XSSFSheet sheet = book.getSheetAt(0); //index starts with zero --.represent Sheet1
        //book.getSheet("CL");//sheet name
    
        XSSFRow row = sheet.getRow(1);
        
    //To get the rowSize--> number of rows in the excel sheet
        
        int rowCount = sheet.getLastRowNum();
        System.out.println(rowCount);
        
        int columnCount = row.getLastCellNum();
        String [][] data = new String[rowCount][columnCount];
        for (int i = 1; i <=rowCount; i++) {
        	for (int j = 0; j < columnCount; j++) {
        	String value =	sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}
			
		}
book.close();
return data;
	}

	

}
