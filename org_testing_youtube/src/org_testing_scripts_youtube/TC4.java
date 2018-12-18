package org_testing_scripts_youtube;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org_testing_base.BasicInfo;
import org_testing_pages.Login_page;
import org_testing_pages.Logout_page;
import org_testing_utilities.ScreenShots;

public class TC4 extends BasicInfo
{
	

@Test	//Login + Trending Click
	public void testcase1() throws IOException, Exception
	{
	System.out.println(">>>>>>>>>>>>>>>>>>Test Case4 Execution Started---------------");
//Login	
		System.out.println(">>>>>>>>>>>>>>>>>>Ready for Login---------------");
		Login_page login1 = new Login_page(driver, pr);
		login1.signin(pr.getProperty("username"), pr.getProperty("password"));
		System.out.println(">>>>>>>>>>>>>>>>>>Signup Successful---------------");		
		
		
		
	////Play video
		driver.findElementByXPath("//span[text()='Vikas_Nov-2018']").click();
		System.out.println("PlayVideo-->" + driver.getCurrentUrl());
		Thread.sleep(1500);
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
	WebElement sub = driver.findElementByXPath("//paper-button[contains(@aria-label,'Subscribe to')]");
	sub.click();
	
	System.out.println(">>>>>>>>>>>>>>>>>>subscription Video---------------");
	Thread.sleep(1500);
	ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\subscription_02.png");
	
	
	Thread.sleep(1500);
	WebElement sub2 = driver.findElementByXPath("//paper-button[contains(@aria-label,'Unsubscribe from')]");
	sub2.click();
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
		
//paper-button   ///aria-label--> Subscribe to T-Series.
	
	}
}