package Sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationPractice 
{
	
	@Test
	public void test()
	{
		System.out.println("In test method");
	}
	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("In before suite");
	}
	
	@BeforeClass
	public void bcConfig()
	{
		System.out.println("In before class");
	}
	
	@BeforeMethod
	public void bmConfig()
	{
		System.out.println("In before method");
	}
	
	@AfterMethod
	public void amConfig()
	{
		System.out.println("In after method");
	}
	
	@AfterClass
	public void acConfig()
	{
		System.out.println("In after class");
	}
	
	@AfterSuite
	public void asConfig()
	{
		System.out.println("In after suite");
	}
	
}
