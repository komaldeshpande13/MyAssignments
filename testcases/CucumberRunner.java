package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/main/java/features/Login.feature",
glue="com.salesforce.pages")
public class CucumberRunner extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName="Salesforce Application";
		testDescription="Login page with cucumber";
		authors="Dilip";
		category="Sanity";
	}
	
}
