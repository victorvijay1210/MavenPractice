package PropertyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	
	
	public static String readProFile(String path, String key) throws FileNotFoundException {
		
		File file = new File(path);
		FileInputStream fis= new FileInputStream(file);
		
		Properties pro = new Properties();
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pro.getProperty(key);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(readProFile("/Users/vijay/Desktop/Projects/MavenPractice/MavenPracticeProject/src/test/java/PropertyFiles/Demo.properties", "Employee"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
