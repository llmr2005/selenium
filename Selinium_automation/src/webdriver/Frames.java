package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// web driver object
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Open Gmail link
		 driver.get("http://mis.nyiso.com/public/");
		 // Frame Handler 
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(1);
		  
		 //click on link
		 driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/a")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(2);
		// String result = driver.findElement(By.xpath("/html/body/table/tbody/tr[8]/td[2]/span")).getText();
		 String result = driver.findElement(By.cssSelector("body>table>tbody>tr:nth-child(8)>td:nth-child(2)>span")).getText();
		 System.out.println("Message " +result);
		 
	

	}

}
