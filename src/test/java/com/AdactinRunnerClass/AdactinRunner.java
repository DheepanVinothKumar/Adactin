package com.AdactinRunnerClass;


import com.AdactinBaseClass.BaseClass;
import com.POM_Manager.POM_PageObjectManager;

public class AdactinRunner extends BaseClass{
	
	public static void main(String[] args) {
		
		POM_PageObjectManager pm = new POM_PageObjectManager();
		browser(pm.getConfigReader().getbrowser());
		url(pm.getConfigReader().geturl());
		pm.getAdactinLoginPage().getLoginPageElements();
		pm.getAdactinSearchPage().getSearchPageElements();
		pm.getAdactinSelectpage().getAdactinSelectpage();
		pm.getAdactinBookPage().getBookPageElements();
	}

}
