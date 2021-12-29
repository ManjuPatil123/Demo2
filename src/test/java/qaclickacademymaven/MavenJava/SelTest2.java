package qaclickacademymaven.MavenJava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SelTest2 {

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
	@Test
	public void m2()
	{
		System.out.println("Login test sucess");

	}
}
