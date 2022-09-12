package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggesDropDown {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement input=driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		
		input.sendKeys("Sydeny");
		Thread.sleep(2000);
		
		input.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.close();
	}

}
