package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Get ')]"));
		System.out.println(ele.getText());
		
		WebElement usersrch = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		Point loc = usersrch.getLocation();
		int x = loc.getX();
		System.out.println("x-cooridinate"+x);
		int y = loc.getY();
		System.out.println("y-cooridinate"+y);
		
		WebElement login = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		 Dimension s = login.getSize();
		int h = s.getHeight();
		System.out.println("height of the element"+h);
		int w = s.getWidth();
		System.out.println("width of the element"+w);
		
		WebElement psw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		System.out.println(psw.getAttribute("autocomplete"));
		driver.close();
		

	}

}
