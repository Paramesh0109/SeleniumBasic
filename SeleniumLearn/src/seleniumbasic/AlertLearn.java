package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearn {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.driver.chrome", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://staffdesk.ftxtradingsoftware.com/");
		Thread.sleep(5000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("praveenpk@gleamglobalservicesindia.com");

		WebElement pwd = driver.findElement(By.id("password-field"));
		pwd.sendKeys("c84YYmdEH");

		WebElement login = driver.findElement(By.className("acceptBtn"));
		login.click();
		Thread.sleep(2000);

		WebElement clientstatus = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[6]/a/span"));
		clientstatus.click();
		Thread.sleep(2000);

		WebElement actcmp = driver.findElement(By.xpath("//*[@id=\"list-tab\"]/a[10]"));
		actcmp.click();
		Thread.sleep(2000);

		WebElement iconclk = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_10\"]/tbody/tr/td[1]/h6/span/i"));
		iconclk.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(2000);		
		
		driver.quit();
			

	}

}

