package org.login;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class draganddrop {
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			Actions a = new Actions(driver);
					
			driver.manage().window().maximize();
			WebElement enter = driver.findElement(By.id("heading304"));
			a.contextClick(enter).perform();
			
			Robot r = new Robot();
			for (int i = 0; i <8; i++) {
				 r.keyPress(KeyEvent.VK_DOWN);
				 Thread.sleep(5000);
				 r.keyRelease(KeyEvent.VK_DOWN);
				 
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);	 
			}	
		}

	

			
	}
	
	

	

	

	
	