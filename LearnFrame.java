package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
	    d.switchTo().frame("iframeResult");
		
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert a = d.switchTo().alert();
		a.accept();
		String m = d.findElement(By.id("demo")).getText();
		System.out.println("text display afetr click on alert pop up: " + m);
		
		d.close();
		
	}

}
