package org.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.google.common.io.Files;

public class Fileoperation {

	static void foldercreation(){
		File f = new File("./Elakkiya");
		// this check both folder and file as per path
		boolean exists = f.exists();
		if (exists) {
			System.out.println("Folder is present");
		}
		else {
			f.mkdir();
		}
	}
	
	static void foldercreations(){
		File f = new File("./Elakkiya/folder1/txtfile");
		// this check only folder 
		boolean exists = f.isDirectory();
		if (exists) {
			System.out.println("Folder is present");
		}
		else {
			f.mkdirs();
		}
	}
	
	static void filecreation() throws IOException{
		// change the extentions to create any format
		File f = new File("./Elakkiya/folder1/txtfile/file.txt");
		// this check only file 
		boolean exists = f.isFile();
		if (exists) {
			System.out.println("file is present");
		}
		else {
			System.out.println("file not present so creating it");
			f.createNewFile();
		}
	}
	
	static void Filedelete() {
		File f = new File("./Elakkiya/folder1/txtfile/file.txt");
		// while deleting folder use isDirectory() method
		// instead u can use exists()
		boolean exists = f.isFile();
		if (exists) {
			System.out.println("file is found so deleting");
			f.delete();
		}
		else {
			System.out.println("unable to find the file");
		}
	}
	
	//to find the path of the folder inside any folder
	static void pathof() {
		File f = new File("./Elakkiya/folder1");
		// exist is used to check both folder and file
		boolean exists = f.exists();
		if (exists) {
			File[] listFiles = f.listFiles();
			for (File file : listFiles) {
				System.out.println(file);
			}
		}
		
		}
	
	
	static void absolutepathofafolderrfile() {
		File f = new File("./Elakkiya/folder1");
		// exist is used to check both folder and file
		boolean exists = f.exists();
		if (exists) {
			File absoluteFile = f.getAbsoluteFile();
			System.out.println(absoluteFile);
			String absolutePath = f.getAbsolutePath();
			System.out.println(absolutePath);
		}
	}
	// to read the name of folders and files with format 
	static void namesinsideafolder() {
		File f = new File("./Elakkiya/folder1");
		// exist is used to check both folder and file
		boolean exists = f.exists();
		if (exists) {
			String[] list = f.list();
			for (String string : list) {
				System.out.println(string);
			}
		}
		}
	
	// to read a data from a txt file
	static void readadatafromTXt() throws IOException{
		File f = new File("./Elakkiya/folder1/newtew.txt");
		/*
		//FileReader
		//FileInputStream
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//String readLine = br.readLine();
		//System.out.println(readLine);
		
		String readdata;
		while ((readdata=br.readLine())!=null) {
			System.out.println(readdata);
		}
		
		List<String> readLines = FileUtils.readLines(f);
		for (String string : readLines) {
			System.out.println(string);
		}
		*/
		// to read the filedata as paragraph
		String readFileToString = FileUtils.readFileToString(f);
		System.out.println(readFileToString);
	}
	
	static void writeTxt() throws IOException {
		File f = new File("./Elakkiya/folder1/newtew.txt");
		FileUtils.write(f, "\nAm going to write new data",true);
	}
	
	static void insertdata() throws IOException {
		File f = new File("./Elakkiya/folder1/newtew.txt");
		List<String> readLines = FileUtils.readLines(f);
		readLines.add(1, "new line added");
		File f1 = new File("./Elakkiya/folder1/newtext.txt");
		FileUtils.writeLines(f1, readLines);
		
	}
	
	public static void main(String[] args) throws IOException {
		insertdata();
	}
}
