package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//label[@class='label']/following::input")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//div[@id='pwcaps']/following::input")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
