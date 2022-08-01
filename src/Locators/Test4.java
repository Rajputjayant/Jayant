package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("9752846039");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("12345678");
//		driver.findElement(By.cssSelector("button[name=\"login\"]")).click();
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Facebook – log in or sign up")) {
			
			System.out.println("Pass- Home page is displayed");
			
		} else {
              System.out.println("Fail-Home page is not displayed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
