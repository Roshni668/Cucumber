package com.cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LeadsPage extends BasePage {
	static WebDriver driver;
	public LeadsPage() {
			super(driver=BaseTest.getDriver("Chrome"));
	
	addboject("Leads",By.xpath("//a[@title='Leads Tab']"));
	addboject("leadsdrpwn",By.id("fcf"));
	addboject("UserMenu",By.id("userNavButton"));
	addboject("Logout",By.xpath("//a[contains(text(),'Logout')]"));
	addboject("newbtn",By.xpath("//input[@name='new']"));
	addboject("lastname", By.id("name_lastlea2"));
	addboject("company", By.id("lea3"));
	addboject("save", By.xpath("//input[@title='Save']"));
	}
}
//WebElement newbtn=driver.findElement(By.xpath("//input[@name='new']"));
//newbtn.click();
//WebElement lastname=driver.findElement(By.id("name_lastlea2"));
//lastname.sendKeys("ABCD");
//WebElement company=driver.findElement(By.id("lea3"));
//company.sendKeys("ABCD");
//WebElement save=driver.findElement(By.xpath("//input[@title='Save'] "));
//save.click();