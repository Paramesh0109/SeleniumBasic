package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonLearn {

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

		// 1. Find the Button position 

		WebElement getposition =driver.findElement(By.xpath("//button[@type='button']"));
		Point xypoint = getposition.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();

		System.out.println("X Value is " + xvalue);
		System.out.println("Y value is " + yvalue);

		// 2. Find the button color

		/*WebElement enquiry = driver.findElement(By.className("nav-text"));
		enquiry.click();

		WebElement create = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/ul/li[1]/a"));
		create.click();*/

		WebElement getcolor = driver.findElement(By.xpath("//button[@type='button']"));
		String color = getcolor.getCssValue("background-color");
		System.out.println("Button Color is : " + color);


		// 3. Find the button Size

		WebElement getsize = driver.findElement(By.xpath("//button[@type='button']"));
		int height = getsize.getSize().getHeight();
		int width = getsize.getSize().getWidth();
		System.out.println("The Button Height is : " +height);
		System.out.println("The Button width is : " +width);

		driver.quit();



	}

}
