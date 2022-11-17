package Week3.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev141581.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='login-form-field']//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@class='login-form-field']//input[@id='user_password']")).sendKeys("iX-66uY+DwSi");
		driver.findElement(By.id("sysverb_login")).click();
	}

}
