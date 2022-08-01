package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement Srachtb = driver.findElement(By.name("email"));
		 
		 Point loc = Srachtb.getLocation();
		int x = loc.getX();
		System.out.println("x-coordinates"+ x);
		int y = loc.getY();
		System.out.println("y-coordinates"+ y);
		driver.close();

	}

}
