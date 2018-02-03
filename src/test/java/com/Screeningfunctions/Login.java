package com.Screeningfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Genericfunctions.Launchbrowser;

public class Login extends Launchbrowser {
	///////UserName/////
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement Usernme;
	
	///password///////////
	@FindBy(how=How.ID,using="txtPassword")
	public static WebElement password;
	
	/////login button////
	@FindBy(how=How.ID,using="btnLogin")
	public static WebElement loginbutton;
	
	//Leave Tab /////////
	@FindBy(how=How.ID,using="menu_leave_viewLeaveModule")
	public static WebElement Leave_Tab;
	
	
	////////////From Date//////////
	@FindBy(how=How.ID,using="calFromDate")
	public static WebElement From_Date;
	
	
	public static boolean Pag_login(){
		
		
		boolean status=true;
		////////UserName action/
		Usernme.click();
		Usernme.clear();
		String UserName=GetCommanDataWithDbQuery("UserName");
		System.out.println("Username from Excel "+UserName);
		Usernme.sendKeys(UserName);
//		Usernme.sendKeys("user01");
		
		//////Password Action//////////////
		password.click();
		password.click();
		String psw=GetCommanDataWithDbQuery("Password");
//		password.sendKeys("pass1234");
		password.sendKeys(psw);
		
		//////////////Login Button Click/////////////
		loginbutton.click();
		
		/////////////Leave tab cclicking///////////////
		Leave_Tab.click();
		
		//////////From date field/////////
		From_Date.click();
		From_Date.clear();
		String date=GetCommanDataWithDbQuery("FromDate");
		From_Date.sendKeys(date);
//		From_Date.sendKeys("2018-01-03");
		
		return status;
		
	}

}
