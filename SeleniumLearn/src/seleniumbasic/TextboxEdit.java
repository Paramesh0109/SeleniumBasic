package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxEdit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com/login");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("notification@ftxtradingsoftware.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Activation8903233335");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		
		WebElement enquiry = driver.findElement(By.xpath("//html/body/div[2]/div/aside/ul/li[2]/a/span[1]"));
		enquiry.click();
		Thread.sleep(2000);
		
		WebElement complete = driver.findElement(By.xpath("//*[text()='Completed']"));
		complete.click();
		Thread.sleep(2000);
		
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a/i"));
		icon.click();
		Thread.sleep(2000);
		
		WebElement rate = driver.findElement(By.xpath("//*[@id=\"headingOne\"]/h5/a"));
		rate.click();
		Thread.sleep(2000);
		
		WebElement gettxt = driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[7]/div/p"));
		String text = gettxt.getAttribute("class");
		System.out.println(text);
		
		WebElement disabled= driver.findElement(By.className("mb-0"));
		boolean enable = disabled.isEnabled();
		System.out.println(enable);
			
		Thread.sleep(2000);
		
		driver.quit();
			

	}

}
