package week4.day2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HATwoBigBasket {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
//		- Initialize ChromeDriver
//		- Load the URL (https://www.bigbasket.com/)
//		- Maximize the browser window
//		- Add an implicit wait to ensure the webpage elements are fully loaded
		
		
	ChromeDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	//. Navigate to https://www.bigbasket.com/.
	d.get("https://www.bigbasket.com/");
	
	//Click on "Shop by Category"
	d.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
	
	//Mouse over "Foodgrains, Oil & Masala"
	Thread.sleep(3000);
	WebElement foodandgrains = d.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
	Actions a = new Actions(d);
	a.moveToElement(foodandgrains).perform();
	
	//. Mouse over "Rice & Rice Products"
	Thread.sleep(3000);
	WebElement rice_and_rice_products = d.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
	a.moveToElement(rice_and_rice_products).perform();
	
	//. Click on "Boiled & Steam Rice".
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
	
	//Filter the results by selecting the brand "bb Royal".
	Thread.sleep(2000);
	WebElement scroll = d.findElement(By.xpath("//span[text()='Price']"));
	a.scrollToElement(scroll).perform();
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='i-BBRoyal']")).click();
	
	//. Click on "Tamil Ponni Boiled Rice".
	Thread.sleep(2000);
	WebElement s= d.findElement(By.xpath("//h3[text()='Steam Rice Kolam']"));
	a.scrollToElement(s).perform();
	Thread.sleep(2000);
	d.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
	
	//Select the 5 Kg bag.
	Thread.sleep(2000);
	
	//handel the window
	
	   Set<String> windowHandles = d.getWindowHandles();
	   ArrayList<String> abc= new ArrayList<String>(windowHandles);
	   d.switchTo().window(abc.get(1));
	
	   WebElement x = d.findElement(By.xpath("//span[text()='10 kg']"));
	   a.scrollToElement(x).perform();
	   
	   d.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]")).click();
	   
	   //Check and note the price of the rice.
	   String price = d.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
	  String priceone=  price.replaceAll("Price:", "");
	  String pricetwo = priceone.replaceAll("₹", "");
	   System.out.println("Price of Rice:"+pricetwo);
	   
	   //Click "Add" to add the bag to your cart
	   d.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
	   
	   
	   // Verify the success message that confirms the item was added to your cart.
	  
	   String getpopup = d.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
	   if(getpopup.contains("An item has been added to your basket successfully")) {
		   System.out.println("item has been added to cart");
	   }
	   else
	   {
		   System.out.println("item has not been added to cart");
	   }
	   
	   //Take a snapshot of the current page

	   WebElement snap= d.findElement(By.xpath("//div[@id='__next']"));
	   File src= snap.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./BigbasketSnapshot/bb2.png");
	   FileUtils.copyFile(src,dest);
	   
	   //Close the current window.
	   d.close();
	   d.switchTo().window(abc.get(0));
	   //Close the main window.
	   d.close();


	}
}