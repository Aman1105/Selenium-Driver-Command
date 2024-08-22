package com.navigationCommand;

import org.openqa.selenium.chrome.ChromeDriver;

public class testNavigation {
     
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Chrome Driver Jars\\chromedriver.exe");
       ChromeDriver  driver = new ChromeDriver();
       driver.navigate().to("https://login.salesforce.com/?locale=in");
       driver.manage().window().maximize();
       
	}
	
}
