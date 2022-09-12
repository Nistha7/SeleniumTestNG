package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//WebElement password=driver.findElement(By.id("password"));
		//driver.findElement(withTagName("input").below(password)).click();
		//By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		

	
		driver.close();
	}

}
