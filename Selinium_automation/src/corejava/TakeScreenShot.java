package corejava;

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
import org.openqa.selenium.support.ui.Select;

public class TakeScreenShot {
	
	static WebDriver driver;

	public void takeScreenshot(String name) throws IOException, Exception
	{
		Date d = new Date();
		System.out.println(d);// Wed Sep 26 04:13:09 BST 2018

		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
		String myTime = df.format(d);
		System.out.println(myTime);// 2018_09_26_04_15_17
	
		Thread.sleep(3000);
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(".\\screenshots\\"+name+"_"+myTime+".png"));
	}
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Oct");
		new Select(driver.findElement(By.id("day"))).selectByIndex(9);
		new Select(driver.findElement(By.id("year"))).selectByValue("2017");
		
		TakeScreenShot ts = new TakeScreenShot();
		ts.takeScreenshot("Face Book");
		
	}

}
