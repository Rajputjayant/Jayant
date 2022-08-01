package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.redbus.in/");
       Thread.sleep(2000);
       driver.navigate().to("https://www.amazon.com/");
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(2000);
       driver.navigate().refresh();
       Thread.sleep(2000);
       String title = driver.getTitle();
       System.out.println(title);
       driver.close();

	}

}
