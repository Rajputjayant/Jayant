package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Login = driver.findElement(By.name("login"));
		
		Dimension s = Login.getSize();
		int h = s.getHeight();
		System.out.println("height of the element"+ h);
		
		int w = s.getWidth();
		System.out.println("width of the element"+ w);
		
		driver.close();
	}

}
