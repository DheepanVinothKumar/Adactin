package com.AdactinPOM;

import javax.swing.plaf.multi.MultiButtonUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseClass.BaseClass;
import com.POM_Manager.POM_PageObjectManager;
import com.Reader.SearchReader;

import AdactinInderface.SearchElements;

public class AdactinSearchPage extends BaseClass implements SearchElements {
	
	POM_PageObjectManager ps = new POM_PageObjectManager();
	
public static WebDriver adactindriver;
	
	@FindBy(id = Lacation_id)
	private WebElement location;
	
	@FindBy(id = Hotels_id)
	private WebElement hotels;
	
	@FindBy(id = RoomType_id)
	private WebElement room_type;
	
	@FindBy(id = NoOfRoom_id)
	private WebElement room_nos;
	
	@FindBy(id = Checkin_id)
	private WebElement datepick_in;
	
	@FindBy(id = Checkout_id)
	private WebElement datepick_out;
	
	@FindBy(id = NoofAdults_id)
	private WebElement adult_room;
	
	@FindBy(id = NoofChildren_id)
	private WebElement child_room;
	
	@FindBy(id = Search_id)
	private WebElement Submit;
	
	@FindBy(id = Reset_id)
	private WebElement Reset;
	
	public AdactinSearchPage (WebDriver driver) {
		adactindriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getSearchPageElements() {
		
		SearchReader sr = new SearchReader();
		
		dropdown(driver, location, sr.getlocation());
		dropdown(driver, hotels, sr.gethotels());
		dropdown(driver, room_type, sr.getroom_type());
		dropdown(driver, room_nos, sr.getroom_nos());
		inputkey(driver, datepick_in, sr.getdatepick_in());
		inputkey(driver, datepick_out, sr.getdatepick_out());
		dropdown(driver, adult_room, sr.getadult_room());
		dropdown(driver, child_room, sr.getchild_room());
		mouseclick(driver, Submit);
		
	}
	
	
	
	
	
	
	
	
	

}
