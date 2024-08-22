package com.BrowserCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testBrowserCommand {
	
	WebDriver driver;
	@Test
	public void BreowserCommandTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Chrome Driver Jars\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in ");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        
//        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
        
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        driver.quit();
	}

}
