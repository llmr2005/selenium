package webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		// Launch Browserdriver
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Launch Url
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// parent window name
		String ParentWindow = driver.getWindowHandle();//single window(mainwindow name)  E.g: abc

		// get the child window names
		Set<String> allWindows = driver.getWindowHandles();//get all the child and parent window names: 4 windownames (it contains abc)

		for (String ChildWindow : allWindows) {

			if (!ChildWindow.equals(ParentWindow)) {

				driver.switchTo().window(ChildWindow);
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(5000);
			} // if condition end

		} // for loop end

		// move cursor point to parent window
		driver.switchTo().window(ParentWindow);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='p0widget']/div/div[1]/div/input")).click();

	}

}
