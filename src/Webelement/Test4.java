package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		WebElement wele = driver.findElement(By.id("password"));
		wele.clear();
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}

}
