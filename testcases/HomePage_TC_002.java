package com.salesforce.testcases;

import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;

public class HomePage_TC_002 extends ProjectSpecificMethods{

	@Test
	public void home() throws InterruptedException {
		
		HomePage hp=new HomePage();
	hp.clickToggleButton();
	hp.clickViewAllAppLauncher();
	hp.clickContentTab();	
	}
}
