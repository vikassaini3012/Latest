package org_testing_scripts_youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 {
	
public ChromeDriver driver;   

@BeforeMethod	//BrowserLaunc + URL hit
public void beformethod()
{
	System.setProperty("webdriver.chrome.driver","C:\\JavaTraining\\chromedriver_win32\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	System.out.println("Path---->" + driver.getCurrentUrl());	
}
@Test	//Login + Trending Click
public void testcase1()
{
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//Login process
		driver.findElementByCssSelector("paper-button[id='button']").click();
		driver.findElement(By.id("identifierId")).sendKeys("saini.vikas.3012@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("wait is over");
		driver.findElementByXPath("//input[@name='password']").sendKeys("Vikas123$");
		
		//driver.findElement(By.name("password")).sendKeys("Vikas123$");
		driver.findElement(By.id("passwordNext")).click();
		
		//CLICK ON TRENDING
		driver.findElementByXPath("//span[text()='Vikas_Nov-2018']").click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Play video
		driver.findElementByXPath("//span[contains(text(),'Kar Har Maidaan Fateh')]").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//subscribed channel
		//driver.findElementByXPath("//paper-button[@aria-label='Unsubscribe from T-Series.']").click();
		//driver.findElementByXPath("//paper-button[@aria-label='Subscribe to T-Series.']").click();
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//yt-button-renderer[@class = 'style-scope ytd-subscribe-button-renderer']").click();
		
		driver.findElementByXPath("//yt-formatted-string[contains(text(),'Subscribe')]").click();
		
	
	}

@AfterMethod 	//browser close
public void aftermethod()
{
	//driver.close();
	System.out.println("End of Flow");
	

}	

}
