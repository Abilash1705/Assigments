package Week5.day3;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	
	
	
	
	
	
		 
		
	}

}
