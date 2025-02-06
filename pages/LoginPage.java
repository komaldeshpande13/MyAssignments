package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
	
	@Given("Enter the username as {string}")
	public LoginPage enterUserName(String uName) {
		
		//locate the element
		WebElement locateElement = locateElement("username");
		//type userName
		type(locateElement, uName);
		//clear & Type - ClearAndType(locateElement, uName);
		reportStep("Enter the UserName as :"+uName, "pass");
		return this;
	}
	
	@And("Enter the password as {string}")
	public LoginPage enterPassword(String pass) {
		
		type(locateElement("password"), pass);
		reportStep("Enter the PassWord as :"+pass, "pass");
		return this;
	}
	
	
	@When("Click on login button")
	public HomePage clickOnLogin() {
		click(locateElement("Login"));
		reportStep("Login is Clicked", "pass");
		return new HomePage();
	}

}
	
	
	
