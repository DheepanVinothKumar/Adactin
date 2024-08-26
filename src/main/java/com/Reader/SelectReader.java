package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SelectReader {

	Properties ps;
	FileInputStream fs;
	
	private Properties getAdactinsearch() {
		File file = new File("C:\\Users\\mvion\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\Properties\\Select.Properties");
		try {
			fs = new FileInputStream(file);
			ps = new Properties();	
			ps.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
	
	}
	
	public String getradiobutton() {
		String radiobutton = getAdactinsearch().getProperty("radiobutton");
		return radiobutton;
	}
	public String getcontinuebtn() {
		String continuebtn = getAdactinsearch().getProperty("continuebtn");
		return continuebtn;
	}
	public String getcancelbtn() {
		String cancelbtn = getAdactinsearch().getProperty("cancelbtn");
		return cancelbtn;
	}
	
	
	
	
	
	
	
	
	
	
}
