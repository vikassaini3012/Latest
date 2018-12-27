package org_testing_base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org_testing_utilities.ScreenShots;
public class BasicInfo
{
	public ChromeDriver driver;  
	public Properties pr;
	
	@BeforeMethod	//BrowserLaunc + URL hit
		public void beformethod() throws IOException, Exception
		{
		//Code start for loading Properties.
			File f = new File("C:\\JavaTraining\\EclipseWorkSpace\\org_testing_youtube\\OR.properties");
			FileInputStream fi = new FileInputStream(f); 
			pr = new Properties();
			pr.load(fi);	
		
		//Code End for loading Properties.
			

			
			System.setProperty("webdriver.chrome.driver","C:\\JavaTraining\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
			
			 	
			
	            
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			
			System.out.println("URL Being used --->>>>> " + driver.getCurrentUrl());	
			Thread.sleep(1500);
//			ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\01_HomePage.png");
		}

	@AfterMethod //browser close
		public void aftermethod()
		{
			System.out.println("----------After Method Suit Executed------------");	
		//	driver.close();
			driver.quit();
			System.out.println("Flow End and Browser closed.......End of Flow");
		}	
		
}
