package Week3.Day1;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spotify.com/"
				);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='ButtonInner-sc-14ud5tc-0 jrmgFq sc-jrsJWt gNCnmw sc-kEqXSa sc-jaJIhW drBNuz bGFtaP']//span[contains(text()	'GET SPOTIFY FREE')]	body > div:nth-child(1) > div:nth-child(1) > main:nth-child(2) > section:nth-child(1) > article:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > div:nth-child(1) > span:nth-child(1)\r\n"
				+ "")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Search']	body > div:nth-child(12) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(3)	\r\n"
				+ "")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Your Library']	body > div:nth-child(12) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > div:nth-child(1) > a:nth-child(1) > span:nth-child(3)	\r\n"
				+ "")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Search']	body > div:nth-child(12) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(3)	\r\n"
				+ "")).click();
		driver.findElement(By.xpath("//input[@placeholder='What do you want to listen to?']	input[placeholder='What do you want to listen to?']	\r\n"
				+ "")).sendKeys("ed sheeran");
		
		driver.findElement(By.xpath("//div[@class='_gB1lxCfXeR8_Wze5Cx9']	._gB1lxCfXeR8_Wze5Cx9	\r\n"
				+ "")).click();
		
		driver.findElement(By.xpath("//span[@class='IconWrapper__Wrapper-sc-1hf1hjl-0 fSnHJ']//*[@role='img']	svg\r\n"
				+ "")).click();
		
	}

}
