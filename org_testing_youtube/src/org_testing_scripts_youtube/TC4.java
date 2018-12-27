package org_testing_scripts_youtube;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org_testing_base.BasicInfo;
import org_testing_pages.Login_page;
import org_testing_pages.Logout_page;
import org_testing_utilities.Logs;
import org_testing_utilities.ScreenShots;

public class TC4 extends BasicInfo
{
	

@Test	//Login + Trending Click
	public void testcase1() throws IOException, Exception
	{

//	try
//	{
		
	System.out.println(">>>>>>>>>>>>>>>>>>Test Case4 Execution Started---------------");
//Login	
		System.out.println(">>>>>>>>>>>>>>>>>>Ready for Login---------------");
		Login_page login1 = new Login_page(driver, pr);
		login1.signin(pr.getProperty("username"), pr.getProperty("password"));
		System.out.println(">>>>>>>>>>>>>>>>>>Signup Successful---------------");		
		Logs.take_log("TC4","Login Succesfful");	
	////Play video
		driver.findElementByXPath("//span[text()='Vikas_Nov-2018']").click();
		System.out.println("PlayVideo-->" + driver.getCurrentUrl());
		Thread.sleep(1500);
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\Playvideopage_01.png");
		Thread.sleep(3000);
		driver.findElementByXPath("//yt-formatted-string[contains(text(),'PLAY ALL')]").click();
		Logs.take_log("TC4","play video Succesfful");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		System.out.println(">>>>>>>>>>>>>>>>>>Play Video---------------");
		//Thread.sleep(3000);
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\Playvideopage_02.png");
		
	try {
		WebElement play = driver.findElementByXPath("//div[@class='ytp-left-controls']//button[@class='ytp-play-button ytp-button ytp-play-button-playlist']");
		play.click();
		Logs.take_log("TC4","stop video Succesfful");
		}
		catch (Exception e)
	{
			e.printStackTrace();
	}
		
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\PlayStop_01.png");
//subscription video
	Thread.sleep(1000);
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\subscription_01.png");
			
		//WebElement sub = driver.findElementByXPath("//paper-button[contains(@aria-label,'Subscribe to')]");
		WebElement sub = driver.findElementByXPath("//ytd-subscribe-button-renderer[@class='style-scope ytd-video-secondary-info-renderer']");
		sub.click();
		Logs.take_log("TC4","subscription Succesfful");
		System.out.println(">>>>>>>>>>>>>>>>>>subscription Video---------------");
		Thread.sleep(1500);
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\subscription_02.png");
	
	
		Thread.sleep(1500);
		//WebElement sub2 = driver.findElementByXPath("//paper-button[contains(@aria-label,'Unsubscribe from')]");
		sub.click();
		Logs.take_log("TC4","unsubscribe Succesfful");
		Thread.sleep(1500);
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\subscription_03.png");	
	
//alert
	WebElement agg = driver.findElementByXPath("//yt-button-renderer[@id='confirm-button']");
	Thread.sleep(1500);
	ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\subscription_04.png");
	agg.click();
	Thread.sleep(1500);
	ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\subscription_05.png");

//Logout
System.out.println(">>>>>>>>>>>>>>>>>>Ready for Logout------------");
Logout_page out1 = new Logout_page(driver, pr);
out1.signout();
System.out.println(">>>>>>>>>>>>>>>>>>Logout Completed---------------");
		
	
}
	
//catch (Exception e)
//	{
 //e.printStackTrace();
//	}
//	}
}
