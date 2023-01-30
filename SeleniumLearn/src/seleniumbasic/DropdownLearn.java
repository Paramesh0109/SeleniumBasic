package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

		WebElement enquiry = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a"));
		enquiry.click();
		Thread.sleep(2000);

		WebElement create = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/ul/li[1]/a"));
		create.click();
		Thread.sleep(2000);

		WebElement addnew = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[5]/div/div[2]/button[1]"));
		addnew.click();
		Thread.sleep(2000);

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"select2-country_val-container\"]/span"));
		dropdown.click();

		Select selectcountry = new Select(dropdown);
		/*selectcountry.selectByIndex(2);
		Thread.sleep(2000);

		selectcountry.selectByVisibleText("Mexico");
		Thread.sleep(2000);*/
		WebElement entervalue = driver.findElement(By.className("select2-search__field"));
		entervalue.sendKeys("Mexico");

		List<WebElement> countrylist = selectcountry.getOptions();
		int countrycount = countrylist.size();
		System.out.println("The Country count is : " + countrycount);






	}

}
