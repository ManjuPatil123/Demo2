package qaclickacademymaven.MavenJava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void m1()
	{
		System.out.println("Login test sucess");

	}
	@AfterTest
	public void  dbConnectionClose()
	{
		System.out.println("DB Connection Close");
	}
}
