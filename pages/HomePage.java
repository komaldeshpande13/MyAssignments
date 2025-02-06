package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;

public class HomePage extends ProjectSpecificMethods{
	
	@Then("Verify the Title")
	public HomePage verifypage() throws InterruptedException {
		Thread.sleep(4000);
		
		verifyTitle("Home | Salesforce");
		return this;
	}

	@Then("Click on toggle menu button from the left corner")
	public HomePage clickToggleButton() throws InterruptedException {
		Thread.sleep(2000);


		click(locateElement(Locators.XPATH,"//div[@class='slds-icon-waffle']"));
	    
		reportStep("Click on toggle menu button from the left corner", "pass");
		
		
		return this;
	}
	
	@Then("Click view All from App Launcher")
	public HomePage clickViewAllAppLauncher() throws InterruptedException {
		Thread.sleep(2000);


		click(locateElement(Locators.XPATH,"(//button[@class='slds-button'])[2]"));
	    
		reportStep("Click view All from App Launcher", "pass");
		
		
		return this;
	}
	
	@Then("Click on Content tab")
	public ContentPage clickContentTab() throws InterruptedException {
		Thread.sleep(2000);


		click(locateElement(Locators.XPATH,"//p[text()='Content']"));
	    
		reportStep("Click on Content tab", "pass");
		
		
		return new ContentPage() ;
	}
}
