package com.vtiger.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public fileUtils fileutil=new fileUtils();
	public WebDriver driver;
	public webDriverUtils wait=new webDriverUtils();
	@BeforeMethod
	public void beforConfigure() throws Throwable {
		String browserName=fileutil.readFromProoertyFile("browser");
		if (browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}else if (browserName.equals("edge")) {
			driver=new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.get(fileutil.readFromProoertyFile("url"));
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void afterConfigure() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
