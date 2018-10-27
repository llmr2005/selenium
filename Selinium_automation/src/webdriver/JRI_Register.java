package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.justrechargeit.com/index_justrecharge.aspx");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.id("signup_name")).sendKeys("Lakshman");
		driver.findElement(By.id("signup_mobileno")).sendKeys("9444750220");
		driver.findElement(By.id("signup_email")).sendKeys("llmr2005@gmail.com");
		driver.findElement(By.id("signup_password")).sendKeys("123456");
		driver.findElement(By.name("checkbox1")).click();
		driver.findElement(By.name("checkbox")).click();
		driver.findElement(By.id("imgbtnSubmit")).click();

	}

}
