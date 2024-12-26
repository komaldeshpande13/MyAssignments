package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("KD");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Desh");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("7218502083");
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("Komal@13");
		
		WebElement a = driver.findElement(By.id("day"));
		Select s = new Select(a);
		s.selectByVisibleText("13");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.id("year"));
		Select n = new Select(year);
		n.selectByVisibleText("1995");
		
		//Radio Button
		WebElement female = driver.findElement(By.xpath("//input[contains(@value,'1')]"));
		female.click();
		
		WebElement male= driver.findElement(By.xpath("//input[contains(@value,'2')]"));
		male.click();
		
		WebElement custom = driver.findElement(By.xpath("//input[contains(@value,'-1')]"));
		custom.click();
		
		
	}

}
