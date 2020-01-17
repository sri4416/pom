package pom.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;
	
	public void init() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\software downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	}
	
	public void quit() {
		driver.quit();
	}

}
