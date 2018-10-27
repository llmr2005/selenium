package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validation_Sample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.justrechargeit.com/SignIn.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("imgbtnSignin")).click();
        String actualresult = driver.findElement(By.xpath("//*[@id=\'MessageCaption2\']")).getText();
        System.out.println("Display message:"+actualresult);
        String expectedvalue = "Enter your email.";
       // if (actualresult.equals(expectedvalue)) {
        if(actualresult.contains("email")) {
        	System.out.println("Both messages are matching");
			
		} else {
			System.out.println("Both messages are not matching");
		}
        
      //*[@id="MessageCaption2"]
		// driver.findElement(By.id("txtUserName")).sendKeys("llmr2005@gmail.com");
		// driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		// driver.findElement(By.id("imgbtnSignin")).click();
		
	}

}