package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.justrechargeit.com/index_justrecharge.aspx");
		driver.findElement(By.linkText("Create New Account")).click();
		// Validate Check boxes by default selected or not
		if (driver.findElement(By.name("checkbox1")).isSelected()) {
			System.out.println("By default check box1 selected");
			
		} else {
			System.out.println("By default check box1 not selected");
		}
		
		if (driver.findElement(By.name("checkbox")).isSelected()) {
			System.out.println("By default check box2 selected");
			
		} else {
			System.out.println("By default check box2 not selected");
		}
		
		

	}

}
