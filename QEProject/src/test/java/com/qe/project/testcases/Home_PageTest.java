package com.qe.project.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;
import com.qe.project.pages.Home_Page;

public class Home_PageTest extends TestBase {


	Home_Page home_Page;

	@BeforeMethod
	public void setUp() {
		initialization();
		home_Page = new Home_Page();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
