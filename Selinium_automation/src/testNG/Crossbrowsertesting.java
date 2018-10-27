package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class Crossbrowsertesting {

	WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
		driver.findElement(By.id("loginbutton")).click();
	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\FF-54\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Enter valid  browser name");
		}
		
		// type URL
		driver.get("https://www.facebook.com/");
		// Maximize the window
		//driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
		
	}

	@AfterMethod
	public void takescreen() throws IOException, Exception
	{
		Date d = new Date();
		System.out.println(d);// Wed Sep 26 04:13:09 BST 2018

		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
		String myTime = df.format(d);
		System.out.println(myTime);// 2018_09_26_04_15_17
	
		Thread.sleep(3000);
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(".\\screenshots\\"+"FACEBOOK"+"_"+myTime+".png"));
	
	}}
