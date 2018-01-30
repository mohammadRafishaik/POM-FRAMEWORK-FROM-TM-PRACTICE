package com.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Genericfunctions.Launchbrowser;
import com.Screeningfunctions.Login;

public class LoginTest extends Launchbrowser {
	@Test
	public static void User_Login() {
		
		
		try {
			Launchbrowser lb=new Launchbrowser();
			lb.browserlaunching("FF");
			System.out.println("page opened");
			Login ln=PageFactory.initElements(driver,Login.class);
			ln.Pag_login();
			
		} catch (Exception e) {
			
			System.out.println(" somthing rong at login test");
		}
		
	}

}
