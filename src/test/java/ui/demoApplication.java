package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoApplication {
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisjain4\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		String pageSource=driver.getPageSource();
		driver.navigate().to("google.com");
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[14]/div\"]"));
		driver.findElements(By.linkText("shop by department")); 


		
		driver.quit();
	}

}
