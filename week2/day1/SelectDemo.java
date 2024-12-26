package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		
        WebElement d= driver.findElement(By.id("Dropdown-1"));
        Select opt= new Select(d);
        opt.selectByIndex(5);

        WebElement dd= driver.findElement(By.id("Dropdown-2"));
        Select option= new Select(dd);
        option.selectByVisibleText("UI for WinForms");

        WebElement ddd= driver.findElement(By.id("Country-1"));
        Select optionone= new Select(ddd);
        optionone.selectByValue("India");
        
        Thread.sleep(1000);   
        driver.close();    
	}

}
