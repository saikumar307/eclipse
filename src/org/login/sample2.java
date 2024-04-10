package org.login;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class sample2 {
	public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.snapdeal.com/");
			driver.manage().window().maximize();
			
			WebElement user = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
			user.sendKeys("kurtha");
			
			WebElement pass = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
			pass.click();
			
			WebElement phno = driver.findElement(By.xpath("//span[text()='Sign In']"));
			phno.click();
			Thread.sleep(2000);
			WebElement btn = driver.findElement(By.xpath("//p[@class='product-title']"));
			btn.click();
			



	   }

}
