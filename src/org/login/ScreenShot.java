package org.login;

	import java.io.File;
	import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScreenShot {
		public static void main(String[] args) throws  IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			TakesScreenshot sc = (TakesScreenshot)driver;
			File src = sc.getScreenshotAs(OutputType.FILE);
			
			File dess = new File("C:\\Users\\chsai\\eclipse-workspace\\seleniumRevision\\screenshot\\kumar.png");
			FileUtils.copyFile(src, dess);
			
	}


}
