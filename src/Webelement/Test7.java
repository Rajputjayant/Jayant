package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement srachtb = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		
       if (srachtb.isDisplayed()) {
    	   
    	   System.out.println("Pass: element is displayed");
    	   srachtb.sendKeys("cloths");
		
	} else {
            System.out.println("Fail: element is not displayed");
	}

	}

}
