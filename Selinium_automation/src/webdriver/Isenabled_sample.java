package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		driver.manage().window().maximize();

		if (driver.findElement(By.id("create")).isEnabled()) {

			System.out.println("element is in enabled state");

		} else {
			System.out.println("element is in disabled state");
		}

		driver.findElement(By.id("textbox")).sendKeys("test button is enabled");
		if (driver.findElement(By.id("create")).isEnabled()) {

			System.out.println(" **element is in enabled state");

		} else {
			System.out.println("**element is in disabled state");
		}

	}

}
