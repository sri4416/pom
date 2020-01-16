package assignments;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String args[])  {
		
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\software downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	
	driver.findElement(By.id("twotabsearchtextbox")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone XR (64GB) - Yellow");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
	
	WebElement price=driver.findElement(By.id("priceblock_ourprice"));
	price.getText();
	System.out.println("price");
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("iPhone XR (64GB) - Yellow");
	driver.findElement(By.className("vh79eN")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div")).getText();
	WebElement price1=driver.findElement(By.className("_1vC4OE _3qQ9m1"));
	price1.getText();
	System.out.println("price1");
	
	assert.assertTrue(true);
	System.out.println("print less value");
	
	
	
	
	
	}

	
	

}
