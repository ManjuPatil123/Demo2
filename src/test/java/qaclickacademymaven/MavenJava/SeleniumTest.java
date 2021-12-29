package qaclickacademymaven.MavenJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

	WebDriver driver;
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("OpenBrowser Method--- BeforeSuite");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeTest
	public void enterApplicationUrl()
	{
		System.out.println("Before Test---");
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	@Test
	public void loginwithvalidDetails() throws InterruptedException
	{

		System.out.println("Login with Valid Details");

		driver.findElement(By.name("userName")).sendKeys("QQQQQ");
		driver.findElement(By.name("password")).sendKeys("qqqqq");
		driver.findElement(By.name("submit")).click();

	}
}
