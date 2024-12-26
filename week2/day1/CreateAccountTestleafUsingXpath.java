package week2.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountTestleafUsingXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/.");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
		
	}

}
