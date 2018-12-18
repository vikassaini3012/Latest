package org_testing_scripts_youtube;

import org.testng.annotations.Test;

import org_testing_utilities.ScreenShots;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testin 
{ 
	public ChromeDriver driver;   

@Test
public void testing() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaTraining\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println("Path---->" + driver.getCurrentUrl());	
		System.out.println("testing class run");
		
		driver.findElementByXPath("//yt-formatted-string[text()='Sign in']").click();
	    driver.findElement(By.id("identifierId")).sendKeys("saini.vikas.3012@gmail.com");
	    driver.findElement(By.id("identifierNext")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElementByXPath("//input[@name='password']").sendKeys("Vikas123$");
		driver.findElement(By.id("passwordNext")).click();
		
	    
		
	////Play video
				driver.findElementByXPath("//span[text()='Vikas_Nov-2018']").click();
				System.out.println("PlayVideo-->" + driver.getCurrentUrl());
				ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\Playvideopage_01.png");
				Thread.sleep(3000);
				driver.findElementByXPath("//yt-formatted-string[contains(text(),'PLAY ALL')]").click();
			//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(driver.getCurrentUrl());
				System.out.println(">>>>>>>>>>>>>>>>>>Play Video---------------");
				Thread.sleep(3000);
				ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\Playvideopage_02.png");

			
//subscription video
				Thread.sleep(1000);
				ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\subscription_01.png");
//				driver.findElementByXPath("//div[@id='subscribe-button']").click();
				
				//WebElement sub = driver.findElementByXPath("//paper-button[@aria-label='Subscribe to T-Series.']");
			
				//WebElement sub = driver.findElementByXPath("//paper-button[contains(@aria-label,'Subscribe to')]");
				//sub.click();
				
				
				WebElement sub = driver.findElementByXPath("//paper-button[contains(@aria-label,'Unsubscribe from')]");
				sub.click();
				
				
//alert
				WebElement agg = driver.findElementByXPath("//yt-button-renderer[@id='confirm-button']");
				agg.click();
				

}
}


