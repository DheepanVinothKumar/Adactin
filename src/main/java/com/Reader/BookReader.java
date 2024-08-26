package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BookReader {

	Properties ps;
	FileInputStream fs;

	private Properties getAdactinsearch() {
		File file = new File(
				"C:\\Users\\mvion\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\Properties\\Booking.Properties");
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

	public String getfirst_name() {
		String first_name = getAdactinsearch().getProperty("first_name");
		return first_name;
	}

	public String getlast_name() {
		String last_name = getAdactinsearch().getProperty("last_name");
		return last_name;
	}

	public String getaddress() {
		String address = getAdactinsearch().getProperty("address");
		return address;
	}

	public String getcc_num() {
		String cc_num = getAdactinsearch().getProperty("cc_num");
		return cc_num;
	}

	public String getcc_type() {
		String cc_type = getAdactinsearch().getProperty("cc_type");
		return cc_type;
	}

	public String getcc_exp_month() {
		String cc_exp_month = getAdactinsearch().getProperty("cc_exp_month");
		return cc_exp_month;
	}

	public String getcc_exp_year() {
		String cc_exp_year = getAdactinsearch().getProperty("cc_exp_year");
		return cc_exp_year;
	}

	public String getcc_cvv() {
		String cc_cvv = getAdactinsearch().getProperty("cc_cvv");
		return cc_cvv;
	}

	public String getbook_now() {
		String book_now = getAdactinsearch().getProperty("book_now");
		return book_now;
	}

	public String getcancel() {
		String cancel = getAdactinsearch().getProperty("cancel");
		return cancel;
	}
}
