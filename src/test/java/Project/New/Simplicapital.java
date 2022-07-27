package Project.New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Simplicapital {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	}
	@BeforeMethod
	public void testcase1() throws InterruptedException {
		driver.get("https://dev2-app.simplicapital.ai/");
		Thread.sleep(3000);
	}
	
	
	@Test(dataProvider="loginCredentials")
	public void testcase2(String uname,String pwd) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(9000);
	  //  boolean logo= driver.findElement(By.xpath("(//img[@alt='SimpliCapital'])[1]")).isDisplayed();
	  //  Assert.assertTrue(logo);
		
			}
	
	
	
	@DataProvider
	public static Object[][] loginCredentials(){
		
		return new Object[][] {{"nilesh.dhale+33333@kilowott.com","Nilesh@123"},{"nilesh.dhale+33322@kilowott.com","Nilesh@123"},{"nilesh.dhale+33311@kilowott.com","Nilesh@123"}};
		
		
	}
	@Test
	
	
	@AfterMethod
	public void testcase5() throws InterruptedException {
		driver.findElement(By.className("profile-image")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
		Thread.sleep(9000);
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	
	

}
