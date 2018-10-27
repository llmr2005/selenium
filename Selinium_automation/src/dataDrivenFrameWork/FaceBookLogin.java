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

public class FaceBookLogin {

	public static void main(String[] args) throws IOException, JXLException {
		// TODO Auto-generated method stub
        FileInputStream fi = new FileInputStream(".\\testdata\\inputdata.xls");
        Workbook w = Workbook.getWorkbook(fi);
        Sheet s = w.getSheet("Sheet1");
        
        

		// webdriver object
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//type URL
		driver.get("https://www.facebook.com/");
		//Maximize the window
		driver.manage().window().maximize();
		
		//get current URL and print
		String currenturl = driver.getCurrentUrl();
		System.out.println("currenturl:" +currenturl);
		//get current Title and print
		String currenttitle = driver.getTitle();
		System.out.println("currenttitle:" +currenttitle);
		
		
		//send data
		driver.findElement(By.id(s.getCell(4,2).getContents())).sendKeys(s.getCell(5,2).getContents());
		driver.findElement(By.name(s.getCell(4,3).getContents())).sendKeys(s.getCell(5,3).getContents());
		driver.findElement(By.id(s.getCell(4,4).getContents())).click();
		//driver.close();
		
		driver.quit();
		
	}

}
