package Week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		org.openqa.selenium.Alert simpleAlert= driver.switchTo().alert();
		Thread.sleep(2000);
		simpleAlert.accept();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		org.openqa.selenium.Alert confirmationAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		confirmationAlert.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		org.openqa.selenium.Alert promtAlert=driver.switchTo().alert();
		promtAlert.sendKeys("Abilash");
		
		Thread.sleep(2000);
		promtAlert.accept();
		
		
		
		WebElement value=driver.findElement(By.xpath("//span[@id='confirm_result']"));
		System.out.println(value.getText());
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		driver.close();
	}

}
