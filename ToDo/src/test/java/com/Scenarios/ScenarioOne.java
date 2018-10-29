package com.Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pagefactory.ToDoPageFac;


public class ScenarioOne {
	
	public static void main(String[] args) throws Throwable {
		
		//Scenario 1:
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			ToDoPageFac pf  = PageFactory.initElements(driver, ToDoPageFac.class);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
			driver.manage().window().maximize();
			pf.setInputtab();
			pf.setInputForm();
			pf.setSendbtn();
			boolean validation = pf.getVerify1().getText().isEmpty();
			Assert.assertTrue(validation, "contact page is succesfully loaded");
			driver.close();
			pf.setInputtab();
			pf.setInputForm();
			Thread.sleep(3000);
			driver.quit();
			
	}
}