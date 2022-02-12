package org.fileoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {

	static void readingadatafromPropertyFile() {
		File f = new File("./Elakkiya/folder1/config.properties");
		FileReader r;
		try {
			r = new FileReader(f);
			// need to use what format i want the 0 and 1 to be read
			Properties p = new  Properties();
			// convert the 0 and 1 to properties 
			p.load(r);
			// to read a data from propertyfile
			String property = p.getProperty("elakkiya");
			System.out.println(property);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void writeDataInProperty() throws IOException {
		File f = new File("./testdata.properties");
		
		Properties p= new Properties();
		p.setProperty("shahul", "hameed");
		p.setProperty("elakkiya", "selvam");
		p.setProperty("Gani", "Zaheer");
		
		//FileWriter
		FileOutputStream fo = new FileOutputStream(f);
		p.store(fo, "Firstdata");
		p.store(fo, "comment");
		p.store(fo, "commentsdf");
		
	}
	
	
	public static String getPropertyData(String path,String key) {
		File f = new File(path);
		FileReader r;
		String property = null;
		try {
			r = new FileReader(f);
			// need to use what format i want the 0 and 1 to be read
			Properties p = new  Properties();
			// convert the 0 and 1 to properties 
			p.load(r);
			// to read a data from propertyfile
			property = p.getProperty(key);
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return property;
	}
	
	
	public static void main(String[] args) throws IOException {
		writeDataInProperty();
	}
	
}
