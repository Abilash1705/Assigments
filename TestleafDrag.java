package Week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestleafDrag {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
	WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
	Actions build=new Actions(driver);
	build.dragAndDropBy(drag, 500, 55).perform();
	
	
	
	}

}
