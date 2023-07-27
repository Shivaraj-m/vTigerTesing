package com.vtiger.test;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class vTigerHomePageTest extends BaseClass {
	public void HomePage() throws Throwable {
		loginPage elements=new loginPage(driver);
		elements.getUserName().clear();
		elements.getUserName().sendKeys(fileutil.readFromProoertyFile("UserName"));
		elements.getPassWord().clear();
		elements.getPassWord().sendKeys(fileutil.readFromProoertyFile("Password"));
		elements.getSignUpButton().submit();
		assertEquals(driver.getTitle(), fileutil.readFromProoertyFile("title"));
		Reporter.log("Expected result is pass", true);
	}
}
