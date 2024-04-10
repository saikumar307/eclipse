package org.login;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("saikumar");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345678");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		login.click();
		driver.close();
}
}
