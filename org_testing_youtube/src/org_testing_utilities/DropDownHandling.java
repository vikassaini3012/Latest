package org_testing_utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling 
{

	public static void dropdownselection(WebElement drop, String VisibleText)
	{
		Select s = new Select(drop);
		s.selectByVisibleText(VisibleText);
	}
	
}
