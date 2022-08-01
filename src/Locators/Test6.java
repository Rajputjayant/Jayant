package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("9752846039");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Jayant@97");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		

	}

}
