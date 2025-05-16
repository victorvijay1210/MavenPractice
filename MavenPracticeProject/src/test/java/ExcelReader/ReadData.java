package ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	

	public static String readData(String path) throws FileNotFoundException {
		
File file = new File(path);
FileInputStream fips = new FileInputStream(file);
XSSFWorkbook workbook ;
StringBuilder sb = new StringBuilder();
try {
	 workbook = new XSSFWorkbook(fips);
    XSSFSheet workbookSheet=	workbook.getSheetAt(0);    
  int dataSize=  workbookSheet.getLastRowNum();
  workbook.close();
  for(int i=1; i<=dataSize;i++) {
	String  values=  workbookSheet.getRow(i).getCell(0).getStringCellValue(); 
	  sb.append(values);
	  sb.append("||ß");
	  }
  

	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return sb.toString();

		
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(readData("/Users/vijay/Desktop/Projects/MavenPractice/MavenPracticeProject/Excel_Sheet/TestData_Sheet.xlsx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
