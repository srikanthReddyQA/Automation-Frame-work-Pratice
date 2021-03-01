package AutomationProject.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium {
	
	@Test
	public void launchBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\AutomationFramework\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("arm");
		searchbar.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='d5oMvf']/a/div")).click();
		
		//driver.findElement(By.xpath("//div[text()='Arm Microprocessors - Computing & Connectivity']")).click();

		Thread.sleep(2000);
	   String ActualPageTitle =	driver.getTitle();
		String ExpectedTitle ="Microprocessor Cores and Technology – Arm";
	Assert.assertEquals(ExpectedTitle.trim(), ActualPageTitle.trim());	
		
	}

}
