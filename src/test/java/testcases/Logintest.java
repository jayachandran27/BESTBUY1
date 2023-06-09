package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Login;

public class Logintest extends Baseclass {

	
	@Test(priority = 1)
	public static void login() {

		Login lo = new Login(driver);
		lo.account();
		lo.login();
		lo.email(pro.getProperty("email"));
		lo.passwrd(pro.getProperty("password"));
		lo.submitbtn();
		getpagetitle();
		Assert.assertEquals(driver.getTitle(), "Sign In to Best Buy");
		
		
	}

	@Test(priority = 2)
	public void loginwithinvalid() {
		Login lo = new Login(driver);
		lo.account();
		lo.login();
		lo.email("c.jakash7@gmail.com");
		lo.passwrd("8tSMHd6AXQCn.RG");
		
		lo.submitbtn();
		getpagetitle();
		

	}

	
	}

