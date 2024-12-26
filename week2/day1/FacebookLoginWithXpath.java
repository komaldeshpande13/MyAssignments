package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginWithXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("9623742203");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Komal@13");
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
		String t= driver.getTitle();
		System.out.println(t);
		
		if(t.contains("Facebook")) {
			System.out.println("login to facebook successsfull");
		}
		else {
			System.out.println("logi fail!!!!!!!!!");
		}
	}

}
