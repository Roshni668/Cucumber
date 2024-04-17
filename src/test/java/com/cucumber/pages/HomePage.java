package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class HomePage extends BasePage {
	static WebDriver driver;
	public HomePage(){
		super(driver=BaseTest.getDriver("Chrome"));
		addboject("UserMenu",By.id("userNavButton"));
		addboject("Logout",By.xpath("//a[contains(text(),'Logout')]"));
		addboject("DeveloperConsole", By.xpath("//a[contains(text(),'Developer Console')]"));
		addboject("mySetting", By.xpath("//a[contains(text(),'My Settings')]"));
		addboject("switchto", By.xpath("//a[@title='Switch to Lightning Experience']"));
		addboject("myProfile", By.xpath("//a[contains(text(),'My Profile')]"));
		addboject("EditProfile", By.xpath("//a[@class='contactInfoLaunch editLink']"));
		addboject("iframeditprofile", By.id("contactInfoContentId"));
		addboject("Abouttab",By.xpath("//a[contains(text(),'About')]"));
		addboject("Lastname",By.id("lastName"));
		addboject("SaveAll",By.xpath("//input[@value='Save All']"));
		addboject("Post",By.xpath("//a[@id='publisherAttachTextPost']"));
		addboject("Textarea",By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
		addboject("Share",By.id("publishersharebutton"));
		addboject("Postiframeditprofile",By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addboject("File",By.id("publisherAttachContentPost"));
		addboject("UploadFile",By.xpath("//a[@id='chatterUploadFileAction']"));
		addboject("Choosefile",By.xpath("//input[@id='chatterFile']"));
		addboject("Share",By.id("publishersharebutton"));
		addboject("Personal",By.id("PersonalInfo_font"));
		addboject("loginhistory",By.id("LoginHistory_font"));
		addboject("displaytab",By.id("DisplayAndLayout_font"));
		addboject("customizetab",By.id("CustomizeTabs_font"));
		addboject("Accounts",By.id("Account_Tab"));
		addboject("opportunity",By.xpath("//a[@title='Opportunities Tab']"));
		addboject("Leads",By.xpath("//a[@title='Leads Tab']"));
		addboject("contact", By.xpath("//a[@title='Contacts Tab']"));
	}
	

	
}
