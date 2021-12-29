package qaclickacademymaven.MavenJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium2Test {

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
	@BeforeClass
	public void maximizewindow()
	{
		System.out.println("Before Class");
		driver.manage().window().maximize();
	}
	@Test
	public void loginwithvalidDetails() throws InterruptedException
	{

		System.out.println("Login with Valid Details");

		driver.findElement(By.name("userName")).sendKeys("QQQQQ");
		driver.findElement(By.name("password")).sendKeys("qqqqq");
		driver.findElement(By.name("submit")).click();

	}
	@AfterTest
	public void  dbConnectionClose()
	{
		System.out.println("DB Connection Close");
	}
}
