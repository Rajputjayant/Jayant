package dropdown;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		TreeSet<String> set = new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> aloptions = s.getOptions();
		for (WebElement webele : aloptions) {
			String text = webele.getText();
			set.add(text);
		}
		 for (String web : set) {
			System.out.println(web);
		}

	}

}
