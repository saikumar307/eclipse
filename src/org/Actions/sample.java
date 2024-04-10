package org.Actions;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class sample {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			driver.manage().window().maximize();
			
			WebElement courses = driver.findElement(By.xpath("//div[text()='Courses ']"));
			WebElement oracle = driver.findElement(By.xpath("//div[@title='Oracle']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(courses).perform();
			a.moveToElement(oracle).perform();
		}


}
