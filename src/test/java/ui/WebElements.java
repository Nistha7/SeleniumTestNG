package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("Testing");
		//driver.findElement(By.name("firstname")).clear();//*[@id="field0"]/div/input
		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).isSelected());
		
		//driver.close();
		
		//*[@id="field26"]/div/select
	}

}
