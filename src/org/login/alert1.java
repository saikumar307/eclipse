package org.login;

	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class alert1 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			driver.manage().window().maximize();
			WebElement enter = driver.findElement(By.xpath("(//a[@data-toggle='tab']) [2]"));
			enter.click();
			
			WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			login.click();
			
			Alert a = driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
	}

}
