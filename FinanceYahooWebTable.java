package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahooWebTable {

	public static void main(String args[]) throws InterruptedException
	{
	ChromeDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Load the url - https://finance.yahoo.com/
	d.get("https://finance.yahoo.com/");
	
	Thread.sleep(3000);
	//Click on “Crypto” tab
	d.findElement(By.xpath("//span[text()='More']")).click();
	//scroll down
	WebElement scroll = d.findElement(By.xpath("//span[text()='Top Gainers']"));
	Actions act= new Actions(d);
	act.scrollToElement(scroll).perform();
	
	//click on Crypto tab
	d.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
	
	Thread.sleep(3000);
	//Identify the table in the dom using <table> tag (//table)
	WebElement scrollone = d.findElement(By.xpath("(//span[text()='Top Gainers'])[2]"));
	act.scrollToElement(scrollone).perform();
	
   String cryptonames =  d.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr/td[2]")).getText();
	//System.out.println(cryptonames);
	
	//- To access the row values, identify the row using <tr> to travel through the table
	List<WebElement> rowvalues =  d.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr"));
	int rowcount = rowvalues.size();
	//System.out.println(rowcount);
	//To access the column values of the table, identify the column using <th>/<td>
	List<WebElement> colvalues =  d.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr[1]/td"));
	int colcount  = colvalues.size();
	//System.out.println(colcount);
	
	//Act on the elements in the table using WebElement function by iterating through the rows and columns
      for (int i = 1; i <=rowcount ; i++) {
		
			String names = d.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(names);
		
	}
	
	}
}
