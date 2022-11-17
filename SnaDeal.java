package own;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnaDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
	WebElement men = driver.findElement(By.xpath("//span[@class='catText'][1]"));
	Actions build=new Actions(driver);
	build.moveToElement(men).perform();
	driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
	String shoes = driver.findElement(By.xpath("//span[contains(text(),'Items')]")).getText();
		System.out.println("Shoes count:"+shoes);
		String Title="Sports Shoes For Men - Upto 70% OFF on Top Shoe Brands";
		
		System.out.println(Title);
		
			
	}
	}



