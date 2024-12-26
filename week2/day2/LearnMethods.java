package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMethods {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("book", Keys.ENTER);
		String bookname = d.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']/span")).getText();
		System.out.println("Book name-"+bookname);
		
		String bookprice = d.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Book Price-"+bookprice);
		String p = bookprice.replaceAll(",","");
	    
		int parse =Integer.parseInt(p);
        System.out.println("Parse value of book-"+parse);
	}

}
