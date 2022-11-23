package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		
		ArrayList<String> list = new ArrayList<String>();
        
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		for (WebElement web : alloptions) {
			String text = web.getText();
			list.add(text);
		}
		Collections.sort(list);// All are printing in alphabatical order
		for (String altext : list) {
			System.out.println(altext);
		
		}
		
		
		driver.close();
       
	}
     

}
