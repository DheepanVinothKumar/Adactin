package com.POM_Manager;

import com.AdactinBaseClass.BaseClass;
import com.AdactinPOM.AdactinBookPage;
import com.AdactinPOM.AdactinLoginPage;
import com.AdactinPOM.AdactinSearchPage;
import com.AdactinPOM.AdactinSelectpage;
import com.Reader.BookReader;
import com.Reader.ConfigReader;
import com.Reader.SearchReader;
import com.Reader.SelectReader;

public class POM_PageObjectManager extends BaseClass {

	private AdactinLoginPage login;

	private ConfigReader reader;

	private AdactinSearchPage search;

	private SearchReader searchreader;

	private AdactinSelectpage select;

	private SelectReader selectreader;
	
	private AdactinBookPage book;

	private BookReader bookreader;
	
	

	public AdactinLoginPage getAdactinLoginPage() {
		if (login == null) {
			login = new AdactinLoginPage(driver);
		}
		return login;
	}

	public ConfigReader getConfigReader() {
		if (reader == null) {
			reader = new ConfigReader();
		}
		return reader;
	}

	public AdactinSearchPage getAdactinSearchPage() {
		if (search == null) {
			search = new AdactinSearchPage(driver);
		}
		return search;
	}

	public SearchReader getSearchReader() {
		if (searchreader == null) {
			searchreader = new SearchReader();
		}
		return searchreader;
	}

	public AdactinSelectpage getAdactinSelectpage() {
		if (select == null) {
			select = new AdactinSelectpage(driver);
		}
		return select;
	}

	public SelectReader getSelectReader() {
		if (selectreader == null) {
			selectreader = new SelectReader();
		}
		return selectreader;
	}

	public AdactinBookPage getAdactinBookPage() {
		if (book == null) {
			book = new AdactinBookPage(driver);
		}
		return book;
	}

	public BookReader getBookReader() {
		if (bookreader == null) {
			bookreader = new BookReader();
		}
		return bookreader;
	}











}
