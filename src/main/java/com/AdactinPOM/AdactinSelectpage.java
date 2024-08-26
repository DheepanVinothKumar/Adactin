package com.AdactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseClass.BaseClass;
import com.POM_Manager.POM_PageObjectManager;
import com.Reader.SearchReader;
import com.Reader.SelectReader;

import AdactinInderface.SelectElements;

public class AdactinSelectpage extends BaseClass implements SelectElements {
	
	POM_PageObjectManager ps = new POM_PageObjectManager();
	
	public static WebDriver adactindriver;
		
		@FindBy(id = button_id)
		private WebElement radiobutton;
		
		@FindBy(id = continue_id)
		private WebElement continuebtn;
		
		@FindBy(id = cancel_id)
		private WebElement cancelbtn;
		
		public AdactinSelectpage (WebDriver driver) {
			adactindriver = driver;
			PageFactory.initElements(driver, this);
		}
		public void getAdactinSelectpage() {
			
			SelectReader srd = new SelectReader();
			
			mouseclick(driver, radiobutton);
			mouseclick(driver, continuebtn);

}
}
