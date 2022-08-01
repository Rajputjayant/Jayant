package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement emailtb;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement passtb;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	private WebElement logintb;
	
	public Flipkart(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void emailid(String un){
		emailtb.sendKeys(un);
	}
	public void password(String ps) {
		 passtb.sendKeys(ps);
	}
	public void loginbutton() {
		logintb.click();
	}

}
