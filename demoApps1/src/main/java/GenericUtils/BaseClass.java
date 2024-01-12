package GenericUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import GenericUtils.FileUtility;

public class BaseClass {
     public static WebDriver driver;
	  FileUtility f=new FileUtility();
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Data Base connection is achieved");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("For parallel execution, before test");
	}
	@BeforeClass
	public void beforeClass() throws IOException
	{
		String browser=f.fatchDataFromProperityFile("browser");
		String url=f.fatchDataFromProperityFile("url");
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is my method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is after method");
	}
	@AfterClass
	public void afterClass()
	{
		driver.quit();
		System.out.println("close the browser");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after test");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This is after suite");
	}
	

}
