package com.Genericfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser {
	public static WebDriver driver;
	
	public  boolean browserlaunching(String browser) {
		
		boolean status=true;
		
		
		
		switch (browser.toLowerCase()) {
		case ("ff"):
			 driver=new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
			
			break;
		case("IE"):
			driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		break;
		case("Chrome"):
			driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		default:
			break;
		}
		
		return status;
		
		
		
	}

}
