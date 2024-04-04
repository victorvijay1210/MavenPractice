package Excel_data_driven_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataread {

	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook wb;
		try {
			File fis = new File("C:\\Users\\hp\\eclipse-workspace\\MavenPractice\\MavenPracticeProject\\Excel_Sheet\\TestData_Sheet.xlsx");

			FileInputStream fo = new FileInputStream(fis);
			
			wb = new  XSSFWorkbook(fo);
			
  XSSFSheet xs=	wb.getSheetAt(0);
  int lastrowno= xs.getLastRowNum();
  
  System.out.println(lastrowno);
  wb.close();

  
  for(int i=0; i<lastrowno; i++) {
			  
			String data=  xs.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(data);
  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
 	}

}