package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get(" https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("9623742203");
driver.findElement(By.id("pass")).sendKeys("Komal@13");
driver.findElement(By.name("login")).click();
Thread.sleep(20000);
driver.close();
	}

}
