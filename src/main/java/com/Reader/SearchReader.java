package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SearchReader {

	
	Properties ps;
	FileInputStream fs;
	
	private Properties getAdactinsearch() {
		File file = new File("C:\\Users\\mvion\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\Properties\\Search.Properties");
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
	
	public String getlocation() {
		String location = getAdactinsearch().getProperty("location");
		return location;
	}
	public String gethotels() {
		String hotels = getAdactinsearch().getProperty("hotels");
		return hotels;
	}
	public String getroom_type() {
		String room_type = getAdactinsearch().getProperty("room_type");
		return room_type;
	}
	public String getroom_nos() {
		String room_nos = getAdactinsearch().getProperty("room_nos");
		return room_nos;
	}
	public String getdatepick_in() {
		String datepick_in = getAdactinsearch().getProperty("datepick_in");
		return datepick_in;
	}
	public String getdatepick_out() {
		String datepick_out = getAdactinsearch().getProperty("datepick_out");
		return datepick_out;
	}
	public String getadult_room() {
		String adult_room = getAdactinsearch().getProperty("adult_room");
		return adult_room;
	}
	public String getchild_room() {
		String child_room = getAdactinsearch().getProperty("child_room");
		return child_room;
	}
	public String getSubmit() {
		String Submit = getAdactinsearch().getProperty("Submit");
		return Submit;
	}
	
}
