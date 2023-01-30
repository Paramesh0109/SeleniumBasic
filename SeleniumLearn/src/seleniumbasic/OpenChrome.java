package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
					
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com/login");
		Thread.sleep(3000);
		driver.quit();
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("notification@ftxtradingsoftware.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Activation8903233335");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}

}
