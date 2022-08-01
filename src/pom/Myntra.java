package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myntra {
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profiletb;

}
