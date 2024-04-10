package org.login;

	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class redBus {

	
	public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.redbus.in/");
			driver.manage().window().maximize();
			
			
			
			WebElement from = driver.findElement(By.id("src"));
			from.sendKeys("secundrabad");
			
			
			WebElement to = driver.findElement(By.id("dest"));
			to.sendKeys("machilipatnam");
			
			
			
			WebElement login1 = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
			login1.click();
			
			
			WebElement login = driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH']"));
			login.click();
			Thread.sleep(2000);
			
			
			
			WebElement btn = driver.findElement(By.id("search_button"));
			btn.click();
			

			Alert a =driver.switchTo().alert();
			String text = a.getText();
			
			System.out.println(text);
			a.accept();
			
						
			
	  }


}
