package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.id("email"));
		
		if (username.isEnabled()) {
			
			System.out.println("pass: element is enabled");
			username.sendKeys("Jayant");
			
		} else {
            System.out.println("fail:element is disable");
		}
		
		driver.close();
		

	}

}
