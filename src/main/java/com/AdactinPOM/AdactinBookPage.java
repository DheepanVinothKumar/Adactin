package com.AdactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseClass.BaseClass;
import com.POM_Manager.POM_PageObjectManager;
import com.Reader.BookReader;

import AdactinInderface.BookElements;

public class AdactinBookPage extends BaseClass implements BookElements {

	POM_PageObjectManager ps = new POM_PageObjectManager();

	public static WebDriver adactindriver;

	@FindBy(id = firstName_id)
	private WebElement first_name;

	@FindBy(id = lastName_id)
	private WebElement last_name;

	@FindBy(id = address_id)
	private WebElement address;

	@FindBy(id = card_id)
	private WebElement cc_num;

	@FindBy(id = cardType_id)
	private WebElement cc_type;

	@FindBy(id = expirymonth_id)
	private WebElement cc_exp_month;

	@FindBy(id = expiryyear_id)
	private WebElement cc_exp_year;

	@FindBy(id = cvv_id)
	private WebElement cc_cvv;

	@FindBy(id = book_id)
	private WebElement book_now;

	@FindBy(id = cancel_id)
	private WebElement cancel;

	public AdactinBookPage(WebDriver driver) {
		adactindriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getBookPageElements() {

		BookReader br = new BookReader();

		passInput(driver, first_name, br.getfirst_name());
		passInput(driver, last_name, br.getlast_name());
		passInput(driver, address, br.getaddress());
		passInput(driver, cc_num, br.getcc_num());
		selectFromDropDown(driver, cc_type, "visibleText", cardType_id);
		selectFromDropDown(driver, cc_exp_month, "visibleText", expirymonth_id);
		selectFromDropDown(driver, cc_exp_year, "visibleText", expiryyear_id);
		passInput(driver, cc_cvv, br.getcc_cvv());
		clickOnElement(driver, book_now);

	}

}
