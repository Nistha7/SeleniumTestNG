package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinks {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> allTags= driver.findElements(By.tagName("a"));
		System.out.println("Total tags: "+allTags.size());
		
		for(WebElement ele: allTags) {
			System.out.println(ele.getAttribute("href"));
			System.out.println(ele.getText());
		}
		
	}

}
