package com.Scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagefactory.ToDoPageFac;

public class ScenarioThree {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		ToDoPageFac pf  = PageFactory.initElements(driver, ToDoPageFac.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.manage().window().maximize();
		
		//Scenario 3:
		pf.setSearchbox(pf.getSearchbox());
		//Thread.sleep(2000);
		if(pf.getCheck1().size() ==1 ) {
			System.out.println("only 1 result shown");
			}else {
			System.out.println("nah");
		}
		String text = "Showing 1 to 1 of 1 entries (filtered from 32 total entries)";
		if(pf.getVerify1().getText().equalsIgnoreCase(text)){
			System.out.println("only 1 result is shown");
				}else {
			System.out.println("different result");
		}
	Thread.sleep(3000);
	driver.quit();
	
}
	}

