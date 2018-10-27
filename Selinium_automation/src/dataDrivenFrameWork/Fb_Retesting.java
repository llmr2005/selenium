package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Fb_Retesting {

	public static void main(String[] args) throws Exception {
		String results= null;

		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream(".\\testdata\\inputdata.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Sheet s1 = w.getSheet("retesting");
		
		FileOutputStream fo = new FileOutputStream(".\\testdata\\Fb_RetestingOutput.xls");
		WritableWorkbook ww = Workbook.createWorkbook(fo);
		WritableSheet ws = ww.createSheet("FBRetesting",0);
		

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

			// validating signup element
			if (driver.findElements(By.xpath("//*[@id=\'blueBarDOMInspector\']/div/div[2]/div/div/span/a")).size() > 0) {
				System.out.println("Given details are invalid");
				results = "Fail";
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
			} else {
				System.out.println("Given details are valid");
				results = "Pass";
			}
			
			//sen status to newly created sheet(ws)
			Label res = new Label(2, i, results);
			ws.addCell(res);
			
			//get the data from existing excel sheet
			//nested for loop: loop within the loop
			for (int j = 0; j < s1.getColumns(); j++) {
				
				Label a = new Label(j, i, s1.getCell(j, i).getContents());
				ws.addCell(a);
				
			}//J for loop end
			
		}//I for loop end
		
		Label un = new Label(0, 0, "UserName");
		Label pwd = new Label(1, 0, "Password");
		Label rs = new Label(2, 0, "Results");
		ws.addCell(un);
		ws.addCell(pwd);
		ws.addCell(rs);
		
		ww.write();
		ww.close();
		
		driver.quit();
	}

}
