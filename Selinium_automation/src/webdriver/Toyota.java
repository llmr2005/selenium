package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toyota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// web driver object
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Open Gmail link
		 driver.get("https://www.toyota.co.uk/#/iframe/https%3a%2f%2fforms.toyota.co.uk%2fbrochure");
		 // Frame Handler 
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 
		 
		 //click on Download radio button
		 driver.findElement(By.xpath("//*[@id='delivery_method']/div/ul/li[2]/a/div")).click();
		 
		// http://mis.nyiso.com/public/ - need to task

	}

}
