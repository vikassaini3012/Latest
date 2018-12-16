package org_testing_scripts_youtube;

import java.io.IOException;



import org.testng.annotations.Test;

import org_testing_base.BasicInfo;
import org_testing_pages.Login_page;
import org_testing_pages.Logout_page;
import org_testing_utilities.ScreenShots;

public class TC3 extends BasicInfo
{


@Test	//Login + Play + Trending
public void testcase1() throws IOException, Exception
{
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	

		System.out.println(">>>>>>>>>>>>>>>>>>Test Case3 Execution Started---------------");
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

					
//Like-Unlike video
					Thread.sleep(1500);
					ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\Like-Unlike_01.png");
					driver.findElementByXPath("//button[contains(@aria-label,'like this video')]").click();
					System.out.println(">>>>>>>>>>>>>>>>>>Like-Unlike Video---------------");
					Thread.sleep(1500);
					ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\Like-Unlike_02.png");

//Logout
		System.out.println(">>>>>>>>>>>>>>>>>>Ready for Logout------------");
		Logout_page out1 = new Logout_page(driver, pr);
		out1.signout();
		System.out.println(">>>>>>>>>>>>>>>>>>Logout Completed---------------");

		
		
System.out.println(">>>>>>>>>>>>>>>>>>Test Case3 Executed Successfully---------------");	

	
		

	}


}	

