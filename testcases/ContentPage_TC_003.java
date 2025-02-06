package com.salesforce.testcases;

import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.ContentPage;


public class ContentPage_TC_003 extends ProjectSpecificMethods{

	@Test
	public void content() throws InterruptedException {
		
		ContentPage cp=new ContentPage();

		cp.selectAccountNameInAssignedField();
		cp.clickViewAllFromTodaysTask();
		cp.clickOnTaskAndClickNewTask();
		cp.selectSubjectEmailAndStatusInprogress();
		cp.clickOnImageOfNameFieldClickContactsAndSelectContact();
		cp.setPriorityAsHigh();
		cp.clickOnImageOfRelatedToFieldClickProductAndSelectProduct();
		cp.clickSave();
		}
	
}
