package org.fileoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonREader {
	// reausbale methods
		//.json
		/*
		 * 1. json is mainly works on JSONObject & JSONArray
		 * 2.  JSONObject & JSONArray works based on
		 * key and value
		 * 
		 * Jsonobject- {} - key and value
		 * jsonArray- [] - it works as a list, inside it will store
		 *         list of jsonobjects
		 * {- convert that to JSONObject
		 * [- convert it to JSONArray
		 * :[- convert the value to jsonArray 
		 * :" - convert it to string
		 */
		
		/*
		 * 1.jsonParser
		 * <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
	<dependency>
	    <groupId>com.googlecode.json-simple</groupId>
	    <artifactId>json-simple</artifactId>
	    <version>1.1.1</version>
	</dependency>

		 * 2.GSON
		 * 3.jsonpath
		 */
	
	static void readJsondata() throws IOException, ParseException {
		File f = new File("./elakkiyaselenium.json");
		
		FileReader fr = new FileReader(f);
		
		//String s = "{\"name\":\"alyt\"}";
		JSONParser parse = new JSONParser();
		Object parse2 = parse.parse(fr);
		JSONObject obj= (JSONObject)parse2;
		Object object = obj.get("name");
		String name =(String)object;
		System.out.println(name);
		
		JSONArray studentslist=(JSONArray)obj.get("students");
		for (int i = 0; i < studentslist.size(); i++) {
			JSONObject studentlist= (JSONObject)studentslist.get(i);
			String studentname = studentlist.get("name").toString();
			String studentEducation = studentlist.get("education").toString();
			System.out.println(studentname +" : "+studentEducation);
		}
	
	}
	
	static void writeJson() throws IOException {
		File f = new File("./elakkiyaselenium1.json");
		
		JSONObject obj = new JSONObject();
		obj.put("instituteName", "alyt");
		
		JSONArray studentlist= new JSONArray();
		JSONObject student1 = new JSONObject();
		student1.put("name", "gani");
		student1.put("education", "bca");
		JSONObject student2 = new JSONObject();
		student2.put("name", "gani");
		student2.put("education", "bca");
		JSONObject student3 = new JSONObject();
		student3.put("name", "gani");
		student3.put("education", "bca");
		
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		
		obj.put("students", studentlist);
		
		
		FileWriter fw= new FileWriter(f);
		fw.write(obj.toJSONString());
		fw.flush();
		System.out.println("completed");
		
	}
	
	
	public static void main(String[] args) throws IOException, ParseException {
		writeJson();
	}
	
}
