package com.AdactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseClass.BaseClass;
import com.POM_Manager.POM_PageObjectManager;
import com.Reader.ConfigReader;

import AdactinInderface.LoginElements;

public class AdactinLoginPage extends BaseClass implements LoginElements {
	
	POM_PageObjectManager ps = new POM_PageObjectManager(); 

	public static WebDriver adactindriver;
	
	@FindBy(id = User_id)
	private WebElement username;
	
	@FindBy(id = Pass_id)
	private WebElement password;
	
	@FindBy(id = Login_id)
	private WebElement login;
	
	
	public AdactinLoginPage (WebDriver driver) {
		adactindriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getLoginPageElements () {
		
		ConfigReader cs = new ConfigReader();

		passInput(driver, username, cs.getuser());
		passInput(driver, password, cs.getpass());
		clickOnElement(driver, login);
		
	}
	
}
