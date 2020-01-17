package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Flipkart {
public Flipkart(WebDriver driver) {
		
	}
	
    @FindBy(how=How.NAME,using="q")
    WebElement text;
    @FindBy(how=How.NAME,using="q")
    WebElement type;
    @FindBy(how=How.CLASS_NAME,using="vh79eN")
    WebElement input;
    @FindBy(how=How.CLASS_NAME,using="_3wU53n")
    WebElement phone;
	public void search() {
		text.click();
		type.sendKeys("iPhone XR (64GB) - Yellow");
		input.click();
		phone.click();
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="_1vC4OE _3qQ9m1")
	WebElement price;
	public void getPrice() {
		price.getText();
		System.out.println("price");
		
	}

}
