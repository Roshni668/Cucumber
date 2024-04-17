package com.cucumber.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.cucumber.utilities.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected static WebDriver driver;
	
	static PropertiesFile prop=new PropertiesFile() ;
	
	public static void launchapplication(String browsername) throws IOException {
		driver=getDriver(browsername);
		String cucumbernurl=prop.getproperties("url");
		driver.get(cucumbernurl);
		
		}

	
	public static WebDriver getDriver(String browsername) {
		if(driver==null) {
			if(browsername.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			}
		
		return driver;
		
	}
}
