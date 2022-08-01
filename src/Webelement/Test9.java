package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	    WebElement ratiobutton = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
	    
	    if (ratiobutton.isSelected()) {
	    	
	    	System.out.println("pas:element is pass");
	    	ratiobutton.click();
		} else {
			
			System.out.println("fail:element is fail");

		}
	    
	    driver.close();
	    
		

	}

}
