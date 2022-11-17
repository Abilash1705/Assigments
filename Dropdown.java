package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		  driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Create Lead")).click();
	        WebElement findelement= driver.findElement(By.id("createLeadForm_dataSourceId"));
	        Select dd1 =new Select(findelement);
	        dd1.selectByVisibleText("Employee");
	        WebElement findelement2= driver.findElement(By.id("createLeadForm_industryEnumId"));
	        Select dd2 =new Select(findelement2);
	         dd2.selectByIndex(3);
	         WebElement findelement3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	         Select dd3=new Select(findelement3);
	         dd3.selectByIndex(5);
	         WebElement findelement4=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	         Select dd4=new Select(findelement4);
	         dd4.selectByIndex(3);
	         WebElement findelement5=driver.findElement(By.id("createLeadForm_currencyUomId"));
	         Select dd5=new Select(findelement5);
	         dd5.selectByIndex(12);
	         driver.manage().window().minimize();
	        
	}

}
