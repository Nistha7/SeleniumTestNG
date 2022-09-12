package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		//---- Single select dropdown-----
		WebElement ddown=driver.findElement(By.id("select-demo"));
		Select select=new Select(ddown);
		
		select.selectByValue("Monday");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Wednesday");
		Thread.sleep(2000);
		
		select.selectByIndex(5);
		
		//------multi select dropdown------
		
		WebElement mdown=driver.findElement(By.id("multi-select"));
		Select multiSelect=new Select(mdown);
		
		multiSelect.selectByValue("California");
		Thread.sleep(2000);
		
		multiSelect.selectByVisibleText("Florida");
		Thread.sleep(2000);
		
		multiSelect.selectByIndex(5);
		
		List<WebElement> allElements=multiSelect.getAllSelectedOptions();
		System.out.println(allElements.size());
		
		multiSelect.deselectAll();
		Thread.sleep(2000);
		multiSelect.selectByValue("California");
		Thread.sleep(2000);
		multiSelect.selectByIndex(5);
		Thread.sleep(2000);
		
		multiSelect.deselectByIndex(5);
		Thread.sleep(2000);
		
		List<WebElement> allElements1=multiSelect.getAllSelectedOptions();
		System.out.println(allElements1.size());
		//driver.close();
		
		//*[@id="field26"]/div/select
	}

}
