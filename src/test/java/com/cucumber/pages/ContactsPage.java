package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class ContactsPage extends BasePage{
	static WebDriver driver;
	public ContactsPage() {
			super(driver=BaseTest.getDriver("Chrome"));
			addboject("contact", By.xpath("//a[@title='Contacts Tab']"));
	addboject("newbtn", By.xpath("//input[@value=' New ']"));
	addboject("lastname",By.id("name_lastcon2"));
	addboject("accname", By.id("con4"));
	addboject("save", By.xpath("//input[@title='Save']"));
	addboject("CreateNewView",By.xpath("//a[contains(text(),'Create New View')]"));
	addboject("ViewName", By.xpath("//input[@id='fname']"));
	addboject("ViewUniqueName", By.xpath("//input[@id='devname']"));
	addboject("Save",By.xpath("//input[@value=' Save ']"));
	addboject("RecentlyCreated", By.id("hotlist_mode"));
	addboject("viewDropdown",By.id("fcf"));
	addboject("recentcontact", By.xpath("//a[contains(text(),'Global Media, Indian')]"));
	addboject("newview", By.xpath("//a[contains(text(),'Create New View')]"));
	addboject("cancel", By.xpath("//input[@title='Cancel']"));
	addboject("SaveAndNew", By.xpath("//input[@title='Save & New']"));
	addboject("AccountName1",By.id("con4_lkwgt"));
	addboject("lastname1",By.xpath("//input[@id='name_lastcon2']"));
	}
}
//WebElement newbtn=driver.findElement(By.xpath("//input[@name='new']"));
//newbtn.click();
//WebElement lastname=driver.findElement(By.id("name_lastcon2"));
//lastname.sendKeys("Indian");
//WebElement accname=driver.findElement(By.id("con4"));
//accname.sendKeys("Global Media");
//WebElement save=driver.findElement(By.xpath("//input[@title='Save & New'] "));
//save.click();

