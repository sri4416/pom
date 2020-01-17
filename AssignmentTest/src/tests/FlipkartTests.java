package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Flipkart;
import pom.common.BaseTest;

public class FlipkartTests extends BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		init();
		
	}
	
	@Test
	public void gotoFlipkart() {
		Flipkart f=PageFactory.initElements(driver, Flipkart.class);
		f.search();
		f.getPrice();
	}
	
	@AfterClass
	public void closeBrowser() {
		quit();
	}
	
	
	
	

}
