package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FaceBookLoginretesting {

	public static void main(String[] args) throws IOException, JXLException, Exception {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream(".\\testdata\\inputdata.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Sheet s1 = w.getSheet("retesting");

		// webdriver object
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// type URL
		driver.get("https://www.facebook.com/");
		// Maximize the window
		driver.manage().window().maximize();

		// get current URL and print
		String currenturl = driver.getCurrentUrl();
		System.out.println("currenturl:" + currenturl);
		// get current Title and print
		String currenttitle = driver.getTitle();
		System.out.println("currenttitle:" + currenttitle);

		for (int i = 1; i < s1.getRows(); i++) {

			// send data
			driver.findElement(By.id(s.getCell(4, 2).getContents())).clear();
			driver.findElement(By.id(s.getCell(4, 2).getContents())).sendKeys(s1.getCell(0, i).getContents());
			driver.findElement(By.name(s.getCell(4, 3).getContents())).clear();
			driver.findElement(By.name(s.getCell(4, 3).getContents())).sendKeys(s1.getCell(1, i).getContents());
			driver.findElement(By.id(s.getCell(4, 4).getContents())).click();
			// driver.close();
			Thread.sleep(5000);
			
			//validating signup element
			if (driver.findElements(By.xpath("//*[@id=\'blueBarDOMInspector\']/div/div[2]/div/div/span/a")).size()>0) {
				System.out.println("Given details are invalid");
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
			} else {
				System.out.println("Given details are valid");
			}
		}
		driver.quit();

	}

}
