package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment {
	
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisjain4\\Downloads\\chromedriver\\chromedriver.exe");
		//driver.findElements(By.linkText("shop by department")); 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String title=driver.getTitle();
		
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		Thread.sleep(1000);
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[14]/div"));
		js.executeScript("arguments[0].scrollIntoView();",text);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")).click();
		driver.findElement(By.linkText("Televisions")).click();  
		Thread.sleep(2000);
		
		WebElement category=driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[21]/div"));
		js.executeScript("arguments[0].scrollIntoView();",category);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[21]/ul/li[5]/span/a/div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.id("s-result-sort-select_2")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]")).click(); 
		Thread.sleep(2000);
		
		
		// Store the current window handle
		//String winHandleBefore = driver.getWindowHandle();
		
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		WebElement about=driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]"));
		js.executeScript("arguments[0].scrollIntoView();",about);
		Thread.sleep(2000);
		System.out.println(about.getText());
		
		// Switch back to original browser (first window)
		//driver.switchTo().window(winHandleBefore);
		driver.quit();
	}

}
