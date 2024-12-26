package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver ch= new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("http://leaftaps.com/opentaps");
		ch.findElement(By.id("username")).sendKeys("DemoSalesManager");
		ch.findElement(By.id("password")).sendKeys("crmsfa");
		ch.findElement(By.className("decorativeSubmit")).click();
		ch.findElement(By.linkText("CRM/SFA")).click();
		ch.findElement(By.linkText("Accounts")).click();
		ch.findElement(By.linkText("Create Account")).click();
        ch.findElement(By.id("accountName")).sendKeys("KomalD");
		ch.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		ch.findElement(By.id("numberEmployees")).sendKeys("1");
		ch.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		ch.findElement(By.className("smallSubmit")).click();
		
		
		
		
		String t = ch.getTitle();
		
		if(t.contains("Account Details")) {
			System.out.println("Title display correectly");
		
		}
		else {
		System.out.println("Title not display correctly");
		}
	
		Thread.sleep(5000);
		ch.close();
		
	}

}
