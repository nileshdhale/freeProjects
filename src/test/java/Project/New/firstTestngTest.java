package Project.New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTestngTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("https://alpha.skillbuilder.io/");
		driver.manage().window().maximize();
		
	                       }
	@Test
	public void firstTest() {
		String tile=driver.getTitle();
		System.out.println(tile);
		
	}
	
	@AfterTest
	public void teardown()   {
		driver.close();
		
	                        }

}
