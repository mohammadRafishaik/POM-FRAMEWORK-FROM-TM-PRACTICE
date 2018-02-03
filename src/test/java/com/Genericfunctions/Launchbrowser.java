package com.Genericfunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

public class Launchbrowser {
	public static WebDriver driver;
	
	public  boolean browserlaunching(String browser) {
		
		boolean status=true;
		
		
		
		switch (browser.toLowerCase()) {
		case ("ff"):
			 driver=new FirefoxDriver();
		String URL=GetCommanDataWithDbQuery("URL");
		System.out.println("  Value of query "+URL);
		driver.get(URL);
			
			break;
		case("IE"):
			driver.get("http://testingmasters.com/");
		break;
		case("Chrome"):
			driver.get("http://testingmasters.com/hrm/");
		default:
			break;
		}
		
		return status;
		
		
		
	}
public static String GetCommanDataWithDbQuery(String data) {

	//String strQuery="Select "+ data+"from CommonTestdata";
	String strQuery="Select "+ data+" from CommanData";
	Recordset recordset;
	String fetcheddata="";	
	try {
		recordset = TestNGLiseners.connection.executeQuery(strQuery);
		while(recordset.next())
		{
			System.out.println(recordset.getField(data));
			fetcheddata=recordset.getField(data);

	}
		recordset.close();

	}
		catch (FilloException e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	


	}

return fetcheddata;	
}

public static boolean getScreenshot(String name) {
	
	boolean status=true;
	try {
	TakesScreenshot tst=(TakesScreenshot) driver;
	File Src=tst.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Src, new File("./Screenshots/"+name+".png"));//(Src, "./Screenshots"+SCRNAME+".png");
	
	}
	catch (Exception e) {
		
		System.out.println("Screenshot As not getting");
	}
	//FileUtils.copyFile(Src, "./Screenshots/"+SCRNAME+".png");
	
	return status;
	
	
	
}
}
