package org_testing_scripts_youtube;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org_testing_base.BasicInfo;
import org_testing_pages.Login_page;
import org_testing_pages.Logout_page;
import org_testing_utilities.ScreenShots;

public class TC2 extends BasicInfo
{
	
@Test	//Login + Subscription
	public void testcase2() throws Exception
	{
	/*	System.out.println("In testcase2 method");
		Login_page login2 = new Login_page(driver, pr);
		login2.signin("movik.saini.4u@gmail.com", "Vikas123$");*/

		System.out.println(">>>>>>>>>>>>>>>>>>Test Case2 Execution Started---------------");

//Login	
		System.out.println(">>>>>>>>>>>>>>>>>>Ready for Login---------------");
		Login_page login1 = new Login_page(driver, pr);
		login1.signin(pr.getProperty("username"), pr.getProperty("password"));
		System.out.println(">>>>>>>>>>>>>>>>>>Signup Successful---------------");		
		
		
//CLICK ON Subscription
			WebElement subs = driver.findElementByXPath("//span[text()='Subscriptions']");
			Thread.sleep(1500);
			ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\SubscriptionPage_01.png");			
			subs.click();
			Thread.sleep(1500);
			ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\SubscriptionPage_02.png");


	
//Logout
			System.out.println(">>>>>>>>>>>>>>>>>>Ready for Logout------------");
			Logout_page out1 = new Logout_page(driver, pr);
			out1.signout();
			System.out.println(">>>>>>>>>>>>>>>>>>Logout Completed---------------");

			
			
		System.out.println(">>>>>>>>>>>>>>>>>>Test Case2 Executed Successfully---------------");	
	
	
	
	}
	


}






