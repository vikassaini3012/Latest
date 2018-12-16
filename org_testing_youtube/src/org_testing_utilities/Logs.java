package org_testing_utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.DOMConfiguration;

public class Logs
{

	public static void take_log(String ClassName, String Message)
	{
	
		DOMConfigurator.configure("C:\\JavaTraining\\EclipseWorkSpace\\org_testing_youtube\\log_layout.xml");
		Logger l=Logger.getLogger(ClassName);
		l.info(Message);
	}
	
}
