package Week6.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
		
		File sourse3=driver.getScreenshotAs(OutputType.FILE);
		File destination3=new File("./snap/img3.png");
		FileUtils.copyFile(sourse3, destination3);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
	}
	

}
