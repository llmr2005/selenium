package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Collegeweek_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.collegeweeklive.com/go-signup/");
		// implicit wait statement  - for page load will wait max time in seconds(30)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Lakshman");
		driver.findElement(By.id("lastName")).sendKeys("mohan");
		driver.findElement(By.id("emailAddress")).sendKeys("llmr2005@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("123456");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234");
		// String text =
		// driver.findElement(By.xpath("//*[@id='country']")).isSelected("INDIA");
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("ALBANIA"); // It looks not able to find object ?

		new Select(driver.findElement(By.name("attendeeType"))).selectByValue("Transfer");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.name("questions[q_134]"))).selectByValue("940");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("February");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByIndex(4);
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByValue("2000");

		//driver.findElement(By.id("submit")).click();
		// driver.quit();
	}

}
