package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\software downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tripadvisor.in/");
		
        driver.findElement(By.xpath("//div[@title='Search']")).click();
		driver.findElement(By.id("mainSearch")).sendKeys("club mahindra");
		driver.findElement(By.id("SEARCH_BUTTON_CONTENT")).click();
		driver.findElement(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		
		driver.findElement(By.xpath("//*[@id=\"component_11\"]/div/div[2]/div/div[2]/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"bubble_rating\"]")).click();
		driver.findElement(By.id("ReviewTitle")).sendKeys("Greenary");
		driver.findElement(By.id("ReviewText")).sendKeys("The resort covered by all the greenary");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//*[@id=\"qid12_bubbles\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"qid47_bubbles\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"qid14_bubbles\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"DQ_TAGRADIO\"]/div[2]/div[2]")).click();
		driver.findElement(By.className("checkbox")).click();
		driver.findElement(By.id("SUBMIT")).click();
		
		
		
		

	}

}
