package com.Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pagefactory.ToDoPageFac;

public class ScenarioTwo {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		ToDoPageFac pf  = PageFactory.initElements(driver, ToDoPageFac.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "https://www.seleniumeasy.com/test/input-form-demo.html";
		driver.get(URL);
		driver.manage().window().maximize();
				
		//Scenario 2:
		pf.setFirstname(pf.getFirstname());
		pf.setLastname(pf.getLastname());
		pf.setEmail(pf.getEmail());
		pf.setPhone(pf.getPhone());
		pf.setAddress(pf.getAddress());
		pf.setCity(pf.getCity());
		pf.setState(pf.getState());
		pf.setZip(pf.getZip());
		pf.setWebsite(pf.getWebsite());
		pf.setHosting(pf.getHosting());
		pf.setDesp(pf.getDesp());
		pf.setSendbtn();
	    
		if(driver.getCurrentUrl().equalsIgnoreCase(URL)) {
			System.out.println(driver.getCurrentUrl());
			System.out.println("information submitted and fails to navigate to next page");
		}else {
			System.out.println(driver.getCurrentUrl());
			System.out.println("information submitted and navigates to next page");
		}
		Thread.sleep(3000);
		driver.quit();
		 

	}

}
