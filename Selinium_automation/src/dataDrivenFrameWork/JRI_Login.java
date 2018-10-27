package dataDrivenFrameWork;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class JRI_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fi = new FileInputStream(".\\testdata\\jclinputdata.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Sheet s1 = w.getSheet("retesting");
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.justrechargeit.com/SignIn.aspx");
        driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).sendKeys("llmr2005@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		driver.findElement(By.id("imgbtnSignin")).click();
		driver.findElement(By.xpath("//*[@id=\'divLnkAddMobile\']/a")).click();
		driver.findElement(By.id("txtpopMobileNo")).sendKeys("9465432891");
		new Select(driver.findElement(By.xpath("//*[@id=\'ddlpopMobileSP\']"))).selectByValue("2");
		// how to check provider details displayed ?
		
		Thread.sleep(3000);
		if (driver.findElement(By.id("ddlpopMobileLocation")).isDisplayed()) {
			System.out.println("Location element displayed");
			new Select(driver.findElement(By.id("ddlpopMobileLocation"))).selectByValue("7");
			
		} else {
			System.out.println("Location element not displayed");
		}
		driver.findElement(By.id("txtpopMobileNickname")).sendKeys("mohan");
		driver.findElement(By.id("btnPopupAddMobile")).click();
	}

}
