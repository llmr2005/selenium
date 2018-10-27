package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLogin {
	public static void main(String[] args) {

		// web driver object
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\FF-54\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver", ".\\browserDrivers\\IEDriverServer.exe");
//		driver = new  InternetExplorerDriver();
		
		//type URL
		driver.get("https://www.facebook.com/");
		//Maximize the window
		//driver.manage().window().maximize();
		
		//get current URL and print
		String currenturl = driver.getCurrentUrl();
		System.out.println("currenturl:" +currenturl);
		//get current Title and print
		String currenttitle = driver.getTitle();
		System.out.println("currenttitle:" +currenttitle);
		
		//get text 
		String text = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span")).getText();
		System.out.println("text:" +text);
		
		// drop down selection 
		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Oct");
		new Select(driver.findElement(By.id("day"))).selectByIndex(9);
		new Select(driver.findElement(By.id("year"))).selectByValue("2015");
//		//send data
//		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("Testing");
//		driver.findElement(By.id("loginbutton")).click();
//		//driver.close();
//		
//		driver.quit();
	}
	

}
