package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");

Thread.sleep(10000);

driver.close();
	}

}
