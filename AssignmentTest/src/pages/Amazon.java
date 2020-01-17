package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Amazon {
	public Amazon(WebDriver driver) {
		
	}
	
	@FindBy(how=How.ID,using="search")
	WebElement twotabsearchtextbox;
	@FindBy(how=How.ID,using="search")
	WebElement fieldkeywords;
	@FindBy(how=How.XPATH,using="submit")
	WebElement input;
	
	public void search() {
		twotabsearchtextbox.click();
		fieldkeywords.sendKeys("iPhone XR (64GB) - Yellow");
		input.click();
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="a-section a-spacing-none")
	WebElement phone;
	@FindBy(how=How.ID,using="priceblock_ourprice")
	WebElement price;
	public void getPrice() {
		phone.click();
		price.getText();
		System.out.println("price");
		
	}

}
