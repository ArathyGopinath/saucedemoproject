package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browserload {
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	}

	@Test
	public void test1()
	{
	driver.findElement(By.id("email")).sendKeys("arathy@123");
	driver.findElement(By.id("pass")).sendKeys("arathy123");;
	driver.findElement(By.name("login")).click();
	}				
}
