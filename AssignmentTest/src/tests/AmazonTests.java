package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Amazon;
import pom.common.BaseTest;

public class AmazonTests extends BaseTest{
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		init();
		
	}
	
	@Test
	public void gotoAmazon() {
		Amazon a=PageFactory.initElements(driver, Amazon.class);
		a.search();
		a.getPrice();
	}
	
	@Test
	public void assertion_method() {
		assert.assertEquals(price, price1);
	}
	@Test
	public void lessPrice() {
		int a=47900,b=53999;
		if(a>b) {
			System.out.println("print a value");
		}
	}
	
	@AfterClass
	public void closeBrowser() {
		quit();
	}

}
