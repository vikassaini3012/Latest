package org_testing_pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org_testing_base.BasicInfo;

public class Logout_page extends BasicInfo
{
	
	
	public ChromeDriver driver;  
	public Properties pr;
	
	public Logout_page(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	
	public void signout() throws IOException, Exception
	{
		
		
		//Logout process		
		System.out.println("---------Logout flow Started--------");
		Thread.sleep(3000);
		System.out.println("going to click signout");
		driver.findElementByXPath("//button[@id='avatar-btn']").click();
		driver.findElementByXPath("//yt-formatted-string[text()='Sign out']").click();
		Thread.sleep(10000);

	}
}