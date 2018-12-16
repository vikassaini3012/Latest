package org_testing_scripts_youtube;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org_testing_base.BasicInfo;
import org_testing_pages.Login_page;
import org_testing_pages.Logout_page;
import org_testing_utilities.Logs;
import org_testing_utilities.ScreenShots;


public class TC1 extends BasicInfo

{
	
@Test	//Login + Trending Click
	public void testcase1() throws Exception
	{
		System.out.println(">>>>>>>>>>>>>>>>>>Test Case1 Execution Started---------------");

//Login	
		System.out.println(">>>>>>>>>>>>>>>>>>Ready for Login---------------");
		Login_page login1 = new Login_page(driver, pr);
		login1.signin(pr.getProperty("username"), pr.getProperty("password"));
		System.out.println(">>>>>>>>>>>>>>>>>>Signup Successful---------------");

		Logs.take_log("TC1","Login Succesfful");
		
		
//CLICK ON TRENDING
		System.out.println(">>>>>>>>>>>>>>>>>>Test Case1 Click on Trending---------------");
		WebElement trend = driver.findElementByXPath("//span[text()='Trending']");
		Thread.sleep(1500);
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\TrendingPage_01.png");
		trend.click();
		Thread.sleep(1500);
		ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\TrendingPage_02.png");
		//		Logs.get_logs("TC1", "Trending Page Completed");	

		Logs.take_log("TC1","Trending Succesfful");
//Logout
			System.out.println(">>>>>>>>>>>>>>>>>>Ready for Logout------------");
			Logout_page out1 = new Logout_page(driver, pr);
			out1.signout();
			System.out.println(">>>>>>>>>>>>>>>>>>Logout Completed---------------");

			
			
		System.out.println(">>>>>>>>>>>>>>>>>>Test Case1 Executed Successfully---------------");	
	}

}




