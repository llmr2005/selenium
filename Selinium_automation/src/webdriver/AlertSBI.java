package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertSBI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");

		/*
		 * //to refresh page driver.navigate().refresh(); driver.navigate().forward();
		 * driver.navigate().back();
		 */

		// implicit wait statement - for page load will wait max time in seconds(30)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.name("firstname")).sendKeys("Lakshmanmohan");
		// driver.findElement(By.name("lastname")).sendKeys("mohan");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(5000);
		// Alert Handle
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertText is : " + alertText);
		Thread.sleep(5000);
		// to click on Ok button on Alert will use Accept() function
		driver.switchTo().alert().accept();// Ok button
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("New")).click();

		// Confirmation has displayed,to click on Cancel button on Alert will use
		// Dismiss();
		String alertText1 = driver.switchTo().alert().getText();
		System.out.println("alertText1 is : " + alertText1);

		driver.switchTo().alert().dismiss();
	}

}
