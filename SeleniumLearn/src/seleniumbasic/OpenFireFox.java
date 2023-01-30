package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gekco.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\GeckoDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com/login");
		Thread.sleep(3000);
		driver.quit();

	}

}
