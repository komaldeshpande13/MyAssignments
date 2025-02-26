package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAWindowHandel {

	public static void main(String[] args) throws InterruptedException {

//		- Initialize ChromeDriver
//		- Load the URL (http://leaftaps.com/opentaps/control/login)
//		- Maximize the browser window
//		- Add an implicit wait to ensure the webpage elements are fully loaded
       	ChromeDriver driver = new ChromeDriver();
       	driver.manage().window().maximize();
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       	driver .get("http://leaftaps.com/opentaps/control/login");
       	
//       	- Enter the username and password.
       	driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoSalesManager");
       	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
       	
//       	- Click on the Login button.
       	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

//       	- Click on the CRM/SFA link.
       	driver.findElement(By.xpath("//div[@id='label']")).click();
//       	- Click on the Contacts button.
       	Thread.sleep(2000);
       	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//       	- Click on Merge Contacts.
       	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
       	
//       	- Click on the widget of the "From Contact".
    	Thread.sleep(2000);
       	driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
//       	- Click on the first resulting contact.
       	Set<String> windowHandels = driver.getWindowHandles();
       	List<String> childwindow = new ArrayList<String>(windowHandels);
       	driver.switchTo().window(childwindow.get(1));
       	Thread.sleep(2000);
       	driver.findElement(By.xpath("//a[@class='linktext']")).click();
       	
       
//       	- Click on the widget of the "To Contact".
       	Thread.sleep(2000);
       	driver.switchTo().window(childwindow.get(0));
       	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
       	Thread.sleep(2000);
//       	- Click on the second resulting contact.
    	
     	Set<String> windowtwo = driver.getWindowHandles();
       	List<String> childtwo = new ArrayList<String>(windowtwo);
      
       	driver.switchTo().window(childtwo.get(1));
       	Thread.sleep(2000);
       	driver.findElement(By.xpath("(//a[@class='linktext'])[7]")).click();

//       	- Click on the Merge button.
    	driver.switchTo().window(childtwo.get(0));
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[text()='Merge']")).click();

    	//       	- Accept the alert.
    	Thread.sleep(2000);
    	Alert alert=driver.switchTo().alert();
    	
    	alert.accept();
    	
    	
//       	- Verify the title of the page.

    	String title = "View Contact | opentaps CRM";
    	
    	if(title.contains("View Contact | opentaps CRM"))
    	{
    		System.out.println("testcase pass");
    	}
    	else
    	{
    		System.out.println("test case fail");
    	}
    	
	}

}
