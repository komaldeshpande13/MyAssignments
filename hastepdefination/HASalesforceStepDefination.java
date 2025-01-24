package hastepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HASalesforceStepDefination {

	ChromeDriver driver;
	String b="Komal";
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@When("Enter username as dilip@testleaf.com")
	public void enter_username_as_dilip_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		
	}

	@When("Enter password as Test@{int}")
	public void enter_password_as_test(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Test@2025");
		driver.findElement(By.id("Login")).click();
	}

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='slds-icon-waffle'])[1]")).click();
	}

	@When("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() throws InterruptedException {
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    Thread.sleep(3000);
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
	Thread.sleep(3000);
	WebElement accountsTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
	driver.executeScript("arguments[0].click()",accountsTab);
 
}


	@When("Click on New button")
	public void click_on_new_button() {
	  driver.findElement(By.xpath("(//div[text()='New'])[1]")).click();
	}

	@When("Enter your name as account name")
	public void enter_your_name_as_account_name() {
	 driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(b);
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		Actions a = new Actions(driver);
		WebElement s = driver.findElement(By.xpath("//input[@id='input-302']"));
		a.scrollToElement(s).perform();
	    driver.findElement(By.xpath("//button[@id='combobox-button-288']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("Click Save")
	public void click_save() {
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify Account name")
	public void verify_account_name() {
	  String a = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
	  if(a.contains(b)) {
		  System.out.println("Account Verififed");
		  
	  }
	  else {
		  System.out.println("Not a averified account");
	  }
	}
	
}
