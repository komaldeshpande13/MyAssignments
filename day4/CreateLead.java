package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Komal");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Desh");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("title");
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		String t = driver.getTitle();
		System.out.println(t);
		if(t.contains("View Lead")) {
			System.out.println("Title display successfully");
		}
		else {
			System.out.println("Title display not display");
		}
		
		driver.close();
	}

}
