package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys("9752846039");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Jayant@97");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

	}

}
