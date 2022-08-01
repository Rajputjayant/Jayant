package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.redbus.in/");
   Thread.sleep(2000);
   driver.navigate().back();
   Thread.sleep(2000);
   driver.navigate().forward();
   Thread.sleep(2000);
   driver.navigate().refresh();
   String title = driver.getTitle();
   System.out.println(title);
   String url = driver.getCurrentUrl();
   System.out.println(url);
   driver.close();

	}

}
