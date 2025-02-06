package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;

public class ContentPage extends ProjectSpecificMethods{

	@Then("Select a Account Name in Assigned to field")
	public ContentPage selectAccountNameInAssignedField() throws InterruptedException {
		Thread.sleep(2000);
		click(Locators.XPATH,"//span[@class='pillText']");
		reportStep("Select a Account Name in Assigned to field", "pass");
		
		return this;
	}
	
	@Then("Click View All from Today's Task")
	public ContentPage clickViewAllFromTodaysTask() throws InterruptedException {
		Thread.sleep(2000);
		
		
		act = new Actions(getDriver());

		WebElement locateElement = locateElement(Locators.XPATH,"//span[text()='View All Key Deals']");
		act.scrollToElement(locateElement).perform();
		
		Thread.sleep(2000);
		click(Locators.XPATH,"(//span[text()='View All'])[2]");
		reportStep("Click View All from Today's Task", "pass");
		
		return this;
	}
	
	@Then("Click on Task and click New Task")
	public ContentPage clickOnTaskAndClickNewTask() throws InterruptedException {
		Thread.sleep(2000);
		try {
			click(Locators.XPATH,"//a[@class='slds-button slds-button_reset']");
			Thread.sleep(2000);
			clickUsingJs(locateElement(Locators.XPATH,"//span[text()='New Task']"));
			Thread.sleep(2000);

			reportStep("Click on Task and click New Task", "pass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
	@Then("Select a subject as Email and Status as In Progress")
	public ContentPage selectSubjectEmailAndStatusInprogress() throws InterruptedException {
		Thread.sleep(2000);
		try {
		
			clickUsingJs(locateElement(Locators.XPATH,"//input[@class='slds-combobox__input slds-input']"));
			Thread.sleep(2000);
			clickUsingJs(locateElement(Locators.XPATH,"//span[@title='Email']"));
			Thread.sleep(2000);
			clickUsingJs(locateElement(Locators.XPATH,"//a[text()='Not Started']"));
			Thread.sleep(2000);
			clickUsingJs(locateElement(Locators.XPATH,"//a[@title='In Progress']"));
			Thread.sleep(2000);
			reportStep("Select a subject as Email", "pass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
	@Then("Click on the image of Name field and click on Contacts and select Contact")
	public ContentPage clickOnImageOfNameFieldClickContactsAndSelectContact() throws InterruptedException {
	
		try {
			click(locateElement(Locators.XPATH,"(//div[@class='uiPopupTrigger'])[6]"));
			
			Thread.sleep(2000);
			clickUsingJs(locateElement(Locators.XPATH,"//a[@title='Contacts']"));
			click(Locators.XPATH,"//input[@title='Search Contacts']");
			click(Locators.XPATH,"//div[@class='slds-m-left--smalllabels slds-truncate slds-media__body']");

			reportStep("Click on the image of Name field, click on Contacts and select Contact", "pass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
	
	
	@Then("Set Priority as High")
	public ContentPage setPriorityAsHigh() throws InterruptedException {
		
		try {
		
			act = new Actions(getDriver());
			WebElement p = locateElement(Locators.XPATH,"//textarea[@class='textarea textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']");
			
			act.scrollToElement(p).perform();
			
			clickUsingJs(locateElement(Locators.LINK_TEXT,"Normal"));
			Thread.sleep(2000);
			clickUsingJs(locateElement(Locators.LINK_TEXT,"High"));
			
			reportStep("Set Priority as High", "pass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
	@Then("Click on the image of Related To field, click on Product and Select Product")
	public ContentPage clickOnImageOfRelatedToFieldClickProductAndSelectProduct() throws InterruptedException {
	
		try {
			
			click(Locators.XPATH,"(//div[@class='uiPopupTrigger'])[7]");

			Thread.sleep(2000);
			act = new Actions(getDriver());


			WebElement p = locateElement(Locators.XPATH,"//span[@title='Promotion Segment Buyer Groups']");
			act.scrollToElement(p).perform();
			
			Thread.sleep(2000);
			
			clickUsingJs(locateElement(Locators.XPATH,"//span[@title='Products']"));
			
			Thread.sleep(2000);
			click(Locators.XPATH,"//input[@title='Search Products']");
			Thread.sleep(2000);
			click(Locators.XPATH,"//div[@title='App']");
			
			Thread.sleep(2000);
			reportStep("Click on the image of Related To field, click on Product and Select Product", "pass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}

	@Then("Click Save")
	public ContentPage clickSave() throws InterruptedException {
	
		try {
			
			click(Locators.XPATH,"//button[@title='Save']");

			Thread.sleep(2000);
			
			
			Thread.sleep(2000);
			reportStep("Click Save", "pass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
}
