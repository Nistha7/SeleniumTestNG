package testngWithSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class Assignment {
	
	@Test
	public void seleniumTest() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//String title=driver.getTitle();
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		//Thread.sleep(1000);
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[14]/div"));
		js.executeScript("arguments[0].scrollIntoView();",text);
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Televisions")).click();  
		Thread.sleep(1000);
		
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-size-base a-color-base a-text-bold' and text()='Brands']")));
		WebElement category=driver.findElement(By.xpath("//span[@class='a-size-base a-color-base a-text-bold' and text()='Brands']"));
		js.executeScript("arguments[0].scrollIntoView();",category);
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and text()='Samsung']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click(); 
		//Thread.sleep(1000);
		
		driver.findElement(By.id("s-result-sort-select_2")).click(); 
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]")).click(); 
		//Thread.sleep(1000);
		
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		WebElement about=driver.findElement(By.id("feature-bullets"));
		js.executeScript("arguments[0].scrollIntoView();",about);
		//Thread.sleep(2000);
		
		Assert.assertEquals(true, about.isDisplayed());
		
		System.out.println(about.getText());
		
	
		driver.quit();
	}

}
