package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// web driver object
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Open Gmail link
		 driver.get("https://www.gmail.com/");

	}

}
