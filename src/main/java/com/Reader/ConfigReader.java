package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties ps;
	FileInputStream fs;

	private Properties getAdactinData() {
		File file = new File(
				"C:\\Users\\mvion\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\Properties\\Config.properties");
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

	public String getbrowser() {
		String browser = getAdactinData().getProperty("browser");
		return browser;
	}

	public String geturl() {
		String url = getAdactinData().getProperty("url");
		return url;
	}

	public String getuser() {
		String user = getAdactinData().getProperty("user");
		return user;
	}

	public String getpass() {
		String pass = getAdactinData().getProperty("password");
		return pass;
	}

}
