package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class Fetchingdatafrompropertiesfilepractice
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
//		FileInputStream fis = new FileInputStream("C:\\Users\\VISHAL\\Desktop\\Selenium sec3\\CommonTestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String value = prop.getProperty("url");
//		String UN = prop.getProperty("username");
//		String PWD = prop.getProperty("password");
		PropertiesUtility pUtil = new PropertiesUtility();
		String value = pUtil.getDataFromPropertiesFile("url");
		driver.get(value);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		
		
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(UN, Keys.TAB, PWD, Keys.ENTER);

	}

}
