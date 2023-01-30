package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com/login");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("notification@ftxtradingsoftware.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login here.")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("notification@ftxtradingsoftware.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Activation8903233335");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.quit();
					
		}

}
