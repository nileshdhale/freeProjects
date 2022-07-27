package Project.New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "\\C:\\Users\\Shree\\Documents\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alpha.skillbuilder.io/"); 
		

	}
	
}
//C:\Users\Shree\Documents\geckodriver-v0.31.0-win64
//C:\\Users\\Shree\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe