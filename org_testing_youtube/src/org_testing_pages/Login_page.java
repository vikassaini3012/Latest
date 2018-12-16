package org_testing_pages;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org_testing_base.BasicInfo;
import org_testing_utilities.ScreenShots;

public class Login_page extends BasicInfo

{
	public ChromeDriver driver;  
	public Properties pr;
	
	public Login_page(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}

	public void signin(String user, String password) throws IOException, Exception
	{
//Login process		
			System.out.println(">>>>>>>>>>>>>>>>>>Login Process Started----------");
			Thread.sleep(1500);			
			ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\SignUp_page.png");	
			WebElement signup = driver.findElementByXPath(pr.getProperty("signup"));	
			signup.click();			
//user tag by property	
			WebElement username = driver.findElement(By.id(pr.getProperty("usertag")));
			username.sendKeys(user);
			ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\UserNamePage.png");
			driver.findElement(By.id("identifierNext")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//password tag by property	
			WebElement pass = driver.findElementByXPath(pr.getProperty("pwdtag"));
			Thread.sleep(1500);
			pass.sendKeys(password);
			ScreenShots.takescreenshot(driver, "C:\\Users\\vikassai\\Desktop\\Screenshots\\PasswordPage.png");
			driver.findElement(By.id("passwordNext")).click();
			
	}
	
}
