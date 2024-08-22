package com.navigationCommand;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class forwardURL {
	@Test
	public void navigateForward() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Chrome Driver Jars\\chromedriver.exe");
	       ChromeDriver  driver = new ChromeDriver();
	       driver.get("https://www.google.co.in");
	       driver.manage().window().maximize();
	       String URL = driver.getCurrentUrl();
	       System.out.println(URL);
	       
	       Thread.sleep(5000);
	       
	       driver.navigate().to("https://login.yahoo.com");
	       driver.navigate().back();
	       URL = driver.getCurrentUrl();
	       System.out.println(URL);
	       
	       Thread.sleep(5000);
	       
	       driver.navigate().forward();
	       URL = driver.getCurrentUrl();
	       System.out.println(URL);
	       
	       Thread.sleep(5000);
	       
	       driver.navigate().refresh();
	       driver.quit();
		
	}

}
