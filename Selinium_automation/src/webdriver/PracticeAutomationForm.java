package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAutomationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/User/Desktop/Selenium/NSR_Selenium%20Automation.html");
		 //implicit wait statement  - for page load will wait max time in seconds(30)
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Lakshmanmohan");
		driver.findElement(By.name("lastname")).sendKeys("mohan");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-3")).click();
		driver.findElement(By.id("datepicker")).sendKeys("12062006");
		driver.findElement(By.id("profession-2")).click();
		driver.findElement(By.id("tool-2")).click();
		new Select(driver.findElement(By.id("continents"))).selectByVisibleText("Europe");
		new Select(driver.findElement(By.id("countries"))).selectByVisibleText("U.K");
		new Select(driver.findElement(By.id("CurrentlyWorking"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.xpath("//*[@class='controls'][2]/select[2]"))).selectByVisibleText("5-10 L"); //not able to find object
		new Select(driver.findElement(By.xpath("//*[@id=\'selenium_commands\']"))).selectByVisibleText("Switch Commands");
		
				
	}

}
